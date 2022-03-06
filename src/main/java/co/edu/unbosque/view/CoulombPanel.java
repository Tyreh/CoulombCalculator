package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class CoulombPanel extends JPanel {

    private final String[] fieldLabels = new String[]{"Carga 1 (q1): ", "Carga 2 (q2): ", "Distancia: (m): "};
    private final String[] prefixList = new String[]{"Micro", "Pico", "Nano"};
    private final FormattedComponents[] formattedTextFields = new FormattedComponents[fieldLabels.length];
    private final FormattedComponents prefixes = new FormattedComponents("Select a unit: ", prefixList);

    public CoulombPanel() {
        setLayout(new BorderLayout());
        setVisible(true);

        add(initFields(), BorderLayout.CENTER);
    }

    public JPanel initFields() {
        final JPanel panel = new JPanel(new GridLayout((formattedTextFields.length + 1), 1));
        panel.add(prefixes);
        for (int i = 0; i < formattedTextFields.length; i++) {
            formattedTextFields[i] = new FormattedComponents(fieldLabels[i], 20);
            panel.add(formattedTextFields[i]);
        }
        return panel;
    }

    public FormattedComponents[] getFormattedTextFields() {
        return formattedTextFields;
    }

    public FormattedComponents getPrefixes() {
        return prefixes;
    }
}
