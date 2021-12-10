package pl.imiajd.baginski.;

import java.time.LocalDate;

public class Student extends Osoba {

    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + this.kierunek;
    }

    public double getSredniaOcen() {
        return this.sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
