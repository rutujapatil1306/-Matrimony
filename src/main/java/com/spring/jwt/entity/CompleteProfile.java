package com.spring.jwt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class CompleteProfile {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer completeProfileId;

//    @Column(length = 45)
//    private String statusCol;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userProfileId", nullable = false)
//    private UserProfile userProfile;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "horoscopeDetailsId", nullable = false)
//    private HoroscopeDetails horoscopeDetails;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "educationId", nullable = false)
//    private EducationAndProfession educationAndProfession;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "familyBackgroundId", nullable = false)
//    private FamilyBackground familyBackground;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "expectationsId", nullable = false)
//    private PartnerPreference partnerPreference;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contactId")
    private ContactDetails contactDetails;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "documentId", nullable = false)
//    private Document document;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
