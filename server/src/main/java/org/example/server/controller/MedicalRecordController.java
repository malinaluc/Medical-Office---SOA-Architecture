package org.example.server.controller;

import org.example.server.dto.MedicalRecordDTO;
import org.example.server.model.entities.MedicalRecord;
import org.example.server.service.MedicService;
import org.example.server.service.MedicalRecordService;
import org.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/medicalRecord")
public class MedicalRecordController {

    private final MedicalRecordService medicalRecordService;
    private final MedicService medicService;
    private final UserService userService;

    @Autowired
    public MedicalRecordController(MedicalRecordService medicalRecordService, MedicService medicService, UserService userService) {
        this.medicalRecordService = medicalRecordService;
        this.medicService = medicService;
        this.userService = userService;
    }

    @GetMapping("/GetAllMedicalRecords")
    public ResponseEntity<List<MedicalRecordDTO>> getAllMedicalRecords() {
        List<MedicalRecord> medicalRecords = medicalRecordService.getAllMedicalRecords();
        List<MedicalRecordDTO> medicalRecordDTOS = new ArrayList<>();
        medicalRecords.forEach(m -> medicalRecordDTOS.add(medicalRecordService.medicalRecordToDTO(m)));
        return new ResponseEntity<>(medicalRecordDTOS, HttpStatus.OK);
    }

    @PutMapping("/UpdateMedicalRecord/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@PathVariable Integer id, @RequestBody MedicalRecord medicalRecord) {
        MedicalRecord updateMedicalRecord = medicalRecordService.updateMedicalRecord(id, medicalRecord);
        return updateMedicalRecord != null ? new ResponseEntity<>(updateMedicalRecord, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/DeleteMedicalRecord/{id}")
    public ResponseEntity<Void> deleteMedicalRecord(@PathVariable Integer id) {
        medicalRecordService.deleteMedicalRecord(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/AddMedicalRecord")
    public ResponseEntity<MedicalRecord> addMedicalRecord(@RequestBody MedicalRecord medicalRecord) {

        MedicalRecord auxMedicalRecord = new MedicalRecord();
        //auxMedicalRecord.setIdfisaMedicala(medicalRecord.getIdfisaMedicala());
        auxMedicalRecord.setDiagnostic(medicalRecord.getDiagnostic());
        auxMedicalRecord.setSymptoms(medicalRecord.getSymptoms());
        auxMedicalRecord.setTreatment(medicalRecord.getTreatment());
        auxMedicalRecord.setPatientName(medicalRecord.getPatientName());
        auxMedicalRecord.setPatientAge(medicalRecord.getPatientAge());

        // fk are type Medic and User
        auxMedicalRecord.setIdAsistent(userService.findByIdUser(medicalRecord.getIdAsistent().getIdUser()));
        auxMedicalRecord.setIdMedic(medicService.findMedicByIdMedic(medicalRecord.getIdMedic().getIdMedic()));

        MedicalRecord newMedicalRecord = medicalRecordService.addMedicalRecord(auxMedicalRecord);
        return new ResponseEntity<>(newMedicalRecord, HttpStatus.CREATED);
    }

    @GetMapping("/GetAllMedicalRecordsByDiagnostic/{diagnostic}")
    public ResponseEntity<List<MedicalRecordDTO>> getAllMedicalRecordsByDiagnostic(@PathVariable String diagnostic) {
        List<MedicalRecord> medicalRecords = medicalRecordService.filterByDiagnostic(diagnostic);
        List<MedicalRecordDTO> medicalRecordDTOS = new ArrayList<>();
        medicalRecords.forEach(m -> medicalRecordDTOS.add(medicalRecordService.medicalRecordToDTO(m)));
        return new ResponseEntity<>(medicalRecordDTOS, HttpStatus.OK);
    }

    @GetMapping("/GetAllMedicalRecordsByTreatment/{treatment}")
    public ResponseEntity<List<MedicalRecordDTO>> getAllMedicalRecordsByTreatment(@PathVariable String treatment) {
        List<MedicalRecord> medicalRecords = medicalRecordService.filterByTreatment(treatment);
        List<MedicalRecordDTO> medicalRecordDTOS = new ArrayList<>();
        medicalRecords.forEach(m -> medicalRecordDTOS.add(medicalRecordService.medicalRecordToDTO(m)));
        return new ResponseEntity<>(medicalRecordDTOS, HttpStatus.OK);
    }

    @GetMapping("/GetMedicalRecordByPatientName/{patientName}")
    public ResponseEntity<List<MedicalRecordDTO>> getMedicalRecordByPatientName(@PathVariable String patientName) {
        List<MedicalRecord> medicalRecords = medicalRecordService.findMedicalRecordByPatientName(patientName);
        List<MedicalRecordDTO> medicalRecordDTOS = new ArrayList<>();
        medicalRecords.forEach(m -> medicalRecordDTOS.add(medicalRecordService.medicalRecordToDTO(m)));
        return new ResponseEntity<>(medicalRecordDTOS, HttpStatus.OK);
    }

}
