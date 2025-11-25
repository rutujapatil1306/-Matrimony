package com.spring.jwt.EducationAndProfession;

import com.spring.jwt.ContactDetails.ContactDTO;
import com.spring.jwt.entity.EducationAndProfession;
import com.spring.jwt.utils.ApiResponse;
import com.spring.jwt.utils.BaseResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/education")
public class EducationAndProfessionController {

    private final EducationAndProfessionService educationAndProfessionService;

    public EducationAndProfessionController(EducationAndProfessionService educationAndProfessionService){
        this.educationAndProfessionService = educationAndProfessionService;
    }


    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> create(@RequestBody EducationDTO educationDTO) {
        BaseResponseDTO response = educationAndProfessionService.create(educationDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @PatchMapping("/update")
    public ResponseEntity<ApiResponse<EducationAndProfession>> create(@RequestParam Integer userID,
                                                                      @RequestBody EducationDTO educationDTO){
        ApiResponse response = educationAndProfessionService.save(userID,educationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
