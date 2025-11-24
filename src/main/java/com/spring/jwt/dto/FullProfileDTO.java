package com.spring.jwt.dto;

import com.spring.jwt.ContactDetails.ContactDTO;
import com.spring.jwt.Document.DocumentDTO;
import com.spring.jwt.EducationAndProfession.EducationDTO;
import com.spring.jwt.FamilyBackground.FamilyBackgroundDTO;
import com.spring.jwt.HoroscopeDetails.HoroscopeDTO;
import com.spring.jwt.PartnerPreference.PartnerPreferenceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullProfileDTO{

    private EducationDTO educationDTO;
    private HoroscopeDTO horoscopeDTO;
    private PartnerPreferenceDTO partnerPreferenceDTO;
    private ContactDTO contactDTO;
    private FamilyBackgroundDTO familyBackgroundDTO;
    private DocumentDTO documentDTO;

} 