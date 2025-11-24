package com.spring.jwt.PartnerPreference;

import com.spring.jwt.ContactDetails.ContactDTO;
import com.spring.jwt.utils.BaseResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/PartnerPreference")
public class PartnerPreferenceController {

    private final PartnerPreferenceService partnerPreferenceService;

    public PartnerPreferenceController(PartnerPreferenceService partnerPreferenceService) {
        this.partnerPreferenceService = partnerPreferenceService;
    }

    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> create(@RequestBody PartnerPreferenceDTO partnerPreferenceDTO) {

        BaseResponseDTO response = partnerPreferenceService.create(partnerPreferenceDTO);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
