package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class CoulombPanel extends JPanel {

    private final String[] fieldLabels = new String[]{"Carga 1 (q1): ", "Carga 2 (q2): ", "Distancia: (m): ", "Fuerza Eléctrica: "};
    private final String[] prefixList = new String[]{"Newton", "Millinewton", "Micronewton", "Nanonewton", "Piconewton"};
    private final FormattedComponents[] formattedTextFields = new FormattedComponents[fieldLabels.length];
    private final FormattedComponents prefixes = new FormattedComponents("Select a unit: ", prefixList);

    public CoulombPanel() {
        setLayout(new GridLayout(1,0,0,0));
        setVisible(true);

        add(rightPanel());
    }


    public JPanel rightPanel() {
        final JPanel panel = new JPanel(new BorderLayout());
        panel.add(initFields(), BorderLayout.CENTER);
        return panel;
    }

    public JPanel initFields() {
        final JPanel panel = new JPanel(new GridLayout((formattedTextFields.length + 1), 1));
        panel.add(prefixes);
        for (int i = 0; i < formattedTextFields.length; i++) {
            formattedTextFields[i] = new FormattedComponents(fieldLabels[i], 20);
            panel.add(formattedTextFields[i]);
        }
        formattedTextFields[3].getTextField().setEnabled(false);
        return panel;
    }

    public FormattedComponents[] getFormattedTextFields() {
        return formattedTextFields;
    }

    public FormattedComponents getPrefixes() {
        return prefixes;
    }
}
