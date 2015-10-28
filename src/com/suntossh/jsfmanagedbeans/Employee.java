package com.suntossh.jsfmanagedbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Employee {

	private String empFirstName;
	private String empLastName;
	private String empCountryName;
	private String empLanguage;
	private String[] familyMembers;

	public Employee() {
		empFirstName = "ShantiDevi";
	}

	public String[] getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(String[] familyMembers) {
		this.familyMembers = familyMembers;
	}

	public String getEmpLanguage() {
		return empLanguage;
	}

	public void setEmpLanguage(String empLanguage) {
		this.empLanguage = empLanguage;
	}

	public String getEmpCountryName() {
		return empCountryName;
	}
	
	public void setEmpCountryName(String empCountryName) {
		this.empCountryName = empCountryName;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
}
