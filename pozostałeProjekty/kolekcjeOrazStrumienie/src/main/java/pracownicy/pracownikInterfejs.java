package pracownicy;

import osoba.NarzedziaCsv;
import osoba.Osoba;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class pracownikInterfejs {
    public static void main(String[] args) {
        String sciezkaDoPliku = "D:/coding/projekty/temp/zajecia30wrzesnia/baza.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        List<Osoba> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);
        List<Pracownik>pracownicy=osoby.stream().filter(osoba -> osoba.getWiek()<41&&osoba.getWiek()>20).map(pracownik->new Pracownik(pracownik.getImie(),pracownik.getNazwisko(),pracownik.getZawod(),pracownik.getZarobki())).collect(Collectors.toList());
       wyswietlListe(pracownicy);
        System.out.println("=========Pracownicy na J=========");
       List<Pracownik>pracownicyNaJ=pracownicy.stream().filter(osoba->osoba.getImie().charAt(0)==74).collect(Collectors.toList());
       wyswietlListe(pracownicyNaJ);
       Integer sumaZarobkow=pracownicyNaJ.stream().mapToInt(pracownik->pracownik.getPensja()).sum();
        System.out.println(sumaZarobkow);
    }
    private static void wyswietlListe(List<Pracownik> lista) {
        for (Pracownik persona : lista) {
            System.out.println(persona);
        }
    }
}
