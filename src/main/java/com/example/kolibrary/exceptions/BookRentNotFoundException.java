package com.example.kolibrary.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Book Rent not found")
public class BookRentNotFoundException extends RuntimeException {
}
