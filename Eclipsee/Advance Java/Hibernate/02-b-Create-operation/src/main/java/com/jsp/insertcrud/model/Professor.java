package com.jsp.insertcrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
	@Id
	private int pid;
	private String pname;
	private String psub;
	private String pcity; 
	private double psal;
	public Professor() {
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPsub() {
		return psub;
	}
	public void setPsub(String psub) {
		this.psub = psub;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	public double getPsal() {
		return psal;
	}
	public void setPsal(double psal) {
		this.psal = psal;
	}
	
	
	
	

}
