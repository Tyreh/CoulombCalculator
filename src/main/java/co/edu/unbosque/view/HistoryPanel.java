package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class HistoryPanel extends JDialog {

    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JButton selectElement = new JButton("Seleccionar");

    public HistoryPanel() {
        setLayout(new BorderLayout());
        setVisible(false);
        init();
    }

    public void init() {
        final JLabel label = new JLabel("<html><center>Selecciona una fuerza eléctrica<br>para calcular su campo magnético:</center></html>");
        final JList<String> historyList = new JList<>(listModel);
        add(label, BorderLayout.PAGE_START);
        add(historyList, BorderLayout.CENTER);
        add(selectElement, BorderLayout.PAGE_END);
    }

    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    public JButton getSelectElement() {
        return selectElement;
    }
}
