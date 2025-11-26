package com.spring.jwt.Document;

import com.spring.jwt.utils.BaseResponseDTO;
import com.spring.jwt.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;
    private final JwtUtils jwtUtils;

    @PostMapping("/upload")
    public ResponseEntity<BaseResponseDTO> uploadDocuments( @RequestHeader("Authorization") String authHeader,
                                                            @RequestParam("documentType") String documentType,
                                                            @RequestParam("file") MultipartFile file)
    {
        Integer userId = jwtUtils.extractUSerID(authHeader);
        BaseResponseDTO response = documentService.uploadDocument(documentType, file);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(response);
    }


}
