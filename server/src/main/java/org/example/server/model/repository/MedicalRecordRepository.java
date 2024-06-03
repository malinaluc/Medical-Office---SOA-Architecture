package org.example.server.model.repository;

import org.example.server.model.entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {

    //filter by diagnostic
    @Query("select new MedicalRecord (m.idfisaMedicala,m.patientName,m.symptoms,m.treatment,m.diagnostic,m.patientAge, m.idMedic,m.idAsistent) from MedicalRecord  m where m.diagnostic = :diagnostic")
    List<MedicalRecord> findAllByDiagnostic(String diagnostic);

    //filter by treatment
    @Query("select new MedicalRecord (m.idfisaMedicala,m.patientName,m.symptoms,m.treatment,m.diagnostic,m.patientAge, m.idMedic,m.idAsistent) from MedicalRecord  m where m.treatment = :treatment")
    List<MedicalRecord> findAllByTreatmentc(String treatment);

    //search for a patient name
    @Query("select new MedicalRecord (m.idfisaMedicala,m.patientName,m.symptoms,m.treatment,m.diagnostic,m.patientAge, m.idMedic,m.idAsistent) from MedicalRecord  m where m.patientName = :patientName")
    List<MedicalRecord> findMedicalRecordByPatientName(String patientName);

}
