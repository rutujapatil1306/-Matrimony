package com.spring.jwt.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ProfileController {



    @Autowired
    ProfileService profileService;

//    @PatchMapping("/createProfile")
//    public ResponseEntity<BaseResponseDTO> createProfile(@RequestParam Integer userID,
//                                                         @RequestBody UserProfileDTO userProfileDTO1){
//        BaseResponseDTO response  = profileService.save(userID,userProfileDTO1);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }
}
