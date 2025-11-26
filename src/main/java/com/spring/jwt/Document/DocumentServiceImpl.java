package com.spring.jwt.Document;

import com.spring.jwt.utils.BaseResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentServiceImpl implements DocumentService{
    @Override
    public BaseResponseDTO uploadDocument(String documentType, MultipartFile file) {
        return null;
    }
}
