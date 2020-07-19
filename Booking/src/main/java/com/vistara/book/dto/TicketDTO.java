package com.vistara.book.dto;

public class TicketDTO {

	private String bookingReferenceId;
	private String ticketNumber;
	private String status;
	private String fare;

	public String getBookingReferenceId() {
		return bookingReferenceId;
	}

	public void setBookingReferenceId(String bookingReferenceId) {
		this.bookingReferenceId = bookingReferenceId;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "TicketDTO [bookingReferenceId=" + bookingReferenceId + ", ticketNumber=" + ticketNumber + ", status="
				+ status + ", fare=" + fare + "]";
	}

}
