package com.example.kolibrary.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Not found")
public class BookRentInfoNotFoundException extends RuntimeException {
}
