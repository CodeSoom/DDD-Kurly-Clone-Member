package com.kurly.member.repository;

import com.kurly.member.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 사용자의 정보를 저장, 조회하는 저장소
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 사용자를 저장 후 저장된 사용자를 리턴합니다.
     * @param form 저장할 사용자 정보
     * @return 저장된 사용자
     */
    @Override
    User save(User form);

}
