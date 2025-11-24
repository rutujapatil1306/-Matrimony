package com.spring.jwt.EducationAndProfession;

import com.spring.jwt.utils.ApiResponse;
import com.spring.jwt.utils.BaseResponseDTO;

public interface EducationAndProfessionService {

    ApiResponse save(Integer userID, EducationDTO educationDTO);

    BaseResponseDTO create(EducationDTO educationDTO);
}
