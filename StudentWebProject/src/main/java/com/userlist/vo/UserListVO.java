package com.userlist.vo;

public class UserListVO {
 private int num;
 private String uid;
 private String upwd;
 public UserListVO() {
	 
 }
 
 public UserListVO(int num, String uid, String upwd) {
	 this.num = num;
		this.uid = uid;
		this.upwd = upwd;
		
	 
 }
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
 
 
}
