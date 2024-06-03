package org.example.server.service;


import org.example.server.dto.MedicalRecordDTO;
import org.example.server.model.entities.Medic;
import org.example.server.model.entities.MedicalRecord;
import org.example.server.model.entities.User;
import org.example.server.model.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {

    private final MedicalRecordRepository medicalRecordRepository;

    @Autowired
    public MedicalRecordService(MedicalRecordRepository medicalRecordRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
    }

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public MedicalRecordDTO medicalRecordToDTO(MedicalRecord medicalRecord) {
        Medic idMedic = (medicalRecord.getIdMedic() != null) ? medicalRecord.getIdMedic() : null;
        User idAsistent = (medicalRecord.getIdAsistent() != null) ? medicalRecord.getIdAsistent() : null;
        return new MedicalRecordDTO(
                medicalRecord.getIdfisaMedicala(),
                medicalRecord.getPatientName(),
                medicalRecord.getSymptoms(),
                medicalRecord.getTreatment(),
                medicalRecord.getDiagnostic(),
                medicalRecord.getPatientAge(),
                idMedic,
                idAsistent
        );
    }

    public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    public void deleteMedicalRecord(Integer idMedicalRecord) {
        medicalRecordRepository.deleteById(idMedicalRecord);
    }

    public MedicalRecord updateMedicalRecord(Integer idMedicalRecord, MedicalRecord medicalRecord) {
        if (medicalRecordRepository.existsById(idMedicalRecord)) {
            medicalRecord.setIdfisaMedicala(idMedicalRecord);
            return medicalRecordRepository.save(medicalRecord);
        }
        return null;
    }

    public List<MedicalRecord> filterByDiagnostic(String diagnostic) {
        return medicalRecordRepository.findAllByDiagnostic(diagnostic);
    }

    public List<MedicalRecord> filterByTreatment(String treatment) {
        return medicalRecordRepository.findAllByTreatmentc(treatment);
    }

    public List<MedicalRecord> findMedicalRecordByPatientName(String patientName) {
        return medicalRecordRepository.findMedicalRecordByPatientName(patientName);
    }


}
