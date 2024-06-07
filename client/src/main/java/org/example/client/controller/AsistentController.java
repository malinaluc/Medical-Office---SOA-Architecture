package org.example.client.controller;

import org.example.client.utils.SessionManager;
import org.example.client.view.AsistentForm;
import org.example.client.view.LoginForm;

import javax.swing.*;

public class AsistentController {

    AsistentForm asistentForm;

    public AsistentController(AsistentForm asistentForm) {
        this.asistentForm = asistentForm;
        asistentForm.getAsistentLogOutButton().addActionListener(e -> handleLogOutAction());
    }


    private void handleLogOutAction() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(asistentForm.getMainPanel());
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
}
