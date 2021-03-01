package com.jagdeesh.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressImpl implements Address {

	@Value("23")
	private String houseNumber;
	@Value("a")
	private String locality;
	@Value("b")
	private String state;
	@Value("c")
	private String country;

	@Override
	public String showAddress() {
		// TODO Auto-generated method stub
		return "Your address : " + getHouseNumber() + ", " + getLocality() + ", " + getState() + ", "
				+ getCountry();
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressImpl [houseNumber=" + houseNumber + ", locality=" + locality + ", state=" + state + ", country="
				+ country + "]";
	}
}
