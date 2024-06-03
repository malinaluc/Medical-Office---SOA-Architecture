package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.server.model.entities.Medic;
import org.example.server.model.entities.User;

@AllArgsConstructor
@Getter
@Setter
public class MedicalRecordDTO {

    private Integer idfisaMedicala;
    private String patientName;
    private String symptoms;
    private String treatment;
    private String diagnostic;
    private Integer patientAge;
    private Medic idMedic;
    private User idAsistent;

}
