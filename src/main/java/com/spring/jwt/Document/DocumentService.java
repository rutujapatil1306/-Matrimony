package com.spring.jwt.Document;

import com.spring.jwt.utils.BaseResponseDTO;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentService {
    BaseResponseDTO uploadDocument( String documentType, MultipartFile file);
}
