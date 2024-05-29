package org.example.client.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

@Getter
public class MedicForm {
    private JPanel panel1;
    private JLabel medicIconLabel;
    private JLabel medicLabel;
    private JPanel mainPanel;
    private JTextArea medicVizualizareFiseTextArea;
    private JButton medicVizualizareFiseButton;
    private JLabel medicVizualizareFiseLabel;
    private JTextField medicIDFisaActualizareTextField;
    private JTextField medicSimptomeActualizareTextField;
    private JTextField medicDiagnosticActualizareTtextField;
    private JTextField medicTratamentActualizareTextField;
    private JButton medicActualizareFisaButton;
    private JLabel medicIdFisaUpdateLabel;
    private JLabel medicSimptomeUpdateLabel;
    private JLabel medicUpdateDiagnosticLabel;
    private JLabel medicUpdateTratamentLabel;
    private JLabel actualizmedicAreFisaLabel;
    private JLabel medicFiltrarePacientiLabel;
    private JTextArea medicFiltrarePacientiDiagnosticTextArea;
    private JLabel medicDiagnosticFiltrareLabel;
    private JLabel medicTratamentFiltrareLabel;
    private JTextArea medicFiltrarePacientiTratamentTextArea;
    private JComboBox medicFiltrareDiagnosticComboBox;
    private JComboBox medicFiltrareTratamentComboBox;
    private JLabel medicCautarePacientLabel;
    private JLabel medicNumePacientLabel;
    private JButton medicCautarePacientNumeButton;
    private JTextArea medicCautareNumePacientTextArea;
    private JLabel medicProgramDeLucruLabel;
    private JTextField medicOraInceputProgramTextField;
    private JTextField medicOraFinalProgramTextField;
    private JButton medicProgramLucruButton;
    private JLabel medicProgramConsultatiiLabel;
    private JTextArea medicProgramConsultatiiTextArea;
    private JButton medicVizualizareProgConsultatiiButton;
    private JLabel medicOraIncepuLabel;
    private JLabel medicOraFinalLabel;
    private JButton medicLogOutButton;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-2383653));
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(14, 7, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-2526763));
        panel1.add(mainPanel, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        medicVizualizareFiseTextArea = new JTextArea();
        mainPanel.add(medicVizualizareFiseTextArea, new GridConstraints(3, 0, 10, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicIdFisaUpdateLabel = new JLabel();
        medicIdFisaUpdateLabel.setText("ID Fisa ");
        mainPanel.add(medicIdFisaUpdateLabel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicActualizareFisaButton = new JButton();
        medicActualizareFisaButton.setBackground(new Color(-2383653));
        medicActualizareFisaButton.setText("Actualizare");
        mainPanel.add(medicActualizareFisaButton, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicVizualizareFiseButton = new JButton();
        medicVizualizareFiseButton.setBackground(new Color(-2383653));
        medicVizualizareFiseButton.setText("Vizualizare");
        mainPanel.add(medicVizualizareFiseButton, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        actualizmedicAreFisaLabel = new JLabel();
        actualizmedicAreFisaLabel.setText("Actualizare fisa");
        mainPanel.add(actualizmedicAreFisaLabel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicVizualizareFiseLabel = new JLabel();
        medicVizualizareFiseLabel.setText("Vizualizare fise");
        mainPanel.add(medicVizualizareFiseLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrarePacientiLabel = new JLabel();
        medicFiltrarePacientiLabel.setText("Filtrare pacienti");
        mainPanel.add(medicFiltrarePacientiLabel, new GridConstraints(2, 2, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicDiagnosticFiltrareLabel = new JLabel();
        medicDiagnosticFiltrareLabel.setText("Diagnostic");
        mainPanel.add(medicDiagnosticFiltrareLabel, new GridConstraints(3, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrarePacientiDiagnosticTextArea = new JTextArea();
        mainPanel.add(medicFiltrarePacientiDiagnosticTextArea, new GridConstraints(5, 2, 3, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicFiltrareDiagnosticComboBox = new JComboBox();
        mainPanel.add(medicFiltrareDiagnosticComboBox, new GridConstraints(4, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicIDFisaActualizareTextField = new JTextField();
        mainPanel.add(medicIDFisaActualizareTextField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicSimptomeUpdateLabel = new JLabel();
        medicSimptomeUpdateLabel.setText("Simptome");
        mainPanel.add(medicSimptomeUpdateLabel, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicSimptomeActualizareTextField = new JTextField();
        mainPanel.add(medicSimptomeActualizareTextField, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicUpdateDiagnosticLabel = new JLabel();
        medicUpdateDiagnosticLabel.setText("Diagnostic");
        mainPanel.add(medicUpdateDiagnosticLabel, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicDiagnosticActualizareTtextField = new JTextField();
        mainPanel.add(medicDiagnosticActualizareTtextField, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicUpdateTratamentLabel = new JLabel();
        medicUpdateTratamentLabel.setText("Tratament");
        mainPanel.add(medicUpdateTratamentLabel, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicTratamentActualizareTextField = new JTextField();
        mainPanel.add(medicTratamentActualizareTextField, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicCautarePacientLabel = new JLabel();
        medicCautarePacientLabel.setText("Cautare pacient");
        mainPanel.add(medicCautarePacientLabel, new GridConstraints(2, 4, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicNumePacientLabel = new JLabel();
        medicNumePacientLabel.setText("Nume");
        mainPanel.add(medicNumePacientLabel, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicCautarePacientNumeButton = new JButton();
        medicCautarePacientNumeButton.setBackground(new Color(-2383653));
        medicCautarePacientNumeButton.setText("Cautare");
        mainPanel.add(medicCautarePacientNumeButton, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicCautareNumePacientTextArea = new JTextArea();
        mainPanel.add(medicCautareNumePacientTextArea, new GridConstraints(4, 4, 4, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicProgramConsultatiiLabel = new JLabel();
        medicProgramConsultatiiLabel.setText("Program consultatii");
        mainPanel.add(medicProgramConsultatiiLabel, new GridConstraints(2, 6, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicProgramConsultatiiTextArea = new JTextArea();
        mainPanel.add(medicProgramConsultatiiTextArea, new GridConstraints(4, 6, 9, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicVizualizareProgConsultatiiButton = new JButton();
        medicVizualizareProgConsultatiiButton.setBackground(new Color(-2383653));
        medicVizualizareProgConsultatiiButton.setText("Vizualizare");
        mainPanel.add(medicVizualizareProgConsultatiiButton, new GridConstraints(13, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicProgramLucruButton = new JButton();
        medicProgramLucruButton.setBackground(new Color(-2383653));
        medicProgramLucruButton.setText("Introducere");
        mainPanel.add(medicProgramLucruButton, new GridConstraints(13, 4, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicOraFinalProgramTextField = new JTextField();
        mainPanel.add(medicOraFinalProgramTextField, new GridConstraints(12, 4, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicOraFinalLabel = new JLabel();
        medicOraFinalLabel.setText("Ora final");
        mainPanel.add(medicOraFinalLabel, new GridConstraints(11, 4, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicOraInceputProgramTextField = new JTextField();
        mainPanel.add(medicOraInceputProgramTextField, new GridConstraints(10, 4, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicOraIncepuLabel = new JLabel();
        medicOraIncepuLabel.setText("Ora inceput");
        mainPanel.add(medicOraIncepuLabel, new GridConstraints(9, 4, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicProgramDeLucruLabel = new JLabel();
        medicProgramDeLucruLabel.setText("Program de Lucru");
        mainPanel.add(medicProgramDeLucruLabel, new GridConstraints(8, 4, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrarePacientiTratamentTextArea = new JTextArea();
        mainPanel.add(medicFiltrarePacientiTratamentTextArea, new GridConstraints(11, 2, 3, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicFiltrareTratamentComboBox = new JComboBox();
        mainPanel.add(medicFiltrareTratamentComboBox, new GridConstraints(10, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicTratamentFiltrareLabel = new JLabel();
        medicTratamentFiltrareLabel.setText("Tratament");
        mainPanel.add(medicTratamentFiltrareLabel, new GridConstraints(9, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicLabel = new JLabel();
        Font medicLabelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, medicLabel.getFont());
        if (medicLabelFont != null) medicLabel.setFont(medicLabelFont);
        medicLabel.setForeground(new Color(-13893586));
        medicLabel.setText("Medic");
        mainPanel.add(medicLabel, new GridConstraints(0, 2, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicLogOutButton = new JButton();
        medicLogOutButton.setBackground(new Color(-2383653));
        medicLogOutButton.setText("Log out");
        mainPanel.add(medicLogOutButton, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicIconLabel = new JLabel();
        medicIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/doctor.png")));
        medicIconLabel.setText("");
        mainPanel.add(medicIconLabel, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
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
        return panel1;
    }
}
