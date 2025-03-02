package com.launch.SpringWebMVC.SpringWebMVCLauncher3.model;

public class Employee {
	
	private Integer eId;
	
	private String eName;
	
	private String eCity;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public Employee(Integer eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eCity=" + eCity + "]";
	}
	
	
}
