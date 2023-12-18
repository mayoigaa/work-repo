package com.pubmed;

public class PubmedVO {
	int id;
	String jnm;
	String isn;
	
	
	public PubmedVO() {
		
	}
	
	
	public PubmedVO(int id, String jnm, String isn) {
		this.id = id;
		this.jnm = jnm;
		this.isn = isn;
	}
	public String getJnm() {
		return jnm;
	}
	public void setJnm(String jnm) {
		this.jnm = jnm;
	}
	public String getIsn() {
		return isn;
	}
	public void setIsn(String isn) {
		this.isn = isn;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
