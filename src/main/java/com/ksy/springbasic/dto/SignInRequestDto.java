package com.ksy.springbasic.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequestDto {

    @NotBlank
    private String userId;
    @NotBlank
    private String password;

}
