package com.mickey;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
//@ApplicationScoped
//@SessionScoped
@RequestScoped
public class StudentCounter {
	private int checkValue = 0;
	
	public int getCheckValue() {
		return checkValue;
	}

	public String checkValuePlus() {
		checkValue++;
		return "myresponse";
	}
	
}
