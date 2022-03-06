package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private final ButtonsPanel buttonsPanel = new ButtonsPanel(new String[]{"Calcular Fuerza Eléctrica", "Calcular Campo Magnético", "Ver Historial"});
    private final CoulombPanel coulombPanel = new CoulombPanel();
    private final HistoryPanel historyPanel = new HistoryPanel();

    public Frame() {
        setTitle("Calculadora de Coulomb");
        setSize(700, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        init();
    }

    public void init() {
        getCoulombPanel().add(buttonsPanel, BorderLayout.PAGE_END);
        getContentPane().add(coulombPanel, BorderLayout.CENTER);
    }

    public CoulombPanel getCoulombPanel() {
        return coulombPanel;
    }

    public HistoryPanel getHistoryPanel() {
        return historyPanel;
    }

    public ButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }
}
