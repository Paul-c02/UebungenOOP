package Rezeptverwaltung;

public class Zutat {
    private String name;
    private int menge;

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Rezeptverwaltung.Zutat{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }

    public Zutat(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }
}
