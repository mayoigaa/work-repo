package com.board.vo;

import java.util.Date;

public class BoardListVO {
	private int brdno;
	private String title;
	private String memo;
	private String user;
	private Date regdate;
	
	public BoardListVO() {
		
	}
	
	

	public BoardListVO(int brdno, String title, String memo, String user, Date regdate) {
		super();
		this.brdno = brdno;
		this.title = title;
		this.memo = memo;
		this.user = user;
		this.regdate = regdate;
	}
	
	public int getBrdno() {
		return brdno;
	}
	
	public void setBrdno(int brdno) {
		this.brdno = brdno;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
}
