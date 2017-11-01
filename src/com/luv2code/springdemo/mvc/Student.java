package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student 
{
	
	public Student()
	{
		// populate the countryOptions Map
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("RS", "Russia");
		countryOptions.put("CH", "China");
	}
	
	private String firstName;
	private String lastName;
	private String country;
	private String yourFavoriteLanguage;
	private String[] yourFavoriteOs;
	
	private LinkedHashMap<String, String> countryOptions;
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getYourFavoriteLanguage() {
		return yourFavoriteLanguage;
	}
	public void setYourFavoriteLanguage(String yourFavoriteLanguage) {
		this.yourFavoriteLanguage = yourFavoriteLanguage;
	}
	public String[] getYourFavoriteOs() {
		return yourFavoriteOs;
	}
	public void setYourFavoriteOs(String[] yourFavoriteOs) {
		this.yourFavoriteOs = yourFavoriteOs;
	}

}
