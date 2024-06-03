package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.server.model.entities.Medic;

@AllArgsConstructor
@Getter
@Setter
public class CvDTO {
    private Integer idCV;
    private String name;
    private Integer yearsOfEmployment;
    private Integer age;
    private String description;
    private String currentEmployer;
    private Medic idMedic;
}
