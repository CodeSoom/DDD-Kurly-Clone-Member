package com.kurly.member.service;

import com.kurly.member.dto.UserJoinRequestDto;
import com.kurly.member.dto.UserJoinResponseDto;
import com.kurly.member.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("UserService 클래스")
@DataJpaTest
class UserServiceImplTest {

    private UserService userService;

    @Autowired
    private  UserRepository userRepository;

   @BeforeEach
   void setUp() {
       userService = new UserServiceImpl(userRepository);
   }

   @Nested
   @DisplayName("create 메소드는")
   class Describe_create {

       @Nested
       @DisplayName("가입 할 사용자가 있을 경우에")
       class Context_exist_user {

           UserJoinRequestDto requestDto;

           @BeforeEach
           void join_prepare() {
               requestDto = UserJoinRequestDto.builder()
                       .userId("id1")
                       .password("pwd1")
                       .userEmail("mail@mail")
                       .userName("name1")
                       .userPhoneNumber("010")
                       .roadName("road1")
                       .detailedAddress("address1")
                       .build();
           }

           @Test
           @DisplayName("사용자를 저장 후 저장한 사용자를 리턴한다.")
           void It_save_return_user() {

               UserJoinResponseDto result = userService.createUser(requestDto);
               assertEquals(requestDto.getUserName(), result.getUserName());

           }

       }

   }

}
