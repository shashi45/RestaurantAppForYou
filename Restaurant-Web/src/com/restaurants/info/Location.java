package com.restaurants.info;

import javax.persistence.Entity;

public class Location {

	String street;
	String city;
	String state;
	Integer zipCode;
	String contactDetails;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}

}
