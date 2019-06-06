package com.kucuma.controller;

import com.kucuma.view.Window;

import javax.swing.*;

public class WindowController {
    private Window window;
    private JButton test;

    public WindowController() {
        initComponents();
    }

    public void showWindowController() {
        window.setVisible(true);
    }

    private void initComponents() {
        window = new Window();
        test = window.getTest();
    }

}
