package org.example.server.controller;

import org.example.server.dto.UserDTO;
import org.example.server.model.entities.User;
import org.example.server.response.LoginRequest;
import org.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(name = "/GetAllUsers")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        List<UserDTO> userDTOS = new ArrayList<>();
        users.forEach(u -> userDTOS.add(userService.userToDTO(u)));
        return new ResponseEntity<>(userDTOS, HttpStatus.OK);
    }

    @PostMapping(value = "/login", name = "LoginUser")
    public ResponseEntity<UserDTO> loginUser(@RequestBody LoginRequest loginRequest) {

        User user = userService.verifyCredentials(loginRequest.getUsername(), loginRequest.getPassword());

        UserDTO userDTO = userService.userToDTO(user);

        if (userDTO != null) {
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}
