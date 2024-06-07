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
public class AdminForm {
    private JPanel panel1;
    private JTextArea adminVizualizareUsersTextArea;
    private JButton adminVizualizareUsersButton;
    private JTextField adminUsernameCreareTextField;
    private JTextField adminPasswordCreareTextField;
    private JTextField adminTipUserCreareTextField;
    private JButton adminCreareUserButton;
    private JTextField adminIDUserUpdateTextField;
    private JTextField adminUsernameUpdateTextField;
    private JTextField adminPassowrdUpdateTextField;
    private JButton adminUpdateUserButton;
    private JTextField adminStergereUserTextField;
    private JButton adminStergereUserButton;
    private JComboBox adminFiltrareUtilizatorComboBox;
    private JTextArea adminFiltrareUtilizatoriTextArea;
    private JLabel adminStergereUserLabel;
    private JLabel adminIDUserStergereLabel;
    private JLabel adminFiltrareUtilizatoriLabel;
    private JLabel adminIDUserUpdateLabel;
    private JLabel adminUsernameUpdateLabel;
    private JLabel adminPasswordUpdateLabel;
    private JLabel adminUsernameCreareLabel;
    private JLabel adminPasswordCreareLAbel;
    private JLabel adminTipUserCreareLabel;
    private JLabel adminVizualizareUsersLabel;
    private JPanel adminMainPanel;
    private JLabel adminUpdateUserLabel;
    private JLabel adminLabel;
    private JLabel adminCreareUserLabell;
    private JLabel adminIconLabel;

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
        adminMainPanel = new JPanel();
        adminMainPanel.setLayout(new GridLayoutManager(10, 5, new Insets(0, 0, 0, 0), -1, -1));
        adminMainPanel.setBackground(new Color(-2526763));
        panel1.add(adminMainPanel, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        adminLabel = new JLabel();
        Font adminLabelFont = this.getFontAdminForm("Castellar", Font.BOLD, 22, adminLabel.getFont());
        if (adminLabelFont != null) adminLabel.setFont(adminLabelFont);
        adminLabel.setForeground(new Color(-13893586));
        adminLabel.setText("ADMIN");
        adminMainPanel.add(adminLabel, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminIconLabel = new JLabel();
        adminIconLabel.setHorizontalAlignment(0);
        adminIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/administrator.png")));
        adminIconLabel.setText("");
        adminMainPanel.add(adminIconLabel, new GridConstraints(1, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminVizualizareUsersLabel = new JLabel();
        adminVizualizareUsersLabel.setText("Vizualizare users");
        adminMainPanel.add(adminVizualizareUsersLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreareUserLabell = new JLabel();
        adminCreareUserLabell.setText("Creare user");
        adminMainPanel.add(adminCreareUserLabell, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdateUserLabel = new JLabel();
        adminUpdateUserLabel.setText("Update user");
        adminMainPanel.add(adminUpdateUserLabel, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminStergereUserLabel = new JLabel();
        adminStergereUserLabel.setText("Stergere user");
        adminMainPanel.add(adminStergereUserLabel, new GridConstraints(2, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminVizualizareUsersTextArea = new JTextArea();
        adminMainPanel.add(adminVizualizareUsersTextArea, new GridConstraints(3, 0, 6, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        adminUsernameCreareLabel = new JLabel();
        adminUsernameCreareLabel.setText("Username");
        adminMainPanel.add(adminUsernameCreareLabel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUsernameCreareTextField = new JTextField();
        adminMainPanel.add(adminUsernameCreareTextField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminPasswordCreareLAbel = new JLabel();
        adminPasswordCreareLAbel.setText("Password");
        adminMainPanel.add(adminPasswordCreareLAbel, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminPasswordCreareTextField = new JTextField();
        adminMainPanel.add(adminPasswordCreareTextField, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminTipUserCreareLabel = new JLabel();
        adminTipUserCreareLabel.setText("Tip Utilizator (2 : medic ; 3 : asistent)");
        adminMainPanel.add(adminTipUserCreareLabel, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminTipUserCreareTextField = new JTextField();
        adminMainPanel.add(adminTipUserCreareTextField, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminCreareUserButton = new JButton();
        adminCreareUserButton.setBackground(new Color(-2383653));
        adminCreareUserButton.setText("Creare");
        adminMainPanel.add(adminCreareUserButton, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminIDUserUpdateLabel = new JLabel();
        adminIDUserUpdateLabel.setText("ID User");
        adminMainPanel.add(adminIDUserUpdateLabel, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminIDUserUpdateTextField = new JTextField();
        adminMainPanel.add(adminIDUserUpdateTextField, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminUsernameUpdateLabel = new JLabel();
        adminUsernameUpdateLabel.setText("Username");
        adminMainPanel.add(adminUsernameUpdateLabel, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUsernameUpdateTextField = new JTextField();
        adminMainPanel.add(adminUsernameUpdateTextField, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminPasswordUpdateLabel = new JLabel();
        adminPasswordUpdateLabel.setText("Password");
        adminMainPanel.add(adminPasswordUpdateLabel, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminPassowrdUpdateTextField = new JTextField();
        adminMainPanel.add(adminPassowrdUpdateTextField, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminUpdateUserButton = new JButton();
        adminUpdateUserButton.setBackground(new Color(-2383653));
        adminUpdateUserButton.setText("Update");
        adminMainPanel.add(adminUpdateUserButton, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminIDUserStergereLabel = new JLabel();
        adminIDUserStergereLabel.setText("ID User");
        adminMainPanel.add(adminIDUserStergereLabel, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminStergereUserTextField = new JTextField();
        adminMainPanel.add(adminStergereUserTextField, new GridConstraints(4, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminStergereUserButton = new JButton();
        adminStergereUserButton.setBackground(new Color(-2514727));
        adminStergereUserButton.setText("Stergere");
        adminMainPanel.add(adminStergereUserButton, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatoriLabel = new JLabel();
        adminFiltrareUtilizatoriLabel.setText("Filtrare utilizatori");
        adminMainPanel.add(adminFiltrareUtilizatoriLabel, new GridConstraints(6, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatorComboBox = new JComboBox();
        adminMainPanel.add(adminFiltrareUtilizatorComboBox, new GridConstraints(7, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatoriTextArea = new JTextArea();
        adminMainPanel.add(adminFiltrareUtilizatoriTextArea, new GridConstraints(8, 3, 2, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        adminVizualizareUsersButton = new JButton();
        adminVizualizareUsersButton.setBackground(new Color(-2383653));
        adminVizualizareUsersButton.setText("Vizualizare");
        adminMainPanel.add(adminVizualizareUsersButton, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font getFontAdminForm(String fontName, int style, int size, Font currentFont) {
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
