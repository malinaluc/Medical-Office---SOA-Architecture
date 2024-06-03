package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.server.model.entities.Medic;

@AllArgsConstructor
@Getter
@Setter
public class ConsultationDTO {
    private Integer idConsultation;

    private Integer startConsultationHour;
    private Integer endConsultationHour;
    private String namePatient;
    private Medic idMedic;
}
