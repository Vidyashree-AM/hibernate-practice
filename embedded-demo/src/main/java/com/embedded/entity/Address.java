package com.embedded.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String addressLine1;
	private String addressLine2;
	
	private String City;
	private String State;
	private String Country;
	
	public Address() {
		super();
	}

	public Address(String addressLine1, String addressLine2, String city, String state, String country) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		City = city;
		State = state;
		Country = country;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

}
