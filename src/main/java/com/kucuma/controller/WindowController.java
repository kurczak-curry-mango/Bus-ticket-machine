package com.kucuma.controller;

import com.kucuma.ticket.Tickets;
import com.kucuma.view.Window;
import com.kucuma.controller.MoneyWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowController {
    private Window window;
    private JButton returnMoney;
    private JButton bil4u;
    private JButton bil4n;
    private JButton bil3n;
    private JButton bil3u;
    private JButton bil2u;
    private JButton bil2n;
    private JButton bil5u;
    private JButton bil5n;
    private JButton bil1n;
    private JButton buyTicket;
    private JButton bil1u;
    private JButton returnTicket;
    private JTextArea wyswietlacz;
    private JButton billonMenu;
    private JLabel finalprice;
    private JScrollPane windowPane;
    private MoneyWindowController MoneyController;
    private JLabel moneyThrown;


    private Tickets ticket = new Tickets();

    public WindowController() {
        initComponents();
        initApearance();
        initListeners();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showWindowController() {
        window.setResizable(false);
        window.setVisible(true);
    }

    private void initComponents() {
        window = new Window();
        returnMoney=window.getReturnMoney();
        bil4u=window.getBil4u();
        bil4n=window.getBil4n();
        bil3n=window.getBil3n();
        bil3u=window.getBil3u();
        bil2u=window.getBil2u();
        bil2n=window.getBil2n();
        bil5u=window.getBil5u();
        bil5n=window.getBil5n();
        bil1n=window.getBil1n();
        buyTicket=window.getBuyTicket();
        bil1u=window.getBil1u();
        returnTicket=window.getReturnTicket();
        wyswietlacz=window.getWyswietlacz();
        billonMenu=window.getBillonMenu();
        finalprice=window.getFinalprice();
        windowPane=window.getWindowPane();
        MoneyController = new MoneyWindowController();
        moneyThrown=window.getMoneyThrown();

    }
    private void initApearance(){
        finalprice.setText("Do zaplaty: 0zl");
        finalprice.setFont(new Font("Roboto", Font.PLAIN, 20));
        moneyThrown.setText("Wrzucono: 0zl");
        moneyThrown.setFont(new Font("Roboto", Font.PLAIN, 20));
        bil1n.setText("<html> <p style=\"text-align:center;\">Bilet 20min normalny<br>2,80zł</p></html>");
        bil2n.setText("<html> <p style=\"text-align:center;\">Bilet 40min normalny<br>3,80zł</p></html>");
        bil3n.setText("<html> <p style=\"text-align:center;\">Bilet 60min normalny<br>6,00zł</p></html>");
        bil4n.setText("<html> <p style=\"text-align:center;\">Bilet 24h normalny<br>15,00zł</p></html>");
        bil5n.setText("<html> <p style=\"text-align:center;\">Bilet 48h normalny<br>24,00zł</p></html>");
        bil1u.setText("<html> <p style=\"text-align:center;\">Bilet 20min ulgowy<br>1,40zł</p></html>");
        bil2u.setText("<html> <p style=\"text-align:center;\">Bilet 40min ulgowy<br>1,90zł</p></html>");
        bil3u.setText("<html> <p style=\"text-align:center;\">Bilet 60min ulgowy<br>3,00zł</p></html>");
        bil4u.setText("<html> <p style=\"text-align:center;\">Bilet 24h ulgowy<br>7,50zł</p></html>");
        bil5u.setText("<html> <p style=\"text-align:center;\">Bilet 48h ulgowy<br>12,00zł</p></html>");
        returnTicket.setText("<html> <p style=\"text-align:center;\">ZWRÓĆ BILET</p></html>");
        returnMoney.setText("<html> <p style=\"text-align:center;\">ZWRÓĆ PIENIĄDZE</p></html>");
        buyTicket.setText("<html> <p style=\"text-align:center;\">KUP BILETY</p></html>");
        billonMenu.setIcon(new ImageIcon("src/main/java/com/kucuma/images/wallet.png"));
        //setText("<html> <p style=\\\"text-align:center;\\\">OKNO!!</p></html>");
        wyswietlacz.setSize(50, 50);
        wyswietlacz.setRows(10);
        wyswietlacz.setFont(new Font("Consolas", Font.PLAIN, 14));
        wyswietlacz.setText("Wybierz bilet \n");
        wyswietlacz.setLineWrap(true);
        wyswietlacz.setEditable(false);
        windowPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    private void initListeners(){
            bil1n.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(0);
            updateStrings();
        }
    });
        bil1u.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(1);
            updateStrings();

        }
    });
        bil2n.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(2);
            updateStrings();
        }
    });
        bil2u.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(3);
            updateStrings();
        }
    });
        bil3n.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(4);
            updateStrings();
        }
    });
        bil3u.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(5);
            updateStrings();
        }
    });
        bil4n.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(6);
            updateStrings();
        }
    });
        bil4u.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(7);
            updateStrings();
        }
    });
        bil5n.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(8);
            updateStrings();
        }
    });
        bil5u.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticket.addTickets(9);
            updateStrings();
        }
    });
        returnTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket.removeTickets();
                updateStrings();
            }
    });
        billonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyController.showWindowController();
            }
        });
    }

    private void updateStrings(){
        finalprice.setText("Do zaplaty: " + ticket.priceFinal() + "zl");
        // PO DODANIU KLASY COIN NALEZY UZUPELNIC O ZMIENNA PRZECHOWYWUJACA WRZUCONE PIENIADZE
       // moneyThrown.setText("Wrzucono: "+ XXXXX + "zl");
        wyswietlacz.setText(ticket.bilety());

}}

