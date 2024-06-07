package org.example.client.controller;


import org.example.client.dto.UserDTO;
import org.example.client.service.UserService;
import org.example.client.utils.SessionManager;
import org.example.client.utils.UserIterator;
import org.example.client.view.AdminForm;
import org.example.client.view.LoginForm;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class AdminController {
    private final UserService userService;
    AdminForm adminForm;


    public AdminController(AdminForm adminForm, UserService userService) {

        this.userService = userService;
        this.adminForm = adminForm;
        adminForm.getAdminLogOutButton().addActionListener(e -> handleLogOutAction());
        adminForm.getAdminVizualizareUsersButton().addActionListener(e -> handleViewAllUsers());
        adminForm.getAdminCreareUserButton().addActionListener(e -> handleCreateUser());
        adminForm.getAdminUpdateUserButton().addActionListener(e -> handleUpdateUser());
        adminForm.getAdminStergereUserButton().addActionListener(e -> handleDeleteUser());
        adminForm.getAdminFiltrareUtilizatorComboBox().addActionListener(e -> handleFilterUsersByUserType());
    }

    private void handleLogOutAction() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(adminForm.getPanel1());
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

    private void handleViewAllUsers() {
        try {
            adminForm.getAdminVizualizareUsersTextArea().setText("");
            List<UserDTO> users = userService.getAllUsers();
            UserIterator iterator = new UserIterator(users);
            while (iterator.hasNext()) {
                UserDTO userDTO = iterator.next();
                String rol = (userDTO.getRole() == 1) ? "administrator" : (userDTO.getRole() == 2) ? "medic" : "asistent";
                adminForm.getAdminVizualizareUsersTextArea().append(
                        "ID User:  " + userDTO.getIdUser() + "\n" +
                                "Username: " + userDTO.getUsername() + "\n" +
                                "Password: " + userDTO.getPassword() + "\n" +
                                "Role: " + rol + "\n\n"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCreateUser() {

        UserDTO user = new UserDTO();
        user.setUsername(adminForm.getAdminUsernameCreareTextField().getText());
        user.setPassword(adminForm.getAdminPasswordCreareTextField().getText());
        user.setRole(Integer.parseInt(adminForm.getAdminTipUserCreareTextField().getText()));
        try {
            userService.addUser(user);
            handleViewAllUsers();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleUpdateUser() {

        String username = adminForm.getAdminUsernameUpdateTextField().getText();
        String password = adminForm.getAdminPassowrdUpdateTextField().getText();
        Integer idUser = Integer.parseInt(adminForm.getAdminIDUserUpdateTextField().getText());

        try {
            UserDTO existingUser = userService.findUserById(idUser);

            UserDTO userDTO = new UserDTO();
            userDTO.setPassword(password);
            userDTO.setUsername(username);
            userDTO.setRole(existingUser.getRole());

            userService.updateUser(idUser, userDTO);
            handleViewAllUsers();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void handleDeleteUser() {

        Integer idUserToBeDeleted = Integer.parseInt(adminForm.getAdminStergereUserTextField().getText());
        try {
            userService.deleteUser(idUserToBeDeleted);
            handleViewAllUsers();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void handleFilterUsersByUserType() {
        String userType = adminForm.getAdminFiltrareUtilizatorComboBox().getSelectedItem().toString();
        Integer role;
        if (userType.equals("Admin")) role = 1;
        else if (userType.equals("Medic")) role = 2;
        else role = 3;

        adminForm.getAdminFiltrareUtilizatoriTextArea().setText("");

        try {
            List<UserDTO> users = userService.getUsersByRole(role);
            UserIterator iterator = new UserIterator(users);
            while (iterator.hasNext()) {
                UserDTO userDTO = iterator.next();
                String rol = (userDTO.getRole() == 1) ? "administrator" : (userDTO.getRole() == 2) ? "medic" : "asistent";
                adminForm.getAdminFiltrareUtilizatoriTextArea().append(
                        "ID User:  " + userDTO.getIdUser() + "\n" +
                                "Username: " + userDTO.getUsername() + "\n" +
                                "Password: " + userDTO.getPassword() + "\n" +
                                "Role: " + rol + "\n\n"
                );
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}
