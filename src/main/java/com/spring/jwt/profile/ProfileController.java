package com.spring.jwt.profile;

import com.spring.jwt.entity.User;
import com.spring.jwt.jwt.JwtService;
import com.spring.jwt.repository.UserRepository;
import com.spring.jwt.utils.ApiResponse;
import com.spring.jwt.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Validated
@Tag(name = "Profile Api", description = "Api for profile management")
public class ProfileController {

    private final ProfileService profileService;

    private final JwtUtils jwtUtils;

    @Operation(summary = "Api for profile creation")
    @PostMapping ("/createProfile")
    public ResponseEntity<ApiResponse<ProfileDTO>> createProfile(
            @RequestHeader("Authorization") String authHeader,
            @RequestBody @Valid ProfileDTO profileDTO){
        try {
            Integer userId= jwtUtils.extractUSerID(authHeader);
            profileService.createProfile(userId, profileDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success("profile created successfully"));
        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(ApiResponse.error(HttpStatus.BAD_REQUEST,"profile creation failed",e.getMessage()));
        }

    }
}
