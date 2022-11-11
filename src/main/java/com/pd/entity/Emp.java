package com.pd.entity;

public class Emp {

	String ename;
	int eid;
	public Emp(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", eid=" + eid + "]";
	}
	
}
