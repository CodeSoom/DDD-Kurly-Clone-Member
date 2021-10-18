package com.kurly.member.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * 사용자 회원가입 전용 도메인
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserJoinDto {

    @NotEmpty(message = "아이디는 필수 입력 항목입니다.")
    private String userId;
    @NotEmpty(message = "비밀번호는 필수 입력 항목입니다.")
    private String password;
    @NotEmpty(message = "이메일은 필수 입력 항목입니다.")
    private String userEmail;
    @NotEmpty(message = "사용자 이름은 필수 입력 항목입니다.")
    private String userName;
    @NotEmpty(message = "사용자 휴대폰 번호는 필수 입력 항목입니다.")
    private String userPhoneNumber;
    @NotEmpty(message = "사용자 주소는 필수 입력 항목입니다.")
    private String roadName;
    @NotEmpty(message = "사용자 주소는 필수 입력 항목입니다.")
    private String detailedAddress;

    private String gender;
    private String birth;
    private String additionalData;

    @Builder
    public UserJoinDto(String userId, String password, String userEmail,
                       String userName, String userPhoneNumber, String roadName,
                       String detailedAddress, String gender, String birth, String additionalData) {
        this.userId = userId;
        this.password = password;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.roadName = roadName;
        this.detailedAddress = detailedAddress;
        this.gender = gender;
        this.birth = birth;
        this.additionalData = additionalData;
    }

}
