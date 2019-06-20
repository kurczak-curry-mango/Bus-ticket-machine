package com.kucuma;

import java.util.ArrayList;
import java.util.List;

public class StringHandler {
    public StringHandler(){
        genLang();
    }
    private static ArrayList<String> polish = new ArrayList<>();
    private static ArrayList<String> english = new ArrayList<>();
    private static ArrayList<String> german = new ArrayList<>();
    private static void genLang() {

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
        polish.add("Automat Biletowy MPK - WITAMY! \nWybierz bilet!");//13
        polish.add("\nZwrócono \t"); //14
        polish.add("Wrzucono: ");//15
        polish.add("Do zaplaty: ");//16
        polish.add("<html> <p style=\"text-align:center;\">Zaplac karta poprzez zblizenie</p></html>");//17
        polish.add("Wyjście");//18
        polish.add(" Bilet normalny 20 min   ");//19
        polish.add(" Bilet ulgowy 20 min     ");
        polish.add(" Bilet normalny 40 min   ");
        polish.add(" Bilet ulgowy 40 min     ");
        polish.add(" Bilet normalny 60 min   ");
        polish.add(" Bilet ulgowy 60 min     ");
        polish.add(" Bilet normalny 24h      ");
        polish.add(" Bilet ulgowy 24 h       ");
        polish.add(" Bilet normalny 48 h     ");
        polish.add(" Bilet ulgowy 48 h       ");
        polish.add("Nr.");//29
        polish.add("Typ biletu");//30
        polish.add("            ilosc");//31
        polish.add("Nie mozesz wykonac tej operacji!");
        polish.add("Dziekujemy za zakupy!");//33
        polish.add("Bilety zostana wydrukowane.");//34
        polish.add("Zostanie wydana reszta: ");//35
        polish.add("Życzymy miłego dnia!");

        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Regular ticket 20min<br>2,80zł</p></html>");//0
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Regular ticket 40min <br>3,80zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Regular ticket 60min <br>6,00zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Regular ticket 24h <br>15,00zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Regular ticket 48h <br>24,00zł</p></html>");//4
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Half-price ticket 20min <br>1,40zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Half-price ticket 40min <br>1,90zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Half-price ticket 60min <br>3,00zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Half-price ticket 24h <br>7,50zł</p></html>");
        english.add("<html> <p style=font-size:8px;\"text-align:center;\">Half-price ticket 48h <br>12,00zł</p></html>");//9
        english.add("<html> <p style=\"text-align:center;\">UNDO TICKET</p></html>");
        english.add("<html> <p style=\"text-align:center;\">RETURN MONEY</p></html>");
        english.add("<html> <p style=\"text-align:center;\">BUY TICKETS</p></html>");
        english.add("MPK Ticket Machine - WELCOME! \nSelect a ticket!");
        english.add("\nChange given \t");//14
        english.add("Money thrown: ");
        english.add("To pay: ");
        english.add("<html> <p style=\"text-align:center;\">Pay via contactless</p></html>");
        english.add("Exit");//18
        english.add(" Regular ticket 20min    ");//19
        english.add(" Half-price ticket 20min ");
        english.add(" Regular ticket 40min    ");
        english.add(" Half-price ticket 40min ");
        english.add(" Regular ticket 60min    ");
        english.add(" Half-price ticket 60min ");
        english.add(" Regular ticket 24h      ");
        english.add(" Half-price ticket 24h   ");
        english.add(" Regular ticket 48h      ");
        english.add(" Half-price ticket 48h   ");
        english.add("No.");//29
        english.add("Ticket type");//30
        english.add("QTY");//31
        english.add("You can't perform this operation!");
        english.add("Thank you for order!");//33
        english.add("Tickets will be printed");//34
        english.add("Change will be given: ");//35
        english.add("Have a nice day!");

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
        german.add("MPK Fahrkartenautomat - WILLKOMMEN! \nWähle ein Ticket!");
        german.add("\nZurückgegeben \t");//14
        german.add("Beladen: ");
        german.add("Zu zahlen: ");
        german.add("<html> <p style=\"text-align:center;\">Bezahlen Sie mit einer kontaktlosen Zahlung</p></html>");
        german.add("Ausfahrt");//18
        german.add(" Normales Ticket 20min   ");//19
        german.add(" Konzessionsticket 20min ");
        german.add(" Normales Ticket 40min   ");
        german.add(" Konzessionsticket 40min ");
        german.add(" Normales Ticket 60min   ");
        german.add(" Konzessionsticket 60min ");
        german.add(" Normales Ticket 24h     ");
        german.add(" Konzessionsticket 24h   ");
        german.add(" Normales Ticket 48h     ");
        german.add(" Konzessionsticket 48h   ");
        german.add("Nr.");//29
        german.add("Ticket-typ");//30
        german.add("            Anzahl");//31
        german.add("Sie können diesen Vorgang nicht aus-\nführen!");
        german.add("Vielen Dank für die Bestellung!");//33
        german.add("Tickets werden gedruckt!");//34
        german.add("Der Rest wird freigegeben: ");//35
        german.add("Wir laden Sie wieder ein!");
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
