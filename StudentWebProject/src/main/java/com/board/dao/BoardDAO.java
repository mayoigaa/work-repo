package com.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.board.vo.BoardListVO;
import com.board.vo.BoardRegeditVO;
import com.web.connection.ConnectionProvider;
import com.web.connection.JdbcUtil;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardListVO> getBoardList(int p, String g, String q) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		int start = 1 + (p-1)*10;
		int end = p*10;
		
		String sql = "select * "
                + "from(select @rownum:=@rownum+1 as num, n.*"
                + "          from (select tb.brdno as brdno,  "
                + "                       tb.brdtitle as title, "
                + "                       tb.brdmemo as memo,  "
                + "                       cu.usernm as user, "
                + "                       tb.brddate as regdate  "
                + "                  from tbl_board tb,  "
                + "                       com_user cu "
                + "                 where tb.userno = cu.userno  "
                + "                   and tb.BRDDELETEFLAG = 'N'";
                
                
        String sql1 = "                 order by regdate desc)n"
                + "        where (@rownum:=0)=0)num     "
                + "where num.num between ? and ?";

		if (g != null) {
			sql = sql + g + sql1;
		} else {
			sql = sql + sql1;
		}
		// + " and tb."+f+" like ? ";
		List<BoardListVO> list = new ArrayList<>();
		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "%" + q + "%");
			psmt.setInt(2, start);
			psmt.setInt(3, end);
			rs = psmt.executeQuery();
			System.out.println(sql); // sql 정상유무

			while (rs.next()) {
				int brdno = rs.getInt("brdno");
				String title = rs.getString("title");
				String memo = rs.getString("memo");
				String user = rs.getString("user");
				Date regdate = rs.getDate("regdate");

				BoardListVO bv = new BoardListVO(brdno, title, memo, user, regdate);
				list.add(bv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);

		return list;
	}

	public BoardListVO getBoardDetail(int param) {
		Connection con = null;
		PreparedStatement psmt = null;
		// Statement st = null;
		ResultSet rs = null;

		String sql = "select tb.BRDNO as brdno, " + "			 cu.USERNM as user, "
				+ "			 tb.BRDTITLE as title, " + "			 tb.BRDDATE as regdate, "
				+ "			 tb.BRDMEMO as memo " + "		from tbl_board tb, " + "			 com_user cu "
				+ " where tb.BRDNO = ? " + "   and tb.USERNO =  cu.USERNO ";

		BoardListVO bv = null;

		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, param);
			rs = psmt.executeQuery();
			System.out.println(sql); // sql 정상유무

			if (rs.next()) {
				int brdno = rs.getInt("brdno");
				String title = rs.getString("title");
				String memo = rs.getString("memo");
				String user = rs.getString("user");
				Date regdate = rs.getDate("regdate");

				bv = new BoardListVO(brdno, title, memo, user, regdate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);

		return bv;
	}

	public int regeditBoard(BoardRegeditVO bv) {
		Connection con = null;
		PreparedStatement psmt = null;
		// Statement st = null;
		ResultSet rs = null;
		String sql = "insert into tbl_board "
				+ "(BGNO, BRDTITLE, BRDMEMO, USERNO, BRDDATE, LASTDATE, LASTUSERNO,BRDDELETEFLAG)"
				+ "values(3,  "
				+ "	   ?,"
				+ "	   ? , "
				+ "	   (select USERNO "
				+ "	      from com_user"
				+ "	     where USERID = ?), "
				+ "	   now(), "
				+ "	   now(), "
				+ "	    (select USERNO "
				+ "	      from com_user"
				+ "	     where USERID = ?), 		"
				+ "	   'N')	";
		int result = 0;
		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			String title = bv.getTitle(); // BRDTITLE
			String memo = bv.getMemo();
			String userId = bv.getUser(); // USERNO, LASTUSERNO

			psmt.setString(1, title);
			psmt.setString(2, memo);
			psmt.setString(3, userId);
			psmt.setString(4, userId);

			result = psmt.executeUpdate();
			System.out.println(sql); // sql 정상유무
		} catch (Exception e) {
			e.printStackTrace();
		}

		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);

		return result;
	}

	public int deleteBoard(String brdno) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = " update tbl_board "
				+ " 	set BRDDELETEFLAG = 'Y' "
				+ "   where brdno = ? ";
		int result = 0;
		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			
			System.out.println("dao brdno : "+brdno);
			
			int no = Integer.parseInt(brdno);
			
			psmt.setInt(1, no);
			result = psmt.executeUpdate();
			System.out.println(sql); // sql 정상유무
		} catch (Exception e) {
			e.printStackTrace();
		}

		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);

		return result;
	}

	public int getBoardListCount(String g, String q) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		 String sql = "select count(*) as cnt " 
	                + "        from tbl_board tb, " 
	                + "             com_user cu "
	                + "       where tb.userno = cu.userno  "
	                + "         and tb.BRDDELETEFLAG = 'N' ";

		if (g != null) {
			sql = sql + g;
		} else {
			sql = sql;
		}
		
		int cnt = 0;
		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "%" + q + "%");
			rs = psmt.executeQuery();
			System.out.println(sql); // sql 정상유무

		if (rs.next()) {
				cnt = rs.getInt("cnt");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);

		return cnt;
	}

	
	public int updateBoard(BoardRegeditVO bv) {
        Connection con = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String sql = "update tbl_board set BRDTITLE = ? , "
                + "                           BRDMEMO = ?  , LASTUSERNO = (SELECT USERNO "
                + "                                                         FROM com_user "
                + "                                                        WHERE USERID = ? ) ,"
                + "                           LASTDATE = NOW() "
                + "      where BRDNO = ? ";
        int result = 0;
        try {
            con = ConnectionProvider.getConnection();
            psmt = con.prepareStatement(sql);
            String title = bv.getTitle(); // BRDTITLE
            String memo = bv.getMemo();
            String userId = bv.getUser(); // USERNO, LASTUSERNO
            int brdno = bv.getBrdno(); //brdno
            
            psmt.setString(1, title);
            psmt.setString(2, memo);
            psmt.setString(3, userId);
            psmt.setInt(4, brdno);
            
            result = psmt.executeUpdate();
            System.out.println(sql); // sql 정상유무
        } catch (Exception e) {
            e.printStackTrace();
        }

        JdbcUtil.close(rs);
        JdbcUtil.close(psmt);
        JdbcUtil.close(con);

        return result;
    }

	
}
