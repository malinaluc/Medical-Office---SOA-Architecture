package org.example.server.service;


import org.example.server.dto.CreateMedicalRecordDTO;
import org.example.server.dto.MedicalRecordUpdateByAsistentDTO;
import org.example.server.dto.MedicalRecordUpdateByMedicDTO;
import org.example.server.exception.NoSuchEntityException;
import org.example.server.model.entities.Medic;
import org.example.server.model.entities.MedicalRecord;
import org.example.server.model.entities.User;
import org.example.server.model.repository.MedicRepository;
import org.example.server.model.repository.MedicalRecordRepository;
import org.example.server.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MedicalRecordService {

    private static final Integer ASISTENT_ROL = 3;

    private final MedicalRecordRepository medicalRecordRepository;
    private final MedicRepository medicRepository;
    private final UserRepository userRepository;


    @Autowired
    public MedicalRecordService(MedicalRecordRepository medicalRecordRepository, MedicRepository medicRepository, UserRepository userRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
        this.medicRepository = medicRepository;
        this.userRepository = userRepository;
    }

    public ArrayList<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public ArrayList<MedicalRecord> getAllMedicalRecordsByDiagnostic(String diagnostic) {
        return medicalRecordRepository.findAllByDiagnostic(diagnostic);
    }

    public ArrayList<MedicalRecord> getAllMedicalRecordsByTreatment(String treatment) {
        return medicalRecordRepository.findAllByTreatment(treatment);
    }

    public ArrayList<MedicalRecord> getAllMedicalRecordsByIdMedic(Long id) throws NoSuchEntityException {
        try {
            Medic medic = medicRepository.findByIdMedic(id.intValue());
            return medicalRecordRepository.findAllByIdMedic(medic);
        } catch (Exception e) {
            throw new NoSuchEntityException("Medic");
        }
    }

    public ArrayList<MedicalRecord> getAllMedicalRecordsByPatientName(String patientName) {
        return medicalRecordRepository.findAllByPatientName(patientName);
    }

    public ArrayList<MedicalRecord> getAllMedicalRecordsByPatientAge(Integer patientAge) {
        return medicalRecordRepository.findAllByPatientAge(patientAge);
    }

    public void addMedicalRecord(CreateMedicalRecordDTO createMedicalRecordDTO) throws Exception {
        try {
            Medic medic = medicRepository.findByIdMedic(createMedicalRecordDTO.getIdMedic().intValue());
            User asistent = userRepository.findByIdUserAndRole(createMedicalRecordDTO.getIdAsistent(), ASISTENT_ROL);

            MedicalRecord medicalRecord = new MedicalRecord();
            medicalRecord.setTreatment(createMedicalRecordDTO.getTreatment());
            medicalRecord.setSymptoms(createMedicalRecordDTO.getSymptoms());
            medicalRecord.setDiagnostic(createMedicalRecordDTO.getDiagnostic());
            medicalRecord.setPatientAge(createMedicalRecordDTO.getPatientAge());
            medicalRecord.setPatientName(createMedicalRecordDTO.getPatientName());
            medicalRecord.setIdMedic(medic);
            medicalRecord.setIdAsistent(asistent);

            medicalRecordRepository.save(medicalRecord);
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    public void deleteMedicalRecord(Long idMedicalRecord) throws NoSuchEntityException {
        var medicalRecordData = medicalRecordRepository.findMedicalRecordByIdfisaMedicala(idMedicalRecord);
        if (medicalRecordData != null) {
            medicalRecordRepository.delete(medicalRecordData);
        } else throw new NoSuchEntityException("Medical Recod");
    }

    public void updateMedicalRecordByMedic(Long idMedicalRecord, MedicalRecordUpdateByMedicDTO medicalRecordUpdateByMedicDTO) throws NoSuchEntityException {
        var medicalRecordData = medicalRecordRepository.findMedicalRecordByIdfisaMedicala(idMedicalRecord);

        if (medicalRecordData != null) {
            medicalRecordData.setDiagnostic(medicalRecordUpdateByMedicDTO.getDiagnostic());
            medicalRecordData.setSymptoms(medicalRecordUpdateByMedicDTO.getSymptoms());
            medicalRecordData.setTreatment(medicalRecordUpdateByMedicDTO.getTreatment());

            medicalRecordRepository.save(medicalRecordData);
        } else {
            throw new NoSuchEntityException("MedicalRecord");
        }
    }

    public void updateMedicalRecordByAsistent(Long idMedicalRecord, MedicalRecordUpdateByAsistentDTO medicalRecordUpdateByAsistentDTO) throws NoSuchEntityException {
        var medicalRecordData = medicalRecordRepository.findMedicalRecordByIdfisaMedicala(idMedicalRecord);

        if (medicalRecordData != null) {
            Medic medic = medicRepository.findByIdMedic(medicalRecordUpdateByAsistentDTO.getIdMedic().intValue());
            User asistent = userRepository.findByIdUserAndRole(medicalRecordUpdateByAsistentDTO.getIdAsistent(), ASISTENT_ROL);

            medicalRecordData.setPatientAge(medicalRecordUpdateByAsistentDTO.getPatientAge());
            medicalRecordData.setIdMedic(medic);
            medicalRecordData.setIdAsistent(asistent);

            medicalRecordRepository.save(medicalRecordData);
        } else {
            throw new NoSuchEntityException("MedicalRecord");
        }
    }
}
