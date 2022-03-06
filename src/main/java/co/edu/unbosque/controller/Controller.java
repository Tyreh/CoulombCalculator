package co.edu.unbosque.controller;

import co.edu.unbosque.view.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final Frame frame = new Frame();

    public Controller() {
        registerActionListener();
    }

    public void registerActionListener() {
        var buttons = frame.getButtonsPanel().getButtons();
        for (var button : buttons) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("command = " + command);

        switch (command) {
            case "CALCULAR_FUERZA_ELECTRICA":
                break;
            case "CALCULAR_CAMPO_MAGNETICO":
                break;
            case "VER_HISTORIAL":
                break;
        }

        if (command.equals("CALCULATE")) {
            var coulombPanel = frame.getCoulombPanel();
        }

    }
}
