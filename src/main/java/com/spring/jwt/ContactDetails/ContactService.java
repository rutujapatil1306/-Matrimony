package com.spring.jwt.ContactDetails;

import com.spring.jwt.entity.ContactDetails;
import com.spring.jwt.utils.ApiResponse;
import com.spring.jwt.utils.BaseResponseDTO;
import org.hibernate.query.Page;

import java.util.List;

public interface ContactService {
    ApiResponse updateByUserID(Integer userID, ContactDTO contactDTO);
    
    BaseResponseDTO create(ContactDTO contactDTO);

    ContactDetails getContactById(Integer contactID);

    ApiResponse updateByContactID(Integer contactID, ContactDTO contactDTO);

   // Page getAll(int page, int pageSize);
}
