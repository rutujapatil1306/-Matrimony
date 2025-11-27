package com.spring.jwt.EducationAndProfession;

import com.spring.jwt.entity.EducationAndProfession;
import com.spring.jwt.utils.ApiResponse;
import com.spring.jwt.utils.BaseResponseDTO;

import com.spring.jwt.utils.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/education")
public class EducationController {

    private final EducationService educationAndProfessionService;



    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> create(
            @RequestHeader("Authorization") String authHeader,
            @RequestBody EducationDTO educationDTO) {
        Integer userId= SecurityUtil.getCurrentUserId();
        BaseResponseDTO response = educationAndProfessionService.create(userId , educationDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @PatchMapping("/update")
    public ResponseEntity<ApiResponse<EducationAndProfession>> updateByUserdID(@RequestParam Integer userID,
                                                                      @RequestBody EducationDTO educationDTO){
        ApiResponse response = educationAndProfessionService.updateByUserdID(userID,educationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
