package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
public class MedicalRecordUpdateByAsistentDTO {
    private Integer patientAge;
    private Long idMedic;
    private Long idAsistent;
}
