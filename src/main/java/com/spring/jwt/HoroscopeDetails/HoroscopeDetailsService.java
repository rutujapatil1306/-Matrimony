package com.spring.jwt.HoroscopeDetails;


import com.spring.jwt.dto.UserProfileDTO;
import com.spring.jwt.entity.User;

public interface HoroscopeDetailsService {

    UserProfileDTO saveHoroscopeDetails(UserProfileDTO userProfileDTO);


}
