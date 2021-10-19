package com.kurly.member.controller;

import com.kurly.member.dto.UserJoinRequestDto;
import com.kurly.member.dto.UserJoinResponseDto;
import com.kurly.member.errors.UserEmailDuplicatedException;
import com.kurly.member.errors.UserIdDuplicatedException;
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
public class
UserController {

    private final UserService userService;

    /**
     * 사용자를 생성하고 응답 도메인과 201 상태코드를 반환합니다.
     * @param form 사용자 정보
     * @return 응답 도메인
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserJoinResponseDto createUser(@RequestBody @Valid UserJoinRequestDto form) {

        UserJoinResponseDto responseUser = userService.createUser(form);
        return responseUser;

    }

    /**
     * 회원가입 아이디를 중복체크 합니다.
     * @param userId 중복을 확인할 Id
     * @return 중복인 경우(true) > 예외발생 | 사용 가능한경우(false)
     */
    @PostMapping("/checked_id")
    public boolean checkId(@RequestParam("userId") String userId) {

        if(userService.joinIdCheck(userId)) {
            throw new UserIdDuplicatedException();
        }

        return false;
    }

    /**
     * 회원가입 이메일을 중복체크 합니다.
     * @param userEmail 중복을 확인할 Email
     * @return 중복인 경우(true) > 예외발생 | 사용 가능한경우(false)
     */
    @PostMapping("/checked_email")
    public boolean checkEmail(@RequestParam("userEmail") String userEmail) {

        if (userService.joinEmailCheck(userEmail)) {
            throw new UserEmailDuplicatedException();
        }

        return false;
    }

}
