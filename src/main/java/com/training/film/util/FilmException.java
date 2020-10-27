package com.training.film.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilmException extends Exception{

    private static final long serialVersionUID = 5615993727984575469L;
    private static final Logger log = LoggerFactory.getLogger(FilmException.class);
    
    public FilmException(String message) {
        super(message);
        log.debug(message);
    }
}