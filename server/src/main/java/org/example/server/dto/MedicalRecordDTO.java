package org.example.server.dto;

import lombok.*;
import org.example.server.model.entities.Medic;
import org.example.server.model.entities.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
public class MedicalRecordDTO {
    private Integer idfisaMedicala;
    private String patientName;
    private String symptoms;
    private String treatment;
    private String diagnostic;
    private Integer patientAge;
    private Long idMedic;
    private Long idAsistent;
}
