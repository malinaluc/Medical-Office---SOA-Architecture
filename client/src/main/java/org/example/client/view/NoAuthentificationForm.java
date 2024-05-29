package org.example.client.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class NoAuthentificationForm {
    private JPanel panel1;
    private JTextArea vizualizareSpecializariTextArea;
    private JButton vizualizareSpecializariButton;
    private JTextField specializareTextField;
    private JButton vizualizareListaMediciButton;
    private JTextField IDMedicTextField;
    private JButton afisareInfoMedicButton;
    private JTextField numeMedicTextField;
    private JButton vizualizareInfoMedicButton;
    private JButton goBackButton;
    private JLabel iconLabel;
    private JTextArea vizualizareListaMediciTextArea;
    private JTextArea afisareInfoMedicTextArea;
    private JTextArea infoMedicTextArea;
    private JLabel vizualizareSpecializariLabel;
    private JLabel vizualizareMediciLabel;
    private JLabel informatiiMedicLabel;
    private JLabel numeMedicLabel;

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
        panel1.setLayout(new GridLayoutManager(3, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-2383653));
        panel1.setForeground(new Color(-2383653));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(4, 7, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-2526763));
        panel1.add(panel2, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        vizualizareSpecializariLabel = new JLabel();
        vizualizareSpecializariLabel.setText("Vizualizare specializari");
        panel2.add(vizualizareSpecializariLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vizualizareSpecializariTextArea = new JTextArea();
        panel2.add(vizualizareSpecializariTextArea, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        vizualizareSpecializariButton = new JButton();
        vizualizareSpecializariButton.setBackground(new Color(-2383653));
        vizualizareSpecializariButton.setText("Vizualizare");
        panel2.add(vizualizareSpecializariButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vizualizareMediciLabel = new JLabel();
        vizualizareMediciLabel.setText("Vizualizare lista medici in functie de specializare");
        panel2.add(vizualizareMediciLabel, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        specializareTextField = new JTextField();
        panel2.add(specializareTextField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        vizualizareListaMediciButton = new JButton();
        vizualizareListaMediciButton.setBackground(new Color(-2383653));
        vizualizareListaMediciButton.setText("Vizualizare");
        panel2.add(vizualizareListaMediciButton, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        informatiiMedicLabel = new JLabel();
        informatiiMedicLabel.setText("Informatii medic (ID Medic)");
        panel2.add(informatiiMedicLabel, new GridConstraints(1, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        IDMedicTextField = new JTextField();
        panel2.add(IDMedicTextField, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        afisareInfoMedicButton = new JButton();
        afisareInfoMedicButton.setBackground(new Color(-2383653));
        afisareInfoMedicButton.setText("Afisare");
        panel2.add(afisareInfoMedicButton, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        numeMedicLabel = new JLabel();
        numeMedicLabel.setText("Nume medic");
        panel2.add(numeMedicLabel, new GridConstraints(1, 5, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        numeMedicTextField = new JTextField();
        panel2.add(numeMedicTextField, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        vizualizareInfoMedicButton = new JButton();
        vizualizareInfoMedicButton.setBackground(new Color(-2514727));
        vizualizareInfoMedicButton.setText("Vizualizare");
        panel2.add(vizualizareInfoMedicButton, new GridConstraints(2, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        goBackButton = new JButton();
        goBackButton.setBackground(new Color(-2383653));
        goBackButton.setText("Go back");
        panel2.add(goBackButton, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon(getClass().getResource("/images/search.png")));
        iconLabel.setText("");
        panel2.add(iconLabel, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        vizualizareListaMediciTextArea = new JTextArea();
        panel2.add(vizualizareListaMediciTextArea, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        afisareInfoMedicTextArea = new JTextArea();
        panel2.add(afisareInfoMedicTextArea, new GridConstraints(3, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        infoMedicTextArea = new JTextArea();
        panel2.add(infoMedicTextArea, new GridConstraints(3, 5, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
