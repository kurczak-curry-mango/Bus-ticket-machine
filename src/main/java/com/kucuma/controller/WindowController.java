package com.kucuma.controller;

import com.kucuma.StringHandler;
import com.kucuma.coin.Coins;
import com.kucuma.coin.PiggyBank;
import com.kucuma.ticket.Tickets;
import com.kucuma.view.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    private JPanel languagePanel;
    private JButton langPL;
    private JButton langDE;
    private JButton langENG;
    private StringHandler stringHandler = new StringHandler();
    ArrayList<String> language= new ArrayList<>();


    private Tickets ticket = new Tickets();
    private Coins coin=new Coins();
    private PiggyBank piggy= new PiggyBank();
    ImageIcon img = new ImageIcon("src/main/java/com/kucuma/images/ikona.png");


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
        window.setIconImage(img.getImage());
        window.setTitle("Automat biletowy MPK");
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
        moneyThrown=window.getMoneyThrown();
        MoneyController = new MoneyWindowController(moneyThrown, coin);
        language=stringHandler.getPolish();
        languagePanel=window.getLanguagePanel();
        langPL=window.getLangPL();
        langENG=window.getLangENG();
        langDE=window.getLangDE();
        wyswietlacz.setSize(new Dimension(1,1));

    }
    private void initApearance(){
        finalprice.setText("Do zaplaty: 0zl");
        finalprice.setFont(new Font("Roboto", Font.PLAIN, 20));
        moneyThrown.setText("Wrzucono: 0.00zl");
        moneyThrown.setFont(new Font("Roboto", Font.PLAIN, 20));
        bil1n.setText(language.get(0));
        bil2n.setText(language.get(1));
        bil3n.setText(language.get(2));
        bil4n.setText(language.get(3));
        bil5n.setText(language.get(4));
        bil1u.setText(language.get(5));
        bil2u.setText(language.get(6));
        bil3u.setText(language.get(7));
        bil4u.setText(language.get(8));
        bil5u.setText(language.get(9));
        returnTicket.setText(language.get(10));
        returnMoney.setText(language.get(11));
        buyTicket.setText(language.get(12));
        langPL.setOpaque(false);
        langPL.setContentAreaFilled(false);
        langPL.setBorderPainted(false);
        langENG.setOpaque(false);
        langENG.setContentAreaFilled(false);
        langENG.setBorderPainted(false);
        langDE.setOpaque(false);
        langDE.setContentAreaFilled(false);
        langDE.setBorderPainted(false);
        billonMenu.setOpaque(false);
        billonMenu.setContentAreaFilled(false);
        billonMenu.setBorderPainted(false);
        langPL.setIcon(new ImageIcon("src/main/java/com/kucuma/images/langPL.png"));
        langENG.setIcon(new ImageIcon("src/main/java/com/kucuma/images/langENG.png"));
        langDE.setIcon(new ImageIcon("src/main/java/com/kucuma/images/langDE.png"));
        billonMenu.setIcon(new ImageIcon("src/main/java/com/kucuma/images/wallet.png"));
        //setText("<html> <p style=\\\"text-align:center;\\\">OKNO!!</p></html>");
        wyswietlacz.setSize(50, 50);
        wyswietlacz.setRows(10);
        wyswietlacz.setFont(new Font("Consolas", Font.PLAIN, 14));
        wyswietlacz.setText("Automat Biletowy MPK - WITAMY! \nWybierz bilet!");
        wyswietlacz.setLineWrap(true);
        wyswietlacz.setEditable(false);
        windowPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        windowPane.setMaximumSize(new Dimension(100,100));
        windowPane.setPreferredSize(new Dimension(100,100));

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
        returnMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tempHowMuch=coin.howMuchmoney();
                coin.removeCoins();
                updateStrings();
                if(tempHowMuch>0) {
                    wyswietlacz.append("\nZwrócono \t" + tempHowMuch+"zl");

                }
                moneyThrown.setText("Wrzucono: " + coin.howMuchmoney() + "zl");
            }
        });
        buyTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(piggy.buy(coin.howMuchmoney(),ticket.priceFinal(),coin.getTab())){
                coin.removeCoins();
                ticket.removeTickets();
                }
                moneyThrown.setText("Wrzucono: " + coin.howMuchmoney() + "zl");
                updateStrings();
            }
        });

        billonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyController.showWindowController();
            }
        });
        langPL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                language=stringHandler.getPolish();
                initApearance();
            }
        });
        langENG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                language=stringHandler.getEnglish();
                System.out.println(language.get(0));
                initApearance();
            }
        });
        langDE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                language=stringHandler.getGerman();
                initApearance();
            }
        });
    }

    public void updateStrings(){
        finalprice.setText("Do zaplaty: " + ticket.priceFinal() + "zl");
        // PO DODANIU KLASY COIN NALEZY UZUPELNIC O ZMIENNA PRZECHOWYWUJACA WRZUCONE PIENIADZE

        wyswietlacz.setText(ticket.bilety());

}}

