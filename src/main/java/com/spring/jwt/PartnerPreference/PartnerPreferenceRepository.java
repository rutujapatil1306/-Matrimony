package com.spring.jwt.PartnerPreference;

import com.spring.jwt.entity.PartnerPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerPreferenceRepository extends JpaRepository<PartnerPreference,Integer> {
}
