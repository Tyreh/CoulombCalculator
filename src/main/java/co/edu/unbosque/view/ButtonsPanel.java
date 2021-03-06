package co.edu.unbosque.view;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private JButton[] buttons;

    public ButtonsPanel() {
        setLayout(new FlowLayout());
        setVisible(true);
        init();
    }

    public void init() {
        String[] buttonLabels = new String[]{"Calcular Fuerza Eléctrica", "Calcular Campo Eléctrico"};
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttons.length; i++) {
            var buttonText = buttonLabels[i];
            var command = StringUtils.stripAccents(buttonText.replaceAll(" ", "_").toUpperCase());
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setActionCommand(command);
            add(buttons[i]);
        }
    }

    public JButton[] getButtons() {
        return buttons;
    }
}
