package com.kurly.member.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * 회원의 주소 도메인
 */
@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {

    private String roadName;
    private String detailedAddress;

    public Address(String roadName, String detailedAddress) {
        this.roadName = roadName;
        this.detailedAddress = detailedAddress;
    }

}
