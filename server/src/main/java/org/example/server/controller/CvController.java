package org.example.server.controller;

import org.example.server.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cv")
public class CvController {
    private final CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("/getCvByIdMedic/{idMedic}")
    public ResponseEntity<?> getCvByIdMedic(@PathVariable Long idMedic) {
        try {
            var cv = cvService.getCvByIdMedic(idMedic);
            return ResponseEntity.status(200).body(cv);
        } catch (Exception e) {
            return ResponseEntity.status(400).body("There was an error: " + e);
        }
    }
}