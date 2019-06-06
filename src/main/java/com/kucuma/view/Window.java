package com.kucuma.view;

import javax.swing.*;

public class Window extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private JButton test;
    private JPanel mainPanel;

    public Window() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getTest() {
        return test;
    }
}
