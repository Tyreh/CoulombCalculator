package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class FormattedComponents extends JPanel {

    private JTextField textField;
    private JComboBox<String> comboBox;

    public FormattedComponents(String fieldName, int columns) {
        setLayout(new GridLayout(1, 2, 10, 0));

        textField = new JTextField(columns);
        JLabel label = new JLabel(fieldName);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        add(label);
        add(textField);
    }

    public FormattedComponents(String fieldName, String[] values) {
        setLayout(new GridLayout(1, 2, 10, 0));

        comboBox = new JComboBox<>(values);
        JLabel label = new JLabel(fieldName);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        comboBox.setSelectedIndex(-1);
        add(label);
        add(comboBox);
    }

    public JTextField getTextField() {
        return textField;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}
