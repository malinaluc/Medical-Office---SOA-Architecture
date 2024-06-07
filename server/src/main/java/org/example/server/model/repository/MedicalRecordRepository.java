package org.example.server.model.repository;

import org.example.server.model.entities.Medic;
import org.example.server.model.entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
    //search for a patient name
    @Query("select new MedicalRecord (m.idfisaMedicala,m.patientName,m.symptoms,m.treatment,m.diagnostic,m.patientAge, m.idMedic,m.idAsistent) from MedicalRecord  m where m.patientName = :patientName")
    List<MedicalRecord> findMedicalRecordByPatientName(String patientName);

    MedicalRecord findMedicalRecordByIdfisaMedicala(Long id);

    ArrayList<MedicalRecord> findAllByDiagnostic(String diagnostic);

    ArrayList<MedicalRecord> findAllByTreatment(String treatment);

    ArrayList<MedicalRecord> findAllByIdMedic(Medic idMedic);

    ArrayList<MedicalRecord> findAllByPatientName(String patientName);

    ArrayList<MedicalRecord> findAllByPatientAge(Integer patientAge);

    ArrayList<MedicalRecord> findAll();
}
