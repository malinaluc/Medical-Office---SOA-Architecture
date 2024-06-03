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
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfisaMedicala;

    private String patientName;
    private String symptoms;
    private String treatment;
    private String diagnostic;
    private Integer patientAge;

    //fk to Medic
    @ManyToOne
    @JoinColumn(name = "idMedic", referencedColumnName = "idMedic")
    private Medic idMedic;
    //fk to User

    @ManyToOne
    @JoinColumn(name = "idAsistent", referencedColumnName = "idUser")
    private User idAsistent;

    public MedicalRecord(Integer idfisaMedicala, String patientName, String symptoms, String treatment, String diagnostic, Integer patientAge) {
        this.idfisaMedicala = idfisaMedicala;
        this.patientName = patientName;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.diagnostic = diagnostic;
        this.patientAge = patientAge;
    }
}
