package com.vistara.book.dto;

public class BookingInfoDTO {

	private String passengerFirstName;
	private String passengerLastName;
	private String contactNo;
	private String PAN;
	private String address;

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BookingInfoDTO [passengerFirstName=" + passengerFirstName + ", passengerLastName=" + passengerLastName
				+ ", contactNo=" + contactNo + ", PAN=" + PAN + ", address=" + address + "]";
	}

}
