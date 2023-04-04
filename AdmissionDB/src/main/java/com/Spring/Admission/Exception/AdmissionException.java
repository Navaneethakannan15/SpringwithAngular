package com.Spring.Admission.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class AdmissionException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AdmissionException(String message) {
		super(message);
	}

}
