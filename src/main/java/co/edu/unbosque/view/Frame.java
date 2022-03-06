package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private final ButtonsPanel buttonsPanel = new ButtonsPanel();
    private final CoulombPanel coulombPanel = new CoulombPanel();

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
        getContentPane().add(buttonsPanel, BorderLayout.PAGE_END);
        getContentPane().add(coulombPanel, BorderLayout.CENTER);
    }

    public CoulombPanel getCoulombPanel() {
        return coulombPanel;
    }

    public ButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }
}
