package org.example.client;

import org.example.client.view.LoginForm;

import javax.swing.*;

public class ClientApplication {
    public static void main(String[] args) {

        LoginForm loginForm = new LoginForm();
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(loginForm.getPanel1()); // Add the JPanel from Login to the JFrame
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible


    }
}
