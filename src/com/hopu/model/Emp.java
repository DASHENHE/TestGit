package com.hopu.model;

import java.io.Serializable;


public class Emp implements Serializable {
	private Integer eid;
	private String ename;
	private String esex;
	private Integer eage;
	private String ebirthday;
	private Integer ephone;
	private String eaddress;
	private Integer did;
	private Dept dept;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getEbirthday() {
		return ebirthday;
	}
	public void setEbirthday(String ebirthday) {
		this.ebirthday = ebirthday;
	}
	public Integer getEphone() {
		return ephone;
	}
	public void setEphone(Integer ephone) {
		this.ephone = ephone;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esex=" + esex + ", eage=" + eage + ", ebirthday=" + ebirthday
				+ ", ephone=" + ephone + ", eaddress=" + eaddress + ", did=" + did + ", dept=" + dept + "]";
	}
	public Emp(Integer eid, String ename, String esex, Integer eage, String ebirthday, Integer ephone, String eaddress,
			Integer did, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.eage = eage;
		this.ebirthday = ebirthday;
		this.ephone = ephone;
		this.eaddress = eaddress;
		this.did = did;
		this.dept = dept;
	}
	public Emp() {
		super();
	}

	
}

