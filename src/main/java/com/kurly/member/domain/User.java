package com.kurly.member.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 저장소에 쓰이는 사용자 핵심 도메인
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;
    private String password;
    private String userEmail;
    private String userName;
    private String userPhoneNumber;

    @Embedded
    private Address address;

    private String gender;
    private String birth;
    private String additionalData;

    @Builder
    public User(String userId, String password, String userEmail, String userName,
                String userPhoneNumber, Address address, String gender,
                String birth, String additionalData) {
        this.userId = userId;
        this.password = password;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.address = address;
        this.gender = gender;
        this.birth = birth;
        this.additionalData = additionalData;
    }

}
