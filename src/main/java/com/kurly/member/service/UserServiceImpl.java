package com.kurly.member.service;

import com.kurly.member.domain.Address;
import com.kurly.member.domain.User;
import com.kurly.member.dto.UserJoinRequestDto;
import com.kurly.member.dto.UserJoinResponseDto;
import com.kurly.member.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    @Override
    public UserJoinResponseDto createUser(UserJoinRequestDto form) {

        User user = User.builder()
                .userId(form.getUserId())
                .userEmail(form.getUserEmail())
                .userName(form.getUserName())
                .userPhoneNumber(form.getUserPhoneNumber())
                .address(new Address(form.getRoadName(), form.getDetailedAddress()))
                .birth(form.getBirth())
                .gender(form.getGender())
                .additionalData(form.getAdditionalData())
                .build();
        user.createPassword(form.getPassword(), passwordEncoder);

        User createUser = userRepository.save(user);
        return new UserJoinResponseDto(createUser.getUserEmail(), createUser.getUserName());

    }

}
