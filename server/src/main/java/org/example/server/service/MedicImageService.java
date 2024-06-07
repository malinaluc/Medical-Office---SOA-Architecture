package org.example.server.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public interface MedicImageService {
    String addImage(MultipartFile file) throws IOException;
}
