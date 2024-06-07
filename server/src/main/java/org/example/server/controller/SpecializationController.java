package org.example.server.controller;

import com.azure.core.annotation.Get;
import org.example.server.model.entities.Specialization;
import org.example.server.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/specialization")
public class SpecializationController {
    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @GetMapping("/GetAllSpecializations")
    public ResponseEntity<ArrayList<Specialization>> getAllSpecializations() {
        try {
            var specializations = specializationService.getAllSpecializations();
            return ResponseEntity.status(200).body(specializations);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }
}
