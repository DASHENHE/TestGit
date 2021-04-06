package com.hopu.model;

import java.io.Serializable;


public class Dept implements Serializable {
	private Integer did;
	private String dname;
	private String dremark;

	public Dept(){
	}

	public Dept(Integer did,String dname,String dremark){
		this.did = did;
		this.dname = dname;
		this.dremark = dremark;
	}
	@Override
	public String toString(){
		return "did=" + did + 
		",dname=" + dname + 
		",dremark=" + dremark;
	}
	public void setDid(Integer did){
		this.did=did;
	}

	public Integer getDid(){
		return did;
	}

	public void setDname(String dname){
		this.dname=dname;
	}

	public String getDname(){
		return dname;
	}

	public void setDremark(String dremark){
		this.dremark=dremark;
	}

	public String getDremark(){
		return dremark;
	}

}

