package org.example.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicalRecordViewDTO {
    private Integer idfisaMedicala;
    private String patientName;
    private String symptoms;
    private String treatment;
    private String diagnostic;
    private Integer patientAge;

}
