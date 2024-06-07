package org.example.server.controller;

import org.example.server.dto.CreateMedicalRecordDTO;
import org.example.server.dto.MedicalRecordDTO;
import org.example.server.dto.MedicalRecordUpdateByAsistentDTO;
import org.example.server.dto.MedicalRecordUpdateByMedicDTO;
import org.example.server.exception.NoSuchEntityException;
import org.example.server.model.entities.MedicalRecord;
import org.example.server.service.MedicService;
import org.example.server.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/medicalRecord")
public class MedicalRecordController {

    private final MedicalRecordService medicalRecordService;

    @Autowired
    public MedicalRecordController(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }

    @PutMapping("/UpdateMedicalRecordByMedic/{id}")
    public ResponseEntity<String> updateMedicalRecordByMedic(@PathVariable Long id, @RequestBody MedicalRecordUpdateByMedicDTO medicalRecordUpdateByMedicDTO) {
        try {
            medicalRecordService.updateMedicalRecordByMedic(id, medicalRecordUpdateByMedicDTO);
        }
        catch (NoSuchEntityException e) {
            return ResponseEntity.status(400).body("Medical Record does not exist...");
        }
        catch (Exception e) {
            return ResponseEntity.status(400).body("Medical Record Update Fail!");
        }
        return ResponseEntity.status(200).body("Medical Record has been updated successfully!");
    }

    @PutMapping("/UpdateMedicalRecordByAsistent/{id}")
    public ResponseEntity<String> updateMedicalRecordByAsistent(@PathVariable Long id, @RequestBody MedicalRecordUpdateByAsistentDTO medicalRecordUpdateByAsistentDTO) {
        try {
            medicalRecordService.updateMedicalRecordByAsistent(id, medicalRecordUpdateByAsistentDTO);
        } catch (NoSuchEntityException e) {
            return ResponseEntity.status(400).body("Medical Record does not exist...");
        }
        catch (Exception e) {
            return ResponseEntity.status(400).body("Medical Record Update Fail!");
        }
        return ResponseEntity.status(200).body("Medical Record has been updated successfully!");
    }

    @DeleteMapping("/DeleteMedicalRecord/{id}")
    public ResponseEntity<String> deleteMedicalRecord(@PathVariable Long id) {
        try {
            medicalRecordService.deleteMedicalRecord(id);
        } catch (NoSuchEntityException e) {
            return ResponseEntity.status(400).body("Medical Record does not exist...");
        } catch (Exception e) {
            return ResponseEntity.status(400).body("There was an error while deleting the Medical Record");
        }
        return ResponseEntity.status(200).body("Medical Record has been deleted successfully!");
    }

    @PostMapping("/AddMedicalRecord")
    public ResponseEntity<String> addMedicalRecord(@RequestBody CreateMedicalRecordDTO createMedicalRecordDTO) {
        try {
            medicalRecordService.addMedicalRecord(createMedicalRecordDTO);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.toString());
        }
        return ResponseEntity.status(200).body("Medical Record created successfully!");
    }

    @GetMapping("/GetAllMedicalRecords")
    public ResponseEntity<List<MedicalRecordDTO>> getAllMedicalRecords() {
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecords();
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }

    @GetMapping("/GetAllMedicalRecordsByDiagnostic/{diagnostic}")
    public ResponseEntity<ArrayList<MedicalRecordDTO>> getAllMedicalRecordsByDiagnostic(@PathVariable String diagnostic) {
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecordsByDiagnostic(diagnostic);
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }

    @GetMapping("/GetAllMedicalRecordsByTreatment/{treatment}")
    public ResponseEntity<ArrayList<MedicalRecordDTO>> getAllMedicalRecordsByTreatment(@PathVariable String treatment) {
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecordsByTreatment(treatment);
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }

    @GetMapping("/GetAllMedicalRecordsByIdMedic/{id}")
    public ResponseEntity<ArrayList<MedicalRecordDTO>> getAllMedicalRecordsByIdMedic(@PathVariable Long id){
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecordsByIdMedic(id);
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e){
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }

    @GetMapping("/GetAllMedicalRecordsByPatientName/{patientName}")
    public ResponseEntity<ArrayList<MedicalRecordDTO>> getAllMedicalRecordsByPatientName(@PathVariable String patientName){
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecordsByPatientName(patientName);
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }

    @GetMapping("/GetAllMedicalRecordsByPatientAge/{patientAge}")
    public ResponseEntity<ArrayList<MedicalRecordDTO>> getAllMedicalRecordsByPatientAge(@PathVariable Integer patientAge){
        try {
            var medicalRecordList = medicalRecordService.getAllMedicalRecordsByPatientAge(patientAge);
            ArrayList<MedicalRecordDTO> medicalRecords = medicalRecordsToMedicalRecordsDTO(medicalRecordList);
            return ResponseEntity.status(200).body(medicalRecords);
        } catch (Exception e) {
            return ResponseEntity.status(400).body(new ArrayList<>());
        }
    }


    /**
     * @param medicalRecordList is the list of MedicalRecord that has the idMedic type Medic and idAsistent type User
     * @return medicalRecords is the list of MedicalRecords where idMedic and idAsistent are Long
     */
    private static ArrayList<MedicalRecordDTO> medicalRecordsToMedicalRecordsDTO(ArrayList<MedicalRecord> medicalRecordList) {
        ArrayList<MedicalRecordDTO> medicalRecords = new ArrayList<>();
        for(MedicalRecord medicalRecord : medicalRecordList) {
            MedicalRecordDTO medicalRecordDTO = new MedicalRecordDTO();

            medicalRecordDTO.setIdfisaMedicala(medicalRecord.getIdfisaMedicala());
            medicalRecordDTO.setPatientName(medicalRecord.getPatientName());
            medicalRecordDTO.setPatientAge(medicalRecord.getPatientAge());
            medicalRecordDTO.setSymptoms(medicalRecord.getSymptoms());
            medicalRecordDTO.setTreatment(medicalRecord.getTreatment());
            medicalRecordDTO.setDiagnostic(medicalRecord.getDiagnostic());
            medicalRecordDTO.setIdMedic(medicalRecord.getIdMedic().getIdMedic().longValue());
            medicalRecordDTO.setIdAsistent(medicalRecord.getIdAsistent().getIdUser().longValue());

            medicalRecords.add(medicalRecordDTO);
        }
        return medicalRecords;
    }
}
