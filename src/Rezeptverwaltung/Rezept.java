package Rezeptverwaltung;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    @Override
    public String toString() {
        return "Rezeptverwaltung.Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public Rezept umrechnen(int personen) {
        double faktor = personen / ((double) getPersonen());
        Zutat[] zutatenByFaktor = new Zutat[this.zutaten.length];
        for (int i = 0; i < this.zutaten.length; i++) {
            zutatenByFaktor[i] = new Zutat(this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge() * faktor));
        }
        return new Rezept(name, personen,zutatenByFaktor);
    }

    public void printRezept() {
        System.out.println("name = " + name);
        System.out.println("personen = " + personen);
        for (int i = 0; i < this.zutaten.length; i++) {
            System.out.println(this.zutaten[i].toString());
        }
    }
}
