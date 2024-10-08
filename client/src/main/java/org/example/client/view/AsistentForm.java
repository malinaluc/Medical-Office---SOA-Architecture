package org.example.client.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;
import org.example.client.controller.AsistentController;
import org.example.client.utils.LanguageManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

@Getter
public class AsistentForm {
    private JPanel mainPanel;
    private JLabel asistentLabel;
    private JLabel asistentIconLabel;
    private JButton asistentLogOutButton;
    private JLabel asistentVizualizareFiseMedicaleLabel;
    private JLabel asistentActualizareFisaMedicalaLabel;
    private JPanel asistentMainPanel;
    private JTextArea asistentVizualizareFiseMedicaleTextArea;
    private JTextField asistentIDFisaActualizareFisaTextField;
    private JTextField asistentVarstaPacientActualizareFisaTextField;
    private JTextField asistentMedicApartinatorActualizareFisaTextField;
    private JTextField asistentAsistentApartinatorTextField;
    private JButton asistentActualizareFisaButton;
    private JButton asistentCautarePacientButton;
    private JTextField asistentNumeCautarePacientTextField;
    private JTextArea asistentCautarePacientTextArea;
    private JTextField asistentDiagnosticCreareFisaTextField;
    private JTextField asistentTratamentCreareFisaTextField;
    private JTextField asistentSimptomeCreareFisaTtextField;
    private JTextField asistentVarstaPacientCreareFisaTextField;
    private JTextField asistentMedicCreareFisaTextField;
    private JTextField asistentAsistentCreareFisaTextField;
    private JTextField asistentNumePacientCreareFisaTextField;
    private JButton asistentCreareFisaButton;
    private JComboBox asistentFiltrareDiagnosticComboBox;
    private JTextArea asistentFiltrareDiagnosticTextArea;
    private JComboBox asistentFiltrareVarstaComboBox;
    private JTextArea asistentFiltrareVarstaTextArea;
    private JComboBox asistentFiltrareMedicComboBox;
    private JTextArea asistentFiltrareMedicTextArea;
    private JTextField asistentIDFisaStergereTextField;
    private JButton asistentStergereFisaButton;
    private JTextField asistentOraInceputAdaugareConsultatieTextField;
    private JTextField asistentOraFinalAdaugareConsultatieTextField;
    private JTextField asistentNumePacientAdaugareConsultatieTextField;
    private JTextField asistentMedicAdaugareConsultatieTextField;
    private JButton asistentAdaugareConsultatieButton;
    private JButton asistentVizualizareStatisticiButton;
    private JLabel asistentAdaugareConsultatieLabel;
    private JLabel asistentOraInceputLabel;
    private JLabel asistentOraFinalLabel;
    private JLabel asistentNumePacientLabel;
    private JLabel asistentMedicAdaugareConsultatieLabel;
    private JLabel asistentIDFisaStergereFisaLabel;
    private JLabel asistentMedicFiltrareLabel;
    private JLabel asistentDiagnosticFiltrareLabel;
    private JLabel asistentVarstaFiltrareLabel;
    private JLabel asistentFiltrarePacientiLabel;
    private JLabel asistentDiagnosticCreareLabel;
    private JLabel asistentTratamentCreareLabel;
    private JLabel asistentSimptomeCreareLabel;
    private JLabel asistentVarstaPacientCreareLabel;
    private JLabel asistentMedicApartinatorCreareLabel;
    private JLabel asistentAsistentApartinatorCreareLabel;
    private JLabel asistentNumePacientCreareLabel;
    private JLabel asistentCautarePacientLabel;
    private JLabel asistentNumeCautarePacientLabel;
    private JLabel asistentIDFisaActualizareLabel;
    private JLabel asistentVarstaPacientActualizareLabel;
    private JLabel asistentMedicApartinatorActualizareLabel;
    private JLabel asistentAsistentApartinatorActualizareLabel;
    private JButton asistentVizualizareFiseMedicaleButton;
    private JLabel asistentStergereFisaLabel;
    private JLabel asistentCreareFisaMedicalaLabell;
    private JButton asistentXMLButton;
    private JButton asistentJSONButton;
    private JButton asistentCSVButton;
    private JButton asistentDOCButton;

    private AsistentController asistentController;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    public AsistentForm() {
        asistentController = new AsistentController(this);
        languageSetter();
    }

