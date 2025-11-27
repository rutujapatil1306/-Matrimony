package com.spring.jwt.Document;

import com.spring.jwt.entity.CompleteProfile;
import com.spring.jwt.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDTO {

    private String documentType;
    private String fileName;
    private byte[] fileData;
    private User user;
    private CompleteProfile completeProfile;
}
