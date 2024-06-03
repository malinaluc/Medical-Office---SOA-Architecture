package org.example.server.service;


import org.example.server.dto.UserDTO;
import org.example.server.model.entities.User;
import org.example.server.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User verifyCredentials(String username, String password) {
        try {

            User user = userRepository.findByUsername(username);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public UserDTO userToDTO(User user) {

        return new UserDTO(user.getIdUser(), user.getUsername(), user.getPassword(), user.getRole());

    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Integer userId, User user) {
        if (userRepository.existsById(userId)) {
            user.setIdUser(userId);
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Integer idUSer) {
        userRepository.deleteById(idUSer);
    }

    public List<User> findyAllUsersByUserType(Integer userType) {
        return userRepository.findAllByRole(userType);
    }

    public User findByIdUser(Integer idUser) {
        return userRepository.findByIdUser(idUser);
    }

}
