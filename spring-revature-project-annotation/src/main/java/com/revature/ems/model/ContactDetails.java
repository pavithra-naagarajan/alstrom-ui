package com.revature.ems.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ContactDetails {
	private String mobileNumber;
	private String AlternateMobileNumber;
	private String spouseNumber;

	public ContactDetails() {

	}

	public ContactDetails(String mobileNumber, String alternateMobileNumber, String spouseNumber) {
		super();
		this.mobileNumber = mobileNumber;
		AlternateMobileNumber = alternateMobileNumber;
		this.spouseNumber = spouseNumber;
	}

	@PostConstruct
	public void ContactDetailsInit() {
System.out.println("ContactDetailsInit called!");
	}
	
	@PreDestroy
	public void ContactDetailsDestroy() {
System.out.println("ContactDetailsDestroy called!");
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateMobileNumber() {
		return AlternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		AlternateMobileNumber = alternateMobileNumber;
	}

	public String getSpouseNumber() {
		return spouseNumber;
	}

	public void setSpouseNumber(String spouseNumber) {
		this.spouseNumber = spouseNumber;
	}

	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", AlternateMobileNumber=" + AlternateMobileNumber
				+ ", spouseNumber=" + spouseNumber + "]";
	}

}
