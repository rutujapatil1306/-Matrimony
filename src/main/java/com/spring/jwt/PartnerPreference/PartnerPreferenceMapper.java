package com.spring.jwt.PartnerPreference;

import com.spring.jwt.entity.PartnerPreference;
import org.springframework.stereotype.Component;

@Component
public class PartnerPreferenceMapper {

    public static PartnerPreferenceDTO toDTO(PartnerPreference p) {
        if (p == null){
            return null;
        }
        PartnerPreferenceDTO dto = new PartnerPreferenceDTO();
        dto.setPartnerAge(p.getAge());
        dto.setLookingFor(p.getLookingFor());
        dto.setPartnerHeight(p.getHeight());
        dto.setEatingHabits(p.getEatingHabits());
        dto.setCountryLivingIn(p.getCountryLivingIn());
        dto.setPartnerReligion(p.getReligion());
        dto.setPartnerCaste(p.getCaste());
        dto.setPartnerEducation(p.getEducation());
        dto.setPartnerResidentStatus(p.getResidentStatus());
        dto.setPreference(p.getPreference());

        return dto;
    }

    public static PartnerPreference toEntity(PartnerPreferenceDTO dto) {
        if (dto == null) return null;

        PartnerPreference p = new PartnerPreference();

        p.setAge(dto.getPartnerAge());
        p.setLookingFor(dto.getLookingFor());
        p.setHeight(dto.getPartnerHeight());
        p.setEatingHabits(dto.getEatingHabits());
        p.setCountryLivingIn(dto.getCountryLivingIn());
        p.setReligion(dto.getPartnerReligion());
        p.setCaste(dto.getPartnerCaste());
        p.setEducation(dto.getPartnerEducation());
        p.setResidentStatus(dto.getPartnerResidentStatus());
        p.setPreference(dto.getPreference());

        return p;
    }
}
