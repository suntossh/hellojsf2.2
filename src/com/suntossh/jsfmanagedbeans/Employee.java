package com.suntossh.jsfmanagedbeans;

import javax.faces.bean.ManagedBean;

import org.springframework.web.client.RestTemplate;

import com.suntossh.restclient.vo.Quote;

@ManagedBean
public class Employee {

	private String empFirstName;
	private String empLastName;
	private String empCountryName;
	private String empLanguage;
	private String[] familyMembers;

	public Employee() {
		empFirstName = "ShantiDevi";
	   	System.out.println("Run in const Start");
    	RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        System.out.println("Run in const Finished");
        System.out.println(quote.toString());
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
