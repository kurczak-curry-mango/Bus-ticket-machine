package com.kucuma.controller;

import com.kucuma.view.MoneyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.kucuma.coin.Coins;
import java.io.IOException;

public class MoneyWindowController  {
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
    private JButton ExitButton;
    private JButton throw100zl;
    private JButton payByCard;
    private JLabel moneyThrown;
    private Coins coin;
    public void showWindowController() {
        MoneyWind.setResizable(false);
        MoneyWind.setVisible(true);
    }

    public MoneyWindowController(JLabel moneyThrown, Coins coin) {
        initComponents();
        initApearande();
        initListeners();
        this.moneyThrown=moneyThrown;
        this.coin=coin;
    }


    private void initComponents(){
        MoneyWind=new MoneyWindow();
        throw10gr= MoneyWind.getThrow10gr();
        throw20gr=MoneyWind.getThrow20gr();
        throw50gr=MoneyWind.getThrow50gr();
        throw1zl=MoneyWind.getThrow1zl();
        throw2zl=MoneyWind.getThrow2zl();
        throw5zl=MoneyWind.getThrow5zl();
        throw10zl=MoneyWind.getThrow10zl();
        throw20zl=MoneyWind.getThrow20zl();
        throw50zl=MoneyWind.getThrow50zl();
        throw100zl=MoneyWind.getThrow100zl();
        ExitButton=MoneyWind.getExitButton();
        payByCard=MoneyWind.getPayByCard();


    }

    private void initApearande(){
        throw10gr.setIcon(new ImageIcon("src/main/java/com/kucuma/images/4.png"));
        throw20gr.setIcon(new ImageIcon("src/main/java/com/kucuma/images/5.png"));
        throw50gr.setIcon(new ImageIcon("src/main/java/com/kucuma/images/6.png"));
        throw1zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/7.png"));
        throw2zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/8.png"));
        throw5zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/9.png"));
        throw10zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/10.png"));
        throw20zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/20.png"));
        throw50zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/50.png"));
        throw100zl.setIcon(new ImageIcon("src/main/java/com/kucuma/images/100.png"));
        payByCard.setIcon(new ImageIcon("src/main/java/com/kucuma/images/card.png"));
        payByCard.setText("<html> <p style=\"text-align:center;\">Zaplac karta poprzez zblizenie</p></html>");
    }
    private void initListeners(){
            throw10gr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   coin.insertCoin(1);
                    System.out.println(coin.howMuchmoney());
                    moneyThrown.setText("Wrzucono: "+ coin.howMuchmoney() + "zl");

                }
            });
//            throw20gr.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw50gr.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw1zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw2zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw5zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            payByCard.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw10zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw20zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw50zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
//            throw100zl.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    ;
//                }
//            });
            ExitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MoneyWind.setVisible(false);
                }
            });
        }
    }

