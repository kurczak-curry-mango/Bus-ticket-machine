package com.kucuma.view;

import javax.swing.*;

public class MoneyWindow extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 600;
    private JPanel panel1;
    private JButton throw10gr;
    private JButton throw20gr;
    private JButton throw10zl;
    private JButton throw50gr;
    private JButton throw1zl;
    private JButton throw20zl;
    private JButton throw2zl;
    private JButton throw5zl;
    private JButton throw50zl;
    private JButton ExitButton;
    private JButton throw100zl;
    private JButton payByCard;

    public MoneyWindow() {
        setSize(WIDTH, HEIGHT);
        setContentPane(panel1);
        setLocationRelativeTo(null);

    }

    public JButton getThrow10gr() {
        return throw10gr;
    }

    public JButton getThrow20gr() {
        return throw20gr;
    }

    public JButton getThrow10zl() {
        return throw10zl;
    }

    public JButton getThrow50gr() {
        return throw50gr;
    }

    public JButton getThrow1zl() {
        return throw1zl;
    }

    public JButton getThrow20zl() {
        return throw20zl;
    }

    public JButton getThrow2zl() {
        return throw2zl;
    }

    public JButton getThrow5zl() {
        return throw5zl;
    }

    public JButton getThrow50zl() {
        return throw50zl;
    }

    public JButton getThrow100zl() {
        return throw100zl;
    }
    public JButton getPayByCard(){
        return payByCard;
    }

    public JButton getExitButton() {
        return ExitButton;
    }
}
