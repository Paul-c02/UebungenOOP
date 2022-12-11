package Abschreibung;

public class Anlage {
    private String bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private double restWert;
    private int alter;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getRestWert() {
        return restWert;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", nutzungsdauer=" + nutzungsdauer +
                ", restWert=" + restWert +
                ", alter=" + alter +
                '}';
    }

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        this.restWert = initialWert;
        this.alter = 0;
    }
    public void abschreiben(){
        alter++;
        if (alter<=nutzungsdauer){
            restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
        }
    }
    public void simulate(int maxJahre, int minWert){
        int counter = alter;
        while (counter<maxJahre && restWert>minWert){
            System.out.println("counter = " + counter + "restWert = "+ restWert);
            abschreiben();
            System.out.println("counter = " + counter + "restWert = "+ restWert);
            counter++;
        }
    }

    public Anlage renew(int zusatzWert, int zusatzJahre){
        double new_initialWert = restWert+zusatzWert;
        int neu_nutzungsdauer = (this.nutzungsdauer-this.alter)+zusatzJahre;
        Anlage neueAnlage = new Anlage(this.bezeichnung,new_initialWert ,neu_nutzungsdauer);
        return neueAnlage;
    }

}
