package com.vistara.book.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class TicketBookingFailedException extends RuntimeException {
	private static final long serialVersionUID = 4213745465743382561L;

	public TicketBookingFailedException(String message) {
		super();
	}
}
