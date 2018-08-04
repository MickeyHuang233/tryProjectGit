package com.mickey;


import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String password;
	private String country;
	private String favoriteLanguage;
	private String[] hobby;
	List<String> countryOptions;
	List<String> favoriteLanguageOptions;
	List<String> hobbyOptions;
	private String somethingSay;
	private String courseCode;
	
	public Student() {
		//countryßx??
		countryOptions = new ArrayList<String>();
		countryOptions.add("China");
		countryOptions.add("USA");
		countryOptions.add("UK");
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("SoundHorizon");
		countryOptions.add("Japan");
		
		//favoriteLanguageßx??
		favoriteLanguageOptions = new ArrayList<String>();
		favoriteLanguageOptions.add("Java");
		favoriteLanguageOptions.add("C#");
		favoriteLanguageOptions.add("Ruby");
		favoriteLanguageOptions.add("PHP");
		
		//hobbyßx??
		hobbyOptions = new ArrayList<String>();
		hobbyOptions.add("playBall");
		hobbyOptions.add("study");
		hobbyOptions.add("watchTV");
		hobbyOptions.add("computer");
		
		//?“ÃæË¢ÐÂÄ¬ÕJßx??
		this.firstName = "USAKi";
		country = "Japan";
		favoriteLanguage = "Java";
		String[] temphobby = {"playBall", "computer"};
		hobby = temphobby;
		
	}
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}
	
	public List<String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	
	public List<String> getHobbyOptions() {
		return hobbyOptions;
	}

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
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getSomethingSay() {
		return somethingSay;
	}

	public void setSomethingSay(String somethingSay) {
		this.somethingSay = somethingSay;
	}
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	//¿ÍÑu»¯ß‰Ý‹
	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		if(value ==null) {
			return;
		}
		String data = value.toString();
		if(!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Course code must start with LUV");
			throw new ValidatorException(message);
		}
	}
	
}
