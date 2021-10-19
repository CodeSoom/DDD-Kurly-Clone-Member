package com.kurly.member.errors;

public class UserIdDuplicatedException extends RuntimeException {
    public UserIdDuplicatedException() {
    }

    public UserIdDuplicatedException(String message) {
        super(message);
    }

}
