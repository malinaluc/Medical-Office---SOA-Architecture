package org.example.server.controller;

import org.example.server.dto.ConsultationDTO;
import org.example.server.model.entities.Consultation;
import org.example.server.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/consultation")
public class ConsultationController {

    private final ConsultationService consultationService;


    @Autowired
    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }


    // idMedic in Consultation is type Medic
    @GetMapping("/GetAllConsultationsByIdMedic/{idMedic}")
    public ResponseEntity<List<ConsultationDTO>> getAllConsultationByIdMedic(@PathVariable Integer idMedic) {
        List<Consultation> consultations = consultationService.allConsultationByIDMedic(idMedic);
        List<ConsultationDTO> consultationDTOS = new ArrayList<>();
        consultations.forEach(c -> consultationDTOS.add(consultationService.consultationToDTO(c)));
        return new ResponseEntity<>(consultationDTOS, HttpStatus.OK);
    }

    @GetMapping("/GetAllConsultationsByPatientName/{patientName}")
    public ResponseEntity<List<ConsultationDTO>> getAllConsultationByIdMedic(@PathVariable String patientName) {
        List<Consultation> consultations = consultationService.allConsultationByPatientName(patientName);
        List<ConsultationDTO> consultationDTOS = new ArrayList<>();
        consultations.forEach(c -> consultationDTOS.add(consultationService.consultationToDTO(c)));
        return new ResponseEntity<>(consultationDTOS, HttpStatus.OK);
    }

}
