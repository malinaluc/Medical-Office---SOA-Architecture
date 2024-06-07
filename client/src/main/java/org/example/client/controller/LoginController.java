package org.example.client.controller;

import org.example.client.dto.UserDTO;
import org.example.client.service.UserService;
import org.example.client.utils.LanguageManager;
import org.example.client.utils.SessionManager;
import org.example.client.view.*;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.io.IOException;

import static org.example.client.utils.ExtensionFunctions.logDebug;

@Controller
public class LoginController {

    private final LoginForm loginForm;
    private final UserService userService;

    public LoginController(LoginForm loginForm) {
        this.loginForm = loginForm;
        this.userService = new UserService();

        this.loginForm.getLoginButton().addActionListener(e -> handleLoginAction());
        this.loginForm.getSkipLoginButton().addActionListener(e -> handleSkipLoginAction());
    }

    private void handleLoginAction() {

        String username = loginForm.getUsernameTextField().getText();
        char[] passwordChar = loginForm.getPasswordTextField().getPassword();
        String password = new String(passwordChar);
        String selectedLanguage = String.valueOf(loginForm.getLanguageComboBox().getSelectedItem());
        logDebug("Username = " + username + " and Password = " + password);
        System.out.println(selectedLanguage);
        LanguageManager.loadLanguage(LanguageManager.stirngToLanguage(selectedLanguage));


        try {
            UserDTO user = userService.LoginAction(username, password);

            if (user == null) logDebug("[Handle login action ] user null");

            if (user != null) {
                SessionManager.getInstance().loginUser(user.getIdUser(), user.getUsername(), user.getPassword());
                if (user.getRole() == 2) showMedicForm();
                else if (user.getRole() == 1) showAdminForm();
                else showAsistentForm();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or password", "Error Message", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void handleSkipLoginAction() {
        String selectedLanguage = String.valueOf(loginForm.getLanguageComboBox().getSelectedItem());
        LanguageManager.loadLanguage(LanguageManager.stirngToLanguage(selectedLanguage));
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        NoAuthentificationForm noAuthentificationForm = new NoAuthentificationForm();
        JFrame noAuthentificationFrame = new JFrame("No Authentification");
        noAuthentificationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        noAuthentificationFrame.getContentPane().add(noAuthentificationForm.getPanel1());
        noAuthentificationFrame.setSize(700, 700);
        noAuthentificationFrame.setLocationRelativeTo(null);
        noAuthentificationFrame.setVisible(true);

    }

    public void showMedicForm() {

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        MedicForm medicForm = new MedicForm();
        JFrame medicFrame = new JFrame("Medic Form");
        medicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        medicFrame.getContentPane().add(medicForm.getPanel1());
        medicFrame.setSize(700, 700);
        medicFrame.setLocationRelativeTo(null);
        medicFrame.setVisible(true);
    }

    public void showAdminForm() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        AdminForm adminForm = new AdminForm();
        JFrame adminFrame = new JFrame("Admin Form");
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.getContentPane().add(adminForm.getPanel1());
        adminFrame.setSize(700, 700);
        adminFrame.setLocationRelativeTo(null);
        adminFrame.setVisible(true);
    }

    public void showAsistentForm() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        AsistentForm asistentForm = new AsistentForm();
        JFrame asistentFrame = new JFrame("Asistent Frame");
        asistentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        asistentFrame.getContentPane().add(asistentForm.getMainPanel());
        asistentFrame.setSize(700, 700);
        asistentFrame.setLocationRelativeTo(null);
        asistentFrame.setVisible(true);
    }

}
