package com.vistara.book.exceptions.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vistara.book.exceptions.CancellationFailedException;
import com.vistara.book.exceptions.CustomErrorResponse;
import com.vistara.book.exceptions.TicketBookingFailedException;

@RestControllerAdvice
public class CustomExceptionAdvice {

	@ExceptionHandler(value = TicketBookingFailedException.class)
	public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(TicketBookingFailedException e) {

		CustomErrorResponse error = new CustomErrorResponse("Ticket Booking failed due to some reason", e.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = CancellationFailedException.class)
	public ResponseEntity<CustomErrorResponse> cancellationFailedException(CancellationFailedException e) {

		CustomErrorResponse error = new CustomErrorResponse("Ticket Cancellation failed", e.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		error.setStatus((HttpStatus.NOT_FOUND.value()));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}

}
