package org.example.client.service;


import org.example.client.dto.UserDTO;
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
public class UserService {

    private static final String BASE_URL = "http://localhost:8080/api/user";
    private static final String BASE_URL_GetAllUsers = "http://localhost:8080/api/user/GetAllUsers";

    private final HttpClient client;

    public UserService() {
        this.client = HttpClient.newHttpClient();
    }

    public UserDTO LoginAction(String username, String password) throws IOException, InterruptedException {

        //logDebug("Am ajuns in LoginAction");
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

    public List<UserDTO> getAllUsers() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(BASE_URL_GetAllUsers))
                .GET()
                .build();
        List<UserDTO> users = new ArrayList<>();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 200) {
                JSONArray jsonArray = new JSONArray(response.body());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    UserDTO user = new UserDTO();
                    user.setIdUser(jsonObject.getInt("idUser"));
                    user.setUsername(jsonObject.getString("username"));
                    user.setPassword(jsonObject.getString("password"));
                    user.setRole(jsonObject.getInt("role"));
                    users.add(user);

                }

            } else {
                throw new IOException("HTTP error code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            // Handle exception
            e.printStackTrace();
        }
        return users;
    }

    public UserDTO addUser(UserDTO user) throws IOException, InterruptedException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", user.getUsername());
        jsonObject.put("password", user.getUsername());
        jsonObject.put("role", user.getRole());

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/AddUser"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonObject.toString()))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 201) {
            JSONObject responseObject = new JSONObject(response.body());
            return user;
        } else {
            throw new IOException("HTTP error code: " + response.statusCode());
        }


    }

    public void updateUser(Integer id, UserDTO user) throws IOException, InterruptedException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", user.getUsername());
        jsonObject.put("password", user.getPassword());
        jsonObject.put("role", user.getRole());


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/UpdateUser" + "/" + id))
                .PUT(HttpRequest.BodyPublishers.ofString(jsonObject.toString()))
                .header("Content-Type", "application/json")
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("HTTP error code: " + response.statusCode());
        }
    }

    public UserDTO findUserById(Integer idUser) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/FindUserByID/" + idUser))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JSONObject jsonResponse = new JSONObject(response.body());
            UserDTO user = new UserDTO();
            user.setIdUser(jsonResponse.getInt("idUser"));
            user.setUsername(jsonResponse.getString("username"));
            user.setPassword(jsonResponse.getString("password"));
            user.setRole(jsonResponse.getInt("role"));
            return user;
        } else {
            throw new IOException("HTTP error code: " + response.statusCode());
        }
    }

    public void deleteUser(Integer idUser) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/DeleteUser" + "/" + idUser))
                .DELETE()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 204) {
            throw new IOException("HTTP error code: " + response.statusCode());
        }
    }

    public List<UserDTO> getUsersByRole(Integer userType) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(BASE_URL + "/FilterByUserType/" + userType))
                .GET()
                .build();
        List<UserDTO> users = new ArrayList<>();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 200) {
                JSONArray jsonArray = new JSONArray(response.body());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    UserDTO user = new UserDTO();
                    user.setIdUser(jsonObject.getInt("idUser"));
                    user.setUsername(jsonObject.getString("username"));
                    user.setPassword(jsonObject.getString("password"));
                    user.setRole(jsonObject.getInt("role"));
                    users.add(user);

                }

            } else {
                throw new IOException("HTTP error code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            // Handle exception
            e.printStackTrace();
        }
        return users;
    }

}
