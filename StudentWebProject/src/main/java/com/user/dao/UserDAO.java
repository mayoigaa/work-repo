package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.user.vo.LoginVO;
import com.userlist.vo.UserListVO1;

public class UserDAO {

//	public int loginCheck(LoginVO lv) {
//		
//		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//		String id = "root";
//		String pass = "1234";
//		String driver = "com.mysql.cj.jdbc.Driver";
//
//		//PreparedStatement psmt = null;
//		Statement st = null;
//		ResultSet rs = null;
//		
//		String pid = lv.getPid();
//		String ppass = lv.getPpass();
//		
//		System.out.println("pid : " + pid);
//		System.out.println("ppass : " + ppass);  //controller 에서 던진 값이 정상적인지
//		
//		int result =0;
//		
//		String sql = "select count(*) as cnt"
//				+ "  from com_user"
//				+ " where userid = '"+ pid +"' "
//				+ "   and userpw = sha2('"+ ppass +"', 256);";
//
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(url, id, pass);
//			st = con.createStatement();
//			rs = st.executeQuery(sql);
//			System.out.println(sql);  //sql 정상유무
//			
//			if(rs.next()) {
//				result = rs.getInt("cnt");
//				System.out.println("result : " + result);  //결과값 확인
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
	
	public int loginCheck(LoginVO lv) {
		
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pass = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";

		PreparedStatement psmt = null;
		//Statement st = null;
		ResultSet rs = null;
		
		String pid = lv.getPid();
		String ppass = lv.getPpass();
		
		System.out.println("pid : " + pid);
		System.out.println("ppass : " + ppass);  //controller 에서 던진 값이 정상적인지
		
		int result =0;
		
		String sql = "select count(*) as cnt"
				+ "  from com_user"
				+ " where userid = ? "
				+ "   and userpw = sha2( ?, 256);";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pass);
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, pid);
			psmt.setString(2, ppass);
			rs = psmt.executeQuery();
			System.out.println(sql);  //sql 정상유무
			
			if(rs.next()) {
				result = rs.getInt("cnt");
				System.out.println("result : " + result);  //결과값 확인
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<UserListVO1> getUserList(String sql_, String q) {
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pass = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";

		PreparedStatement psmt = null;
		//Statement st = null;
		ResultSet rs = null;

		String sql = "select cu.USERNO as userno,	"
				+ "	   cu.USERID as userid, "
				+ "	   cu.USERNM as usernm, "
				+ "	   ce.CODENM as userrole, "
				+ "	   cd.DEPTNM as dept "
				+ "  from com_user cu, "
				+ "  	   com_dept cd, "
				+ "  	   com_code ce "
				+ " where cu.DEPTNO = cd.DEPTNO "
				+ "   and cu.USERROLE = ce.CODECD ";
		
		sql = sql + sql_;
		
		
		List<UserListVO1>list = new ArrayList<UserListVO1>();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pass);
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1,"%" + q + "%");
			rs = psmt.executeQuery();
			System.out.println(sql);  //sql 정상유무
			
			while(rs.next()) {
				int userno = rs.getInt("userno");
				String userid = rs.getString("userid");
				String usernm = rs.getString("usernm");
				String userrole = rs.getString("userrole");
				String dept = rs.getString("dept");
				
				UserListVO1 uv = new UserListVO1(userno, userid, usernm, userrole, dept);
				
				list.add(uv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public UserListVO1 getUserInfo(LoginVO lv) {
		String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pass = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";

		PreparedStatement psmt = null;
		//Statement st = null;
		ResultSet rs = null;
		
		String sql = "select cu.USERNO as userno, "
				+ "		cu.USERID as userid, "
				+ "		cu.USERNM as usernm, "
				+ "		cu.DEPTNO as dept, "
				+ "		cu.USERROLE as userrole "
				+ "from com_user cu  "
				+ "where cu.USERID =? ";
		
		UserListVO1 uv = null;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pass);
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1,lv.getPid());
			rs = psmt.executeQuery();
			System.out.println(sql);  //sql 정상유무
			
			if(rs.next()) {
				int userno = rs.getInt("userno");
				String userid = rs.getString("userid");
				String usernm = rs.getString("usernm");
				String userrole = rs.getString("userrole");
				String dept = rs.getString("dept");
				
				uv = new UserListVO1(userno, userid, usernm, userrole, dept);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uv;
	}
}
