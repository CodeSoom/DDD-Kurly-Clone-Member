package com.kurly.member.errors;

public class UserEmailDuplicatedException extends RuntimeException {
    public UserEmailDuplicatedException() {
    }

    public UserEmailDuplicatedException(String message) {
        super(message);
    }

}
