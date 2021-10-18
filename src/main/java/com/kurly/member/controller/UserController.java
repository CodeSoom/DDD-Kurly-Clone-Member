package com.kurly.member.controller;

import com.kurly.member.dto.UserJoinDto;
import com.kurly.member.dto.UserJoinResponseDto;
import com.kurly.member.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 사용자의 HTTP 요청을 처리하는 클래스
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/kurly/member")
public class UserController {

    private final UserService userService;

    /**
     * 사용자를 생성하고 응답 도메인과 201 상태코드를 반환합니다.
     * @param form 사용자 정보
     * @return 응답 도메인
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserJoinResponseDto createUser(@RequestBody @Valid UserJoinDto form) {

        UserJoinResponseDto responseUser = userService.createUser(form);
        return responseUser;

    }


}
