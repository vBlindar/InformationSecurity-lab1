package com.example.shifry_1_laba.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public interface ReadFile {

    ResponseEntity<String> readFile(MultipartFile file);
}
