package org.example.server.service;

import org.example.server.model.entities.Specialization;
import org.example.server.model.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SpecializationService {
    private final SpecializationRepository specializationRepository;

    @Autowired
    public SpecializationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    public ArrayList<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }
}
