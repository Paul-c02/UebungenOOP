package Bestellverwaltung;

public class Demo {
    public static void main(String[] args) {
        Bestellzeile mobilePhone = new Bestellzeile("Mobile Phone X7", 101, 1);
        Bestellzeile displaySaver  = new Bestellzeile("Display Saver", 15, 2);
        Bestellzeile mobileCase  = new Bestellzeile("Case", 20, 1);
        Bestellzeile[] bestellzeile = {mobilePhone, displaySaver, mobileCase};
        Bestellung neworder = new Bestellung("AT12345",bestellzeile);
        neworder.printBestellung();
        System.out.println("neworder.getKosten = " + neworder.getKosten());
    }

}
