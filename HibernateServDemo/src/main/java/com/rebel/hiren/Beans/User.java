package com.rebel.hiren.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User 
{
	@Id
	private int uId;
	private String uName;
	private String uAdd;
	private int uPhone;
	
	public User() {}
	
	public User(int uId, String uName, String uAdd, int uPhone) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uAdd = uAdd;
		this.uPhone = uPhone;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuAdd() {
		return uAdd;
	}

	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}

	public int getuPhone() {
		return uPhone;
	}

	public void setuPhone(int uPhone) {
		this.uPhone = uPhone;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uAdd=" + uAdd + ", uPhone=" + uPhone + "]";
	}
	
	
	

}
