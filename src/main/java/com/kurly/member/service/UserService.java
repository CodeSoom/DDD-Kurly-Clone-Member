package com.kurly.member.service;

import com.kurly.member.dto.UserJoinDto;
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
    UserJoinResponseDto createUser(UserJoinDto form);

}
