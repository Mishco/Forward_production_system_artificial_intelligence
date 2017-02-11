package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michal
 */
public class Pravidlo {

    public String Nazov;

    public List<String> Podmienka;
    public List<String> Akcia;

    public Pravidlo() {
        Podmienka = new ArrayList<>();
        Akcia = new ArrayList<>();
    }

    public String getNazov() {
        return Nazov;
    }

    public void setNazov(String Nazov) {
        this.Nazov = Nazov;
    }

    public List<String> getPodmienka() {
        return Podmienka;
    }

    public void setPodmienka(List<String> Podmienka) {
        this.Podmienka = Podmienka;
    }

    public List<String> getAkcia() {
        return Akcia;
    }

    public void setAkcia(List<String> Akcia) {
        this.Akcia = Akcia;
    }
}
