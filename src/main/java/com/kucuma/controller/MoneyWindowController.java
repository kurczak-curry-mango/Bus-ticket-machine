package com.kucuma.controller;

import com.kucuma.view.MoneyWindow;

import javax.swing.*;

public class MoneyWindowController {
    private MoneyWindow MoneyWind;
    private JButton throw10gr;
    private JButton throw20gr;
    private JButton throw10zl;
    private JButton throw50gr;
    private JButton throw1zl;
    private JButton throw20zl;
    private JButton throw2zl;
    private JButton throw5zl;
    private JButton throw50zl;
    private JButton throw200zl;
    private JButton ExitButton;

    public void showWindowController() {
        MoneyWind.setResizable(false);
        MoneyWind.setVisible(true);
    }

    public MoneyWindowController() {
        initComponents();
        initApearande();
       // initListeners();
    }

    private void initComponents(){
        MoneyWind=new MoneyWindow();
        throw10gr= MoneyWind.getThrow10gr();
        throw20gr=MoneyWind.getThrow20gr();
        throw10zl=MoneyWind.getThrow10zl();
    }

    private void initApearande(){
        throw10gr.setIcon(new ImageIcon("src/main/java/com/kucuma/images/4.png"));
        throw20gr.setIcon(new ImageIcon("src/main/java/com/kucuma/images/5.png"));
        throw10zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/10.png"));

    }
}
