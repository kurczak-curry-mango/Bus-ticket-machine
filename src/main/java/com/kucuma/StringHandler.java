package com.kucuma;

import java.util.ArrayList;
import java.util.List;

public class StringHandler {
    public StringHandler(){
        genLang();
    }
    public static ArrayList<String> polish = new ArrayList<>();
    public static ArrayList<String> english = new ArrayList<>();
    public static ArrayList<String> german = new ArrayList<>();
    public static void genLang() {

        polish.add("<html> <p style=\"text-align:center;\">Bilet 20min normalny<br>2,80zł</p></html>"); //0
        polish.add("<html> <p style=\"text-align:center;\">Bilet 40min normalny<br>3,80zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 60min normalny<br>6,00zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 24h normalny<br>15,00zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 48h normalny<br>24,00zł</p></html>");//4
        polish.add("<html> <p style=\"text-align:center;\">Bilet 20min ulgowy<br>1,40zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 40min ulgowy<br>1,90zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 60min ulgowy<br>3,00zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 24h ulgowy<br>7,50zł</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">Bilet 48h ulgowy<br>12,00zł</p></html>"); //9
        polish.add("<html> <p style=\"text-align:center;\">ZWRÓĆ BILET</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">ZWRÓĆ PIENIĄDZE</p></html>");
        polish.add("<html> <p style=\"text-align:center;\">KUP BILETY</p></html>");
        polish.add("Automat Biletowy MPK - WITAMY! \nWybierz bilet!");
        polish.add("\nZwrócono \t"); //14
        polish.add("Wrzucono: ");
        polish.add("Do zaplaty: ");
        polish.add("<html> <p style=\"text-align:center;\">Zaplac karta poprzez zblizenie</p></html>");
        polish.add("Wyjście");//18


        english.add("<html> <p style=\"text-align:center;\">Regular ticket 20min<br>2,80zł</p></html>");//0
        english.add("<html> <p style=\"text-align:center;\">Regular ticket 40min <br>3,80zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Regular ticket 60min <br>6,00zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Regular ticket 24h <br>15,00zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Regular ticket 48h <br>24,00zł</p></html>");//4
        english.add("<html> <p style=\"text-align:center;\">Half-price ticket 20min <br>1,40zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Half-price ticket 40min <br>1,90zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Half-price ticket 60min <br>3,00zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Half-price ticket 24h <br>7,50zł</p></html>");
        english.add("<html> <p style=\"text-align:center;\">Half-price ticket 48h <br>12,00zł</p></html>");//9
        english.add("<html> <p style=\"text-align:center;\">UNDO TICKET</p></html>");
        english.add("<html> <p style=\"text-align:center;\">RETURN MONEY</p></html>");
        english.add("<html> <p style=\"text-align:center;\">BUY TICKETS</p></html>");
        english.add("MPK Ticket Machine - WELCOME! \nSelect a ticket!");
        english.add("\nChange given \t");//14
        english.add("Money thrown: ");
        english.add("To pay: ");
        english.add("<html> <p style=\"text-align:center;\">Pay via contactless</p></html>");
        english.add("Exit");//18

        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Normales Ticket 20min <br>2,80zł</p></html>");//0
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Normales Ticket 40min <br>3,80zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Normales Ticket 60min <br>6,00zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Normales Ticket 24h <br>15,00zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Normales Ticket 48h <br>24,00zł</p></html>");//4
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Konzessionsticket\n 20min <br>1,40zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Konzessionsticket\n 40min <br>1,90zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Konzessionsticket\n 60min <br>3,00zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Konzessionsticket\n 24h <br>7,50zł</p></html>");
        german.add("<html> <p style=font-size:8px;\"text-align:center;\">Konzessionsticket\n 48h <br>12,00zł</p></html>");//9
        german.add("<html> <p style=\"text-align:center;\">TICKET ZURÜCKZIEHEN</p></html>");
        german.add("<html> <p style=\"text-align:center;\">RÜCKERSTATTUNG</p></html>");
        german.add("<html> <p style=\"text-align:center;\">TICKETS KAUFEN</p></html>");
        german.add("MPK Fahrkartenautomat - WILLKOMMEN! \nWähle ein Ticket\n!");
        german.add("\nZurückgegeben \t");//14
        german.add("Beladen: ");
        german.add("Zu zahlen: ");
        german.add("<html> <p style=\"text-align:center;\">Bezahlen Sie mit einer kontaktlosen Zahlung</p></html>");
        german.add("Ausfahrt");//18
    }

    public ArrayList getPolish(){
        return polish;
    }
    public ArrayList getEnglish(){
        return english;
    }
    public ArrayList getGerman(){
        return german;
    }
}
