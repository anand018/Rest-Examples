package com.vistara.book.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vistara.book.dto.BookingInfoDTO;
import com.vistara.book.dto.TicketDTO;
import com.vistara.book.exceptions.CancellationFailedException;
import com.vistara.book.exceptions.TicketBookingFailedException;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/airline/bookings/ticket-booking/api")
public class Booking {

	@RequestMapping(value = "/booking/{id}", method = RequestMethod.POST)
	public String bookTicket(@PathVariable("id") String id) {
		return "Ticket booked with Id: " + id;
	}

	@RequestMapping(value = "/cancel/{id}/{name}/{contactNo}", method = RequestMethod.PUT)
	public String cancelTicket(@PathVariable("id") String id, @PathVariable("name") String name,
			@PathVariable("contactNo") String contactNo) {
		// String message = "Ticket got cancelled with ID: " + id;
		throw new CancellationFailedException("Cancellation faied due to some issue");
	}

	@PostMapping("/booking")
	public TicketDTO bookTickets(@RequestBody BookingInfoDTO bookingInfoDTO) {
		TicketDTO ticketDto = new TicketDTO();

		ticketDto.setBookingReferenceId(UUID.randomUUID().toString());
		ticketDto.setFare("5000");
		ticketDto.setStatus("Confirm");
		ticketDto.setTicketNumber("ERTY213435");
		throw new TicketBookingFailedException("Failed to book ticket");

		// return ticketDto;
	}

}
