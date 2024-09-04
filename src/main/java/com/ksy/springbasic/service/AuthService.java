package com.ksy.springbasic.service;

import com.ksy.springbasic.dto.PostUserRequestDto;
import com.ksy.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}
