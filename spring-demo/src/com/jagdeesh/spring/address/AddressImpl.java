package com.jagdeesh.spring.address;

public class AddressImpl implements Address {

	private String houseNumber;
	private String locality;
	private String state;
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
