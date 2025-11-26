package com.spring.jwt.utils;

import com.spring.jwt.entity.User;
import com.spring.jwt.exception.InvalidTokenException;
import com.spring.jwt.exception.UserNotFoundExceptions;
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

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            throw new InvalidTokenException("Authorization header missing or invalid format");
        }

        String token = authHeader.substring(7);

        if (!jwtService.isValidToken(token)) {
            throw new InvalidTokenException("Invalid or expired token");
        }

        Claims claims = jwtService.extractClaims(token);

        String email = claims.getSubject();

        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UserNotFoundExceptions("User not found");
        }

        return user.getId();
    }

}
