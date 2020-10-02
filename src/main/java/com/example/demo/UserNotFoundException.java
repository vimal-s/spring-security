package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String username) {
        super("User not found with username: " + username);
    }

    public UserNotFoundException(Long userId) {
        super("User not found with id: " + userId);
    }
}
