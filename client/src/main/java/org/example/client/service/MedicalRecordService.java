package org.example.client.service;


import org.example.client.dto.MedicalRecordViewDTO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalRecordService {

    private static final String BASE_URL = "http://localhost:8080/api/medicalRecord";

    private final HttpClient client;

    public MedicalRecordService() {
        this.client = HttpClient.newHttpClient();
    }


    public List<MedicalRecordViewDTO> getAllMedicalRecords() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(BASE_URL + "/GetAllMedicalRecords"))
                .GET()
                .build();
        List<MedicalRecordViewDTO> medicalRecords = new ArrayList<>();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 200) {
                JSONArray jsonArray = new JSONArray(response.body());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    MedicalRecordViewDTO medicalRecordDTO = new MedicalRecordViewDTO();
                    medicalRecordDTO.setIdfisaMedicala(jsonObject.getInt("idfisaMedicala"));
                    medicalRecordDTO.setTreatment(jsonObject.getString("treatment"));
                    medicalRecordDTO.setDiagnostic(jsonObject.getString("diagnostic"));
                    medicalRecordDTO.setPatientName(jsonObject.getString("patientName"));
                    medicalRecordDTO.setSymptoms(jsonObject.getString("symptoms"));
                    medicalRecordDTO.setPatientAge(jsonObject.getInt("patientAge"));

                    medicalRecords.add(medicalRecordDTO);
                }

            } else {
                throw new IOException("HTTP error code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            // Handle exception
            e.printStackTrace();
        }
        return medicalRecords;
    }
    

}
