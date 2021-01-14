package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alln {
	
	@Id
	private int aid;
	private String aname;
	private String aemail;
	private int mobile;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Alln [aid=" + aid + ", aname=" + aname + ", aemail=" + aemail + ", mobile=" + mobile + "]";
	}

	

}
