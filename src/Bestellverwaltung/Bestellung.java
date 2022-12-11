package Bestellverwaltung;

import java.util.Arrays;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] bestellzeile;

    public Bestellung(String nummer, Bestellzeile[] bestellzeilen) {
        this.nummer = nummer;
        this.bestellzeile = bestellzeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getBestellzeilen() {
        return bestellzeile;
    }
    

    public void printBestellung(){
        System.out.println("nummer = " + nummer);
        for (int i = 0; i < bestellzeile.length; i++) {
            System.out.println(bestellzeile[i].toString());
        }
    }
    public double getKosten(){
        double kosten = 0;
        for (int i = 0; i < bestellzeile.length; i++) {
            kosten = kosten + bestellzeile[i].getKosten();
        }
        return kosten;
    }


}
