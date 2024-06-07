package org.example.server.controller;

import org.example.server.model.entities.Medic;
import org.example.server.service.MedicService;
import org.example.server.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/medic")
public class MedicController {
    private final MedicService medicService;

    @Autowired
    public MedicController(MedicService medicService) {
        this.medicService = medicService;
    }

    @GetMapping("/getMedicById/{id}")
    public ResponseEntity<?> getMedicById(@PathVariable Long id){
        try {
            var medic = medicService.getMedicById(id);
            return ResponseEntity.status(200).body(medic);
        } catch (Exception e) {
            return ResponseEntity.status(400).body("There was an error: " + e);
        }
    }

    @GetMapping("/getMedicByName/{medicName}")
    public ResponseEntity<?> getMedicByName(@PathVariable String medicName) {
        try {
            var medic = medicService.getMedicByName(medicName);
            return ResponseEntity.status(200).body(medic);
        } catch (Exception e) {
            return ResponseEntity.status(400).body("There was an error: " + e);
        }
    }

    @GetMapping("/getAllMedicsBySpecializationId/{specializationId}")
    public ResponseEntity<ArrayList<Medic>> getAllMedicsBySpecializationId(@PathVariable Long specializationId){
        try {
            var medicList = medicService.getAllMedicsBySpecializationId(specializationId.intValue());
            return ResponseEntity.status(200).body(medicList);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }
}
