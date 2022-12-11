package Bestellverwaltung;

public class Bestellzeile {
    private String name;
    private int menge;
    private double preis;

    public Bestellzeile(String name, int menge, int preis) {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public double getPreis() {
        return preis;
    }

    public double getKosten(){
        return menge*preis;
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", preis=" + preis +
                '}';
    }
}
