package com.spring.jwt.ContactDetails;

import lombok.Data;

@Data
public class ContactDTO {


    private Integer contactID;
    private String fullAddress;
    private String city;
    private Integer pinCode;
    private Long mobileNumber;
    private Long alternateNumber;
    private Integer userId;
}
