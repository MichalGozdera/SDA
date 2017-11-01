package osoba;

import java.time.LocalDate;
import java.time.Period;

public class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;
    private String miasto;
    private String ulica;
    private String kodPocztowy;
    private LocalDate dataUrodzenia;
    private Integer wiek;
    private Plec plec;
    //    private Zawod zawod;
    private String zawod;
    private Integer zarobki;

    public Osoba() {

    }

    public Osoba(String imie, String nazwisko, String miasto, String ulica, String kodPocztowy, LocalDate dataUrodzenia, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
        this.wiek = Period.between(getDataUrodzenia(), LocalDate.now()).getYears();
    }

    public Integer getZarobki() {
        return zarobki;
    }

    public void setZarobki(Integer zarobki) {
        this.zarobki = zarobki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        return compareTo(osoba) == 0;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (dataUrodzenia != null ? dataUrodzenia.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", wiek=" + wiek +
                ", plec=" + plec +
                ", zawod='" + zawod + '\'' +
                ", zarobki=" + zarobki +
                '}';
    }

    public int compareTo(Osoba o) {

        if (dataUrodzenia.equals(o.dataUrodzenia))
            return this.toString().compareTo(o.toString());
        else
            return dataUrodzenia.compareTo(o.dataUrodzenia);

    }


}
