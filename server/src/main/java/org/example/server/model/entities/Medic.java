package org.example.server.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedic;

    private String name;
    private String surname;
    private Integer startTimeProgram;
    private Integer endTimeProgram;


    //fk to User
    @ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private User idUser;

    //fk to Specialization
    @ManyToOne
    @JoinColumn(name = "idSpecializatiom", referencedColumnName = "idSpecialization")
    private Specialization idSpecialization;


}
