package co.edu.unbosque.view;

import javax.swing.*;

public class Utils {

    public static void showInfo(int type, String message) {
        JOptionPane.showMessageDialog(null, message, "Calculadora de Coulomb", type);
    }
}
