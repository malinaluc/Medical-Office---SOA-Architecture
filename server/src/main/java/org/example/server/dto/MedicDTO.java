package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.server.model.entities.Specialization;
import org.example.server.model.entities.User;

@AllArgsConstructor
@Getter
@Setter
public class MedicDTO {
    private Integer idMedic;
    private String name;
    private String surname;
    private Integer startTimeProgram;
    private Integer endTimeProgram;
    private User idUser;
    private Specialization idSpecialization;
}
