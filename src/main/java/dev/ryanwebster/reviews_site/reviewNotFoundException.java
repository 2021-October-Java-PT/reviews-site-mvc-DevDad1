package dev.ryanwebster.reviews_site;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="Bad Request, no review found")
public class reviewNotFoundException extends Exception {
}

