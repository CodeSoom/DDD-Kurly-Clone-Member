package com.kurly.member.controller;

import com.kurly.member.errors.UserEmailDuplicatedException;
import com.kurly.member.errors.UserIdDuplicatedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class UserErrorController {

    @ExceptionHandler(UserIdDuplicatedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public UserIdDuplicatedException duplicatedIdException() {
        return new UserIdDuplicatedException("가입된 아이디가 이미 존재합니다.");
    }

    @ExceptionHandler(UserEmailDuplicatedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public UserEmailDuplicatedException duplicatedEmailException() {
        return new UserEmailDuplicatedException("가입된 이메일이 이미 존재합니다.");
    }

}
