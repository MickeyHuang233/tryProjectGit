package com.mickey;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StudentBean {

	private String firstName;
	private String lastName;
	private String standard;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String createStudentForm() {
		System.out.println("Reading Student Details - Name: " + firstName + " " + lastName + ", Standard: " + standard);
		return "output";
	}
}
