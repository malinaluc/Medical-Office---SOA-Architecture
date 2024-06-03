package org.example.server.model.repository;

import org.example.server.model.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
    @Query("select new Consultation(c.idConsultation,c.startConsultationHour,c.endConsultationHour,c.namePatient,c.idMedic) from Consultation c where c.idMedic = :idMedic")
    List<Consultation> allConsultationByIdMedic(Integer idMedic);
}
