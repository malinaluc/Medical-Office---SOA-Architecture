package org.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private Integer idUser;
    private String username;
    private String password;
    private Integer role;


}
