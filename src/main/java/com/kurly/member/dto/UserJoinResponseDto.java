package com.kurly.member.dto;

import lombok.Getter;

/**
 * 회원가입에 성공 시 응답하는 도메인
 */
@Getter
public class UserJoinResponseDto {

    private String userEmail;
    private String userName;

    public UserJoinResponseDto(String userEmail, String userName) {
        this.userEmail = userEmail;
        this.userName = userName;
    }

}
