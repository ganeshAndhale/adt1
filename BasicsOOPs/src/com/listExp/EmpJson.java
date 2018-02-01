package com.listExp;

public class EmpJson {
	
	private int id;
	private String name;
	private long doj;
	private String gender;
	private long mob;
	private String email;
	private String etype;
	private String qual;
	private String acc;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDoj() {
		return doj;
	}
	public void setDoj(long doj) {
		this.doj = doj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	
	@Override
	public String toString() {
	    return "emp No: " + this.getId() + 
	           ", enp Name: " + this.getName() +", emp pos: " + this.getAcc()+ ", date of joining: " + this.getDoj() + ", email: " + this.getEmail() + 
	           ", Gender: " + this.getGender() + ", qualification: " + this.getQual() +", E Type: " + this.getEtype() + ", Mobile: " + this.getMob();
	}
		
}
