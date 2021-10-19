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

    /**
     * 저장소에 사용자 아이디가 존재하는지 확인합니다.
     * @param userId 조회할 아이디
     * @return 존재할 경우 > true | 존재하지 않을경우 > false
     */
    boolean existsByUserId(String userId);

    /**
     * 저장소에 사용자 이메일이 존재하는지 확인합니다.
     * @param userEmail 조회할 이메일
     * @return 존재할 경우 > true | 존재하지 않을경우 > false
     */
    boolean existsByUserEmail(String userEmail);

}
