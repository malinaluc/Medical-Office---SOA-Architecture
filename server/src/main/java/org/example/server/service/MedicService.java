package org.example.server.service;

import org.example.server.model.entities.Medic;
import org.example.server.model.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicService {

    private final MedicRepository medicRepository;

    @Autowired
    public MedicService(MedicRepository medicRepository) {
        this.medicRepository = medicRepository;
    }

    public List<Medic> getAllMedics() {
        return medicRepository.findAll();
    }

    public Medic findMedicByIdMedic(Integer idMedic) {
        return medicRepository.findByIdMedic(idMedic);
    }
}
