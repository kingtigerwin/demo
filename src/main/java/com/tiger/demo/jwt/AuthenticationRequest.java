package com.tiger.demo.jwt;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String username;
    private String password;
}
