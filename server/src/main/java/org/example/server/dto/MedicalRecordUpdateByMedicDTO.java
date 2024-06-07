package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
public class MedicalRecordUpdateByMedicDTO {
    private String symptoms;
    private String treatment;
    private String diagnostic;
}
