package com.amma.model;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
	
	@Id
	private String gmail;
	private String pass;
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
