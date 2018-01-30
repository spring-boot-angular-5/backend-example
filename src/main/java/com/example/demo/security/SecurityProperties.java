package com.example.demo.security;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class SecurityProperties {
    private String secret = "SecretKeyToGenJWTs";
    private long expirationTime = 864_000_000; // 10 days
    private String tokenPrefix = "Bearer ";
    private String headerString = "Authorization";
}
