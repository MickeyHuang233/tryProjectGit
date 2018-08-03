package com.mickey;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

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
	
	public Student() {
		//countryﬂx??
		countryOptions = new ArrayList<String>();
		countryOptions.add("China");
		countryOptions.add("USA");
		countryOptions.add("UK");
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("SoundHorizon");
		countryOptions.add("Japan");
		
		//favoriteLanguageﬂx??
		favoriteLanguageOptions = new ArrayList<String>();
		favoriteLanguageOptions.add("Java");
		favoriteLanguageOptions.add("C#");
		favoriteLanguageOptions.add("Ruby");
		favoriteLanguageOptions.add("PHP");
		
		//hobbyﬂx??
		hobbyOptions = new ArrayList<String>();
		hobbyOptions.add("playBall");
		hobbyOptions.add("study");
		hobbyOptions.add("watchTV");
		hobbyOptions.add("computer");
		
		//?ì√ÊÀ¢–¬ƒ¨’Jﬂx??
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

	
	
}
