package org.example.client.controller;

import org.example.client.view.LoginForm;
import org.example.client.view.NoAuthentificationForm;

import javax.swing.*;

public class NoAuthentificationController {

    NoAuthentificationForm noAuthentificationForm;

    public NoAuthentificationController(NoAuthentificationForm noAuthentificationForm) {

        this.noAuthentificationForm = noAuthentificationForm;
        noAuthentificationForm.getGoBackButton().addActionListener(e -> handleGoBackAction());
    }

    private void handleGoBackAction() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(noAuthentificationForm.getPanel1());
        frame.setVisible(false);
        LoginForm loginForm = new LoginForm();
        JFrame loginFrame = new JFrame("Login Form");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.getContentPane().add(loginForm.getPanel1()); // Add the JPanel from Login to the JFrame
        loginFrame.setSize(700, 700);
        loginFrame.setLocationRelativeTo(null); // Center the frame on the screen
        loginFrame.setVisible(true); // Make the frame visible
    }


}
