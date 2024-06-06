package org.example.server.service;

import org.example.server.dto.ConsultationDTO;
import org.example.server.model.entities.Consultation;
import org.example.server.model.entities.Medic;
import org.example.server.model.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository consultationRepository;

    @Autowired
    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public List<Consultation> allConsultationByIDMedic(Integer idMedic) {
        return consultationRepository.allConsultationByIdMedic(idMedic);
    }

    public List<Consultation> allConsultationByPatientName(String patientName) {
        return consultationRepository.allConsultationByPatientName(patientName);
    }

    public ConsultationDTO consultationToDTO(Consultation consultation) {
        Medic idMedic = (consultation.getIdMedic() != null) ? consultation.getIdMedic() : null;
        return new ConsultationDTO(
                consultation.getIdConsultation(),
                consultation.getStartConsultationHour(),
                consultation.getEndConsultationHour(),
                consultation.getNamePatient(),
                idMedic
        );
    }

}
