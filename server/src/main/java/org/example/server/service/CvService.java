package org.example.server.service;

import org.example.server.exception.NoSuchEntityException;
import org.example.server.model.entities.Cv;
import org.example.server.model.repository.CvRepository;
import org.example.server.model.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CvService {
    private final CvRepository cvRepository;
    private final MedicRepository medicRepository;

    @Autowired
    public CvService(CvRepository cvRepository, MedicRepository medicRepository) {
        this.cvRepository = cvRepository;
        this.medicRepository = medicRepository;
    }

    public Cv getCvByIdMedic(Long idMedic) {
        try {
            var medic = medicRepository.findByIdMedic(idMedic.intValue());
            if (medic != null) {
                return cvRepository.findByIdMedic(medic);
            } else {
                throw new NoSuchEntityException("Medic");
            }
        } catch (NoSuchEntityException e) {
            throw new RuntimeException(e);
        }
    }
}