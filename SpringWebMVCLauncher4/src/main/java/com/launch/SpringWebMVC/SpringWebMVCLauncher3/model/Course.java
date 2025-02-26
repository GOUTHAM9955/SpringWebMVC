package com.launch.SpringWebMVC.SpringWebMVCLauncher3.model;

public class Course {
	private Integer cid;
	private String cname;
	private double price;
	
	
	
	public Course(Integer cid, String cname, double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}



	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}

	
	
}
