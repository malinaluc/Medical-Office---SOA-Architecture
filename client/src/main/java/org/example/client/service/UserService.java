package org.example.client.service;


import org.example.client.dto.UserDTO;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.example.client.utils.ExtensionFunctions.logDebug;

@Service
public class UserService {

    private static final String BASE_URL = "http://localhost:8080/api/user";

    private final HttpClient client;

    public UserService() {
        this.client = HttpClient.newHttpClient();
    }

    public UserDTO LoginAction(String username, String password) throws IOException, InterruptedException {

        logDebug("Am ajuns in LoginAction");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", username);
        jsonObject.put("password", password);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/login"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonObject.toString()))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JSONObject jsonResponse = new JSONObject(response.body());
            UserDTO user = new UserDTO();

            user.setIdUser(jsonResponse.getInt("idUser"));
            user.setUsername(jsonResponse.getString("username"));
            user.setRole(jsonResponse.getInt("role"));
            return user;

        } else {
            throw new IOException("HTTP error code: " + response.statusCode());
        }

    }
}
