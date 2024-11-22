package com.spring.Application.Service;

import com.spring.Application.Util.JwtUtil;  
import com.spring.Application.Model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final JwtUtil jwtUtil;  

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String authenticate(User user) {
        if ("testuser".equals(user.getUsername()) && "password123".equals(user.getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        }
        throw new RuntimeException("Invalid username or password");
    }
}
