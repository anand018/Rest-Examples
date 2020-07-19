package com.vistara.book.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_MODIFIED)
public class CancellationFailedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CancellationFailedException(String message) {
		super();
	}

}
