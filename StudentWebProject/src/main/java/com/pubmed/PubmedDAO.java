package com.pubmed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.board.vo.BoardListVO;
import com.web.connection.ConnectionProvider;
import com.web.connection.JdbcUtil;

public class PubmedDAO {

	public List<PubmedVO> getPubmedList(String g, String q) {
		
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql ="select journal_nm ,issn,id "
				+ "from journal_impact " ;
		
		if( g != null) {
			sql = sql + g;
		}else {
			sql = sql;
		}
		
		List<PubmedVO>list = new ArrayList<PubmedVO>();
		
		try {
			con = ConnectionProvider.getConnection();
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "%" + q + "%");
			rs = psmt.executeQuery();
			System.out.println(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String jnm = rs.getString("journal_nm");
				String isn = rs.getString("issn");
				
				PubmedVO pv = new PubmedVO(id,jnm,isn);
				list.add(pv);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);
		return list;
	}

	public PubmedVO getPubmedDetail(int param) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select journal_nm as jnm, "
				+ "		issn as isn "
				+ "		from journal_impact ";
		
		PubmedVO pd = null;
		
		try {
			con = ConnectionProvider.getConnection();
			psmt = con.prepareStatement(sql);
			//psmt.setInt(1, param);
			rs = psmt.executeQuery();
			System.out.println(sql); // sql 정상유무

			if (rs.next()) {
				int id = rs.getInt("id");
				String jnm = rs.getString("jnm");
				String isn = rs.getString("isn");

				pd = new PubmedVO(id,jnm, isn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		JdbcUtil.close(rs);
		JdbcUtil.close(psmt);
		JdbcUtil.close(con);
		
		return pd;
	}

	
}
