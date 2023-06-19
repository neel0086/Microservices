package com.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("ResourceNotFoundException");
    }
    public ResourceNotFoundException(String message) {
        super("ResourceNotFoundException");
    }
}
