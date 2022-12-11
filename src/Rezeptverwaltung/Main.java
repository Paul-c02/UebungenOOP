package Rezeptverwaltung;

public class Main {
    public static void main(String[] args) {
        Zutat butter = new Zutat("Butter", 250);
        Zutat zucker = new Zutat("Zucker", 250);
        Zutat omasGeheimZutat = new Zutat("Feenstaub", 100);
        Zutat mehl = new Zutat("Mehl 480 universal", 250);
        Zutat[] zutaten = {butter, zucker, mehl, omasGeheimZutat};
        Rezept weihnachtsKeks = new Rezept("Weihnachts Keks light", 4, zutaten);
        weihnachtsKeks.printRezept();
        Rezept wk10 = weihnachtsKeks.umrechnen(10);
        wk10.printRezept();
    }
}