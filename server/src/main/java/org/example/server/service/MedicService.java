package org.example.server.service;

import org.example.server.exception.NoSuchEntityException;
import org.example.server.model.entities.Medic;
import org.example.server.model.entities.Specialization;
import org.example.server.model.repository.MedicRepository;
import org.example.server.model.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicService {

    private final MedicRepository medicRepository;
    private final SpecializationRepository specializationRepository;

    @Autowired
    public MedicService(MedicRepository medicRepository, SpecializationRepository specializationRepository) {
        this.medicRepository = medicRepository;
        this.specializationRepository = specializationRepository;
    }

    public List<Medic> getAllMedics() {
        return medicRepository.findAll();
    }

    public Medic findMedicByIdMedic(Integer idMedic) {
        return medicRepository.findByIdMedic(idMedic);
    }

    public Medic getMedicById(Long id) {
        return medicRepository.findByIdMedic(id.intValue());
    }

    public Medic getMedicByName(String medicName) {
        return medicRepository.findByName(medicName);
    }

    public ArrayList<Medic> getAllMedicsBySpecializationId(Integer specializationId) throws Exception {
        try {
            var specialization = specializationRepository.findByIdSpecialization(specializationId);
            if (specialization != null) {
                return medicRepository.findAllByIdSpecialization(specialization);
            } else {
                throw new NoSuchEntityException("Specialization");
            }
        } catch (Exception e){
            throw new Exception(e.toString());
        }
    }
}
