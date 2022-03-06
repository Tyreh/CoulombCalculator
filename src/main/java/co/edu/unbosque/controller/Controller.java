package co.edu.unbosque.controller;

import co.edu.unbosque.model.Coulomb;
import co.edu.unbosque.view.Frame;
import co.edu.unbosque.view.Utils;

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
        System.out.println("[DEBUG]: command = " + command);

        var coulombPanel = frame.getCoulombPanel();
        var unit = coulombPanel.getPrefixes().getComboBox().getSelectedItem();

        if (unit != null) {
            double q1;
            double q2;
            double distance;
            try {
                q1 = Coulomb.assignUnit((String) unit, Double.parseDouble(coulombPanel.getFormattedTextFields()[0].getTextField().getText().replaceAll(",", ".")));
                q2 = Coulomb.assignUnit((String) unit, Double.parseDouble(coulombPanel.getFormattedTextFields()[1].getTextField().getText().replaceAll(",", ".")));
                distance = Double.parseDouble(coulombPanel.getFormattedTextFields()[2].getTextField().getText().replaceAll(",", "."));
            } catch (NumberFormatException ex) {
                Utils.showInfo(0, "Recuerde que:\n 1. No puede dejar ningún campo vacío.\n 2. Los valores ingresados no pueden contener letras.");
                return;
            }

            switch (command) {
                case "CALCULAR_FUERZA_ELECTRICA":
                    var electricForce = Coulomb.calculateElectricForce(q1, q2, distance);
                    Utils.showInfo(-1, "Fuerza Eléctrica:\n\n" + electricForce + " N");
                    break;
                case "CALCULAR_CAMPO_ELECTRICO":
                    var electricField1 = Coulomb.calculateElectricField(q1, distance);
                    var electricField2 = Coulomb.calculateElectricField(q2, distance);
                    Utils.showInfo(-1, "Campo Eléctrico:\n\n E1 = " + electricField1 + "\n E2 = " + electricField2);
                    break;
            }
        } else {
            Utils.showInfo(0, "Seleccione una unidad.");
        }

    }
}
