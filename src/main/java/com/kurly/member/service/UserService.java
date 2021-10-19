package com.kurly.member.service;

import com.kurly.member.dto.UserJoinRequestDto;
import com.kurly.member.dto.UserJoinResponseDto;

/**
 * 사용자를 가입, 조회등 기능을 제공하는 서비스
 */
public interface UserService {

    /**
     * 사용자를 저장소에 저장 후 사용자의 메일, 이름만 담긴 응답 전용 도메인을 리턴합니다.
     * @param form 사용자 정보
     * @return 응답 전용 도메인
     */
    UserJoinResponseDto createUser(UserJoinRequestDto form);

    /**
     * 아이디 중복을 체크합니다.
     * @param userId 중복을 검증할 아이디
     * @return 중복일 경우 > true | 중복이 아닐경우 false
     */
    boolean joinIdCheck(String userId);

    /**
     * 이메일 중복을 체크합니다.
     * @param userEmail 중복을 검증할 이메일
     * @return 중복일 경우 > true | 중복이 아닐경우 false
     */
    boolean joinEmailCheck(String userEmail);

}
