package org.example.client.controller;

import org.example.client.dto.MedicalRecordViewDTO;
import org.example.client.service.MedicalRecordService;
import org.example.client.utils.SessionManager;
import org.example.client.view.LoginForm;
import org.example.client.view.MedicForm;

import javax.swing.*;
import java.util.List;

public class MedicController {


    private final MedicalRecordService medicalRecordService;
    MedicForm medicForm;

    public MedicController(MedicForm medicForm, MedicalRecordService medicalRecordService) {
        this.medicForm = medicForm;
        this.medicalRecordService = medicalRecordService;
        medicForm.getMedicLogOutButton().addActionListener(e -> handleLogOutAction());
        medicForm.getMedicVizualizareFiseButton().addActionListener(e -> handleViewAllMedicalRecordsAction());


    }

    private void handleLogOutAction() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(medicForm.getPanel1());
        frame.setVisible(false);
        LoginForm loginForm = new LoginForm();
        JFrame loginFrame = new JFrame("Login Form");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.getContentPane().add(loginForm.getPanel1()); // Add the JPanel from Login to the JFrame
        loginFrame.setSize(700, 700);
        loginFrame.setLocationRelativeTo(null); // Center the frame on the screen
        loginFrame.setVisible(true); // Make the frame visible
        SessionManager.logOutUser();
    }

    private void handleViewAllMedicalRecordsAction() {
        medicForm.getMedicVizualizareFiseTextArea().setText("");
        try {

            List<MedicalRecordViewDTO> medicalRecordViewDTOS = medicalRecordService.getAllMedicalRecords();
            for (MedicalRecordViewDTO medicalRecordViewDTO : medicalRecordViewDTOS) {
                medicForm.getMedicVizualizareFiseTextArea().append(
                        "ID Fisa: " + medicalRecordViewDTO.getIdfisaMedicala() + "\n" +
                                "Nume Pacient: " + medicalRecordViewDTO.getPatientName() + "\n" +
                                "Varsta pacient " + medicalRecordViewDTO.getPatientAge() + "\n" +
                                "Simptome: " + medicalRecordViewDTO.getSymptoms() + "\n" +
                                "Tratament: " + medicalRecordViewDTO.getTreatment() + "\n" +
                                "Diagnostic: " + medicalRecordViewDTO.getDiagnostic() + "\n"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void handleUpdateMedicalRecord() {


    }


}