    public void languageSetter() {
        this.asistentLabel.setText(LanguageManager.getString("asistentLabel"));
        this.asistentVizualizareFiseMedicaleLabel.setText(LanguageManager.getString("asistentVizualizareFiseMedicaleLabel"));
        this.asistentActualizareFisaMedicalaLabel.setText(LanguageManager.getString("asistentActualizareFisaMedicalaLabel"));
        this.asistentCreareFisaMedicalaLabell.setText(LanguageManager.getString("asistentCreareFisaMedicalaLabell"));
        this.asistentFiltrarePacientiLabel.setText(LanguageManager.getString("asistentFiltrarePacientiLabel"));
        this.asistentStergereFisaLabel.setText(LanguageManager.getString("asistentStergereFisaLabel"));
        this.asistentIDFisaActualizareLabel.setText(LanguageManager.getString("asistentIDFisaActualizareLabel"));
        this.asistentVarstaPacientActualizareLabel.setText(LanguageManager.getString("asistentVarstaPacientActualizareLabel"));
        this.asistentMedicApartinatorActualizareLabel.setText(LanguageManager.getString("asistentMedicApartinatorActualizareLabel"));
        this.asistentAsistentApartinatorActualizareLabel.setText(LanguageManager.getString("asistentAsistentApartinatorActualizareLabel"));
        this.asistentDiagnosticCreareLabel.setText(LanguageManager.getString("asistentDiagnosticCreareLabel"));
        this.asistentTratamentCreareLabel.setText(LanguageManager.getString("asistentTratamentCreareLabel"));
        this.asistentSimptomeCreareLabel.setText(LanguageManager.getString("asistentSimptomeCreareLabel"));
        this.asistentVarstaPacientCreareLabel.setText(LanguageManager.getString("asistentVarstaPacientCreareLabel"));
        this.asistentMedicApartinatorCreareLabel.setText(LanguageManager.getString("asistentMedicApartinatorCreareLabel"));
        this.asistentAsistentApartinatorCreareLabel.setText(LanguageManager.getString("asistentAsistentApartinatorCreareLabel"));
        this.asistentNumePacientCreareLabel.setText(LanguageManager.getString("asistentNumePacientCreareLabel"));
        this.asistentCautarePacientLabel.setText(LanguageManager.getString("asistentCautarePacientLabel"));
        this.asistentNumeCautarePacientLabel.setText(LanguageManager.getString("asistentNumeCautarePacientLabel"));
        this.asistentIDFisaStergereFisaLabel.setText(LanguageManager.getString("asistentIDFisaStergereFisaLabel"));
        this.asistentDiagnosticFiltrareLabel.setText(LanguageManager.getString("asistentDiagnosticFiltrareLabel"));
        this.asistentVarstaFiltrareLabel.setText(LanguageManager.getString("asistentVarstaFiltrareLabel"));
        this.asistentMedicFiltrareLabel.setText(LanguageManager.getString("asistentMedicFiltrareLabel"));
        this.asistentAdaugareConsultatieLabel.setText(LanguageManager.getString("asistentAdaugareConsultatieLabel"));
        this.asistentOraInceputLabel.setText(LanguageManager.getString("asistentOraInceputLabel"));
        this.asistentOraFinalLabel.setText(LanguageManager.getString("asistentOraFinalLabel"));
        this.asistentNumePacientLabel.setText(LanguageManager.getString("asistentNumePacientLabel"));
        this.asistentMedicAdaugareConsultatieLabel.setText(LanguageManager.getString("asistentMedicAdaugareConsultatieLabel"));
        this.asistentActualizareFisaButton.setText(LanguageManager.getString("asistentActualizareFisaButton"));
        this.asistentCreareFisaButton.setText(LanguageManager.getString("asistentCreareFisaButton"));
        this.asistentCautarePacientButton.setText(LanguageManager.getString("asistentCautarePacientButton"));
        this.asistentVizualizareFiseMedicaleButton.setText(LanguageManager.getString("asistentVizualizareFiseMedicaleButton"));
        this.asistentStergereFisaButton.setText(LanguageManager.getString("asistentStergereFisaButton"));
        this.asistentAdaugareConsultatieButton.setText(LanguageManager.getString("asistentAdaugareConsultatieButton"));
        this.asistentCSVButton.setText(LanguageManager.getString("asistentCSVButton"));
        this.asistentJSONButton.setText(LanguageManager.getString("asistentJSONButton"));
        this.asistentXMLButton.setText(LanguageManager.getString("asistentXMLButton"));
        this.asistentDOCButton.setText(LanguageManager.getString("asistentDOCButton"));
        this.asistentLogOutButton.setText(LanguageManager.getString("asistentLogOutButton"));

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-2383653));
        asistentMainPanel = new JPanel();
        asistentMainPanel.setLayout(new GridLayoutManager(18, 7, new Insets(0, 0, 0, 0), -1, -1));
        asistentMainPanel.setBackground(new Color(-2526763));
        mainPanel.add(asistentMainPanel, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        asistentVizualizareFiseMedicaleLabel = new JLabel();
        asistentVizualizareFiseMedicaleLabel.setText("Vizualizare fise medicale");
        asistentMainPanel.add(asistentVizualizareFiseMedicaleLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentActualizareFisaMedicalaLabel = new JLabel();
        asistentActualizareFisaMedicalaLabel.setText("Actualizare fisa medicala");
        asistentMainPanel.add(asistentActualizareFisaMedicalaLabel, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaMedicalaLabell = new JLabel();
        asistentCreareFisaMedicalaLabell.setText("Creare fisa medicala");
        asistentMainPanel.add(asistentCreareFisaMedicalaLabell, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiLabel = new JLabel();
        asistentFiltrarePacientiLabel.setText("Filtrare pacienti");
        asistentMainPanel.add(asistentFiltrarePacientiLabel, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentStergereFisaLabel = new JLabel();
        asistentStergereFisaLabel.setText("Stergere fisa");
        asistentMainPanel.add(asistentStergereFisaLabel, new GridConstraints(2, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentIconLabel = new JLabel();
        asistentIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/asistent.png")));
        asistentIconLabel.setText("");
        asistentMainPanel.add(asistentIconLabel, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentLabel = new JLabel();
        Font asistentLabelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, asistentLabel.getFont());
        if (asistentLabelFont != null) asistentLabel.setFont(asistentLabelFont);
        asistentLabel.setForeground(new Color(-13893586));
        asistentLabel.setText("Asistent");
        asistentMainPanel.add(asistentLabel, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentLogOutButton = new JButton();
        asistentLogOutButton.setBackground(new Color(-2383653));
        asistentLogOutButton.setText("Log out");
        asistentMainPanel.add(asistentLogOutButton, new GridConstraints(0, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVizualizareFiseMedicaleTextArea = new JTextArea();
        asistentMainPanel.add(asistentVizualizareFiseMedicaleTextArea, new GridConstraints(3, 0, 14, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentIDFisaActualizareLabel = new JLabel();
        asistentIDFisaActualizareLabel.setText("ID Fisa");
        asistentMainPanel.add(asistentIDFisaActualizareLabel, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentIDFisaActualizareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentIDFisaActualizareFisaTextField, new GridConstraints(4, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentVarstaPacientActualizareLabel = new JLabel();
        asistentVarstaPacientActualizareLabel.setText("Varsta pacient");
        asistentMainPanel.add(asistentVarstaPacientActualizareLabel, new GridConstraints(5, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVarstaPacientActualizareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentVarstaPacientActualizareFisaTextField, new GridConstraints(6, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentMedicApartinatorActualizareLabel = new JLabel();
        asistentMedicApartinatorActualizareLabel.setText("Medic aparinator");
        asistentMainPanel.add(asistentMedicApartinatorActualizareLabel, new GridConstraints(7, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentMedicApartinatorActualizareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentMedicApartinatorActualizareFisaTextField, new GridConstraints(8, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentAsistentApartinatorActualizareLabel = new JLabel();
        asistentAsistentApartinatorActualizareLabel.setText("Asistent apartinator");
        asistentMainPanel.add(asistentAsistentApartinatorActualizareLabel, new GridConstraints(9, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAsistentApartinatorTextField = new JTextField();
        asistentMainPanel.add(asistentAsistentApartinatorTextField, new GridConstraints(10, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareFisaButton = new JButton();
        asistentActualizareFisaButton.setBackground(new Color(-2383653));
        asistentActualizareFisaButton.setText("Actualizare");
        asistentMainPanel.add(asistentActualizareFisaButton, new GridConstraints(11, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentDiagnosticCreareLabel = new JLabel();
        asistentDiagnosticCreareLabel.setText("Diagnostic");
        asistentMainPanel.add(asistentDiagnosticCreareLabel, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentDiagnosticCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentDiagnosticCreareFisaTextField, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentTratamentCreareLabel = new JLabel();
        asistentTratamentCreareLabel.setText("Tratament");
        asistentMainPanel.add(asistentTratamentCreareLabel, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentTratamentCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentTratamentCreareFisaTextField, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentSimptomeCreareLabel = new JLabel();
        asistentSimptomeCreareLabel.setText("Simptome");
        asistentMainPanel.add(asistentSimptomeCreareLabel, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentSimptomeCreareFisaTtextField = new JTextField();
        asistentMainPanel.add(asistentSimptomeCreareFisaTtextField, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentVarstaPacientCreareLabel = new JLabel();
        asistentVarstaPacientCreareLabel.setText("Varsta pacient");
        asistentMainPanel.add(asistentVarstaPacientCreareLabel, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVarstaPacientCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentVarstaPacientCreareFisaTextField, new GridConstraints(10, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentMedicApartinatorCreareLabel = new JLabel();
        asistentMedicApartinatorCreareLabel.setText("Medic apartinator");
        asistentMainPanel.add(asistentMedicApartinatorCreareLabel, new GridConstraints(11, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentMedicCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentMedicCreareFisaTextField, new GridConstraints(12, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentAsistentApartinatorCreareLabel = new JLabel();
        asistentAsistentApartinatorCreareLabel.setText("Asistent apartinator");
        asistentMainPanel.add(asistentAsistentApartinatorCreareLabel, new GridConstraints(13, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAsistentCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentAsistentCreareFisaTextField, new GridConstraints(14, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentNumePacientCreareLabel = new JLabel();
        asistentNumePacientCreareLabel.setText("Nume pacient");
        asistentMainPanel.add(asistentNumePacientCreareLabel, new GridConstraints(15, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentNumePacientCreareFisaTextField = new JTextField();
        asistentMainPanel.add(asistentNumePacientCreareFisaTextField, new GridConstraints(16, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaButton = new JButton();
        asistentCreareFisaButton.setBackground(new Color(-2383653));
        asistentCreareFisaButton.setText("Creare");
        asistentMainPanel.add(asistentCreareFisaButton, new GridConstraints(17, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientTextArea = new JTextArea();
        asistentMainPanel.add(asistentCautarePacientTextArea, new GridConstraints(16, 1, 2, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentNumeCautarePacientTextField = new JTextField();
        asistentMainPanel.add(asistentNumeCautarePacientTextField, new GridConstraints(15, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCautarePacientButton = new JButton();
        asistentCautarePacientButton.setBackground(new Color(-2383653));
        asistentCautarePacientButton.setText("Cautare");
        asistentMainPanel.add(asistentCautarePacientButton, new GridConstraints(14, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentNumeCautarePacientLabel = new JLabel();
        asistentNumeCautarePacientLabel.setText("Nume");
        asistentMainPanel.add(asistentNumeCautarePacientLabel, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientLabel = new JLabel();
        asistentCautarePacientLabel.setText("Cautare pacient");
        asistentMainPanel.add(asistentCautarePacientLabel, new GridConstraints(13, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentDiagnosticFiltrareLabel = new JLabel();
        asistentDiagnosticFiltrareLabel.setText("Diagnostic");
        asistentMainPanel.add(asistentDiagnosticFiltrareLabel, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareDiagnosticComboBox = new JComboBox();
        asistentMainPanel.add(asistentFiltrareDiagnosticComboBox, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareDiagnosticTextArea = new JTextArea();
        asistentMainPanel.add(asistentFiltrareDiagnosticTextArea, new GridConstraints(5, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentVarstaFiltrareLabel = new JLabel();
        asistentVarstaFiltrareLabel.setText("Varsta");
        asistentMainPanel.add(asistentVarstaFiltrareLabel, new GridConstraints(7, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareVarstaComboBox = new JComboBox();
        asistentMainPanel.add(asistentFiltrareVarstaComboBox, new GridConstraints(8, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareVarstaTextArea = new JTextArea();
        asistentMainPanel.add(asistentFiltrareVarstaTextArea, new GridConstraints(9, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentMedicFiltrareLabel = new JLabel();
        asistentMedicFiltrareLabel.setText("Medic");
        asistentMainPanel.add(asistentMedicFiltrareLabel, new GridConstraints(11, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareMedicComboBox = new JComboBox();
        asistentMainPanel.add(asistentFiltrareMedicComboBox, new GridConstraints(12, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrareMedicTextArea = new JTextArea();
        asistentMainPanel.add(asistentFiltrareMedicTextArea, new GridConstraints(13, 4, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentIDFisaStergereFisaLabel = new JLabel();
        asistentIDFisaStergereFisaLabel.setText("ID Fisa");
        asistentMainPanel.add(asistentIDFisaStergereFisaLabel, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentIDFisaStergereTextField = new JTextField();
        asistentMainPanel.add(asistentIDFisaStergereTextField, new GridConstraints(4, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentStergereFisaButton = new JButton();
        asistentStergereFisaButton.setBackground(new Color(-343057));
        asistentStergereFisaButton.setText("Stergere");
        asistentMainPanel.add(asistentStergereFisaButton, new GridConstraints(3, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAdaugareConsultatieLabel = new JLabel();
        asistentAdaugareConsultatieLabel.setText("Adaugare Consultatie");
        asistentMainPanel.add(asistentAdaugareConsultatieLabel, new GridConstraints(6, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentOraInceputLabel = new JLabel();
        asistentOraInceputLabel.setText("Ora inceput");
        asistentMainPanel.add(asistentOraInceputLabel, new GridConstraints(7, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentOraInceputAdaugareConsultatieTextField = new JTextField();
        asistentMainPanel.add(asistentOraInceputAdaugareConsultatieTextField, new GridConstraints(8, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentOraFinalLabel = new JLabel();
        asistentOraFinalLabel.setText("Ora final");
        asistentMainPanel.add(asistentOraFinalLabel, new GridConstraints(9, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentOraFinalAdaugareConsultatieTextField = new JTextField();
        asistentMainPanel.add(asistentOraFinalAdaugareConsultatieTextField, new GridConstraints(10, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentNumePacientLabel = new JLabel();
        asistentNumePacientLabel.setText("Nume pacient");
        asistentMainPanel.add(asistentNumePacientLabel, new GridConstraints(11, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentNumePacientAdaugareConsultatieTextField = new JTextField();
        asistentMainPanel.add(asistentNumePacientAdaugareConsultatieTextField, new GridConstraints(12, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentMedicAdaugareConsultatieLabel = new JLabel();
        asistentMedicAdaugareConsultatieLabel.setText("Medic");
        asistentMainPanel.add(asistentMedicAdaugareConsultatieLabel, new GridConstraints(13, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentMedicAdaugareConsultatieTextField = new JTextField();
        asistentMainPanel.add(asistentMedicAdaugareConsultatieTextField, new GridConstraints(14, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentAdaugareConsultatieButton = new JButton();
        asistentAdaugareConsultatieButton.setBackground(new Color(-2383653));
        asistentAdaugareConsultatieButton.setText("Adaugare");
        asistentMainPanel.add(asistentAdaugareConsultatieButton, new GridConstraints(15, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVizualizareStatisticiButton = new JButton();
        asistentVizualizareStatisticiButton.setBackground(new Color(-2383653));
        asistentVizualizareStatisticiButton.setText("Vizualizare statistici");
        asistentMainPanel.add(asistentVizualizareStatisticiButton, new GridConstraints(17, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVizualizareFiseMedicaleButton = new JButton();
        asistentVizualizareFiseMedicaleButton.setBackground(new Color(-2383653));
        asistentVizualizareFiseMedicaleButton.setText("Vizualizare");
        asistentMainPanel.add(asistentVizualizareFiseMedicaleButton, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentXMLButton = new JButton();
        asistentXMLButton.setBackground(new Color(-2383653));
        asistentXMLButton.setText("XML");
        asistentMainPanel.add(asistentXMLButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentJSONButton = new JButton();
        asistentJSONButton.setBackground(new Color(-2383653));
        asistentJSONButton.setText("JSON");
        asistentMainPanel.add(asistentJSONButton, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCSVButton = new JButton();
        asistentCSVButton.setBackground(new Color(-2383653));
        asistentCSVButton.setText("CSV");
        asistentMainPanel.add(asistentCSVButton, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentDOCButton = new JButton();
        asistentDOCButton.setBackground(new Color(-2383653));
        asistentDOCButton.setText("DOC");
        asistentMainPanel.add(asistentDOCButton, new GridConstraints(1, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        mainPanel.add(spacer3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        mainPanel.add(spacer4, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
