package com.spring.jwt.utils;

import com.spring.jwt.entity.User;
import com.spring.jwt.jwt.JwtService;
import com.spring.jwt.repository.UserRepository;
import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class JwtUtils {

    private final JwtService jwtService;
    private final UserRepository userRepository;

    public Integer extractUSerID(String authHeader) {
        String token = authHeader.substring(7);

        // 1. Validate token
        if (!jwtService.isValidToken(token)) {
            throw new RuntimeException("Invalid token");
        }
        // 2. Extract claims
        Claims claims = jwtService.extractClaims(token);
        // 3. Extract email (subject)
        String email = claims.getSubject();
        // 4. Fetch userId
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user.getId();
    }
}
