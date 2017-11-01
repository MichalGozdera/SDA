package osoba;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
//        RejestrOsob rejestr = new RejestrOsob();
//        rejestr.dodajOsobe(new Osoba("Mietek", "Krawężnik", "Chojnice", "Wyzwolenia", "83-200", LocalDate.of(1956, 4, 2), Plec.MEZCZYZNA));
//        rejestr.dodajOsobe(new Osoba("Marian", "Paździoch", "Wrocław", "ćwiartki", "53-200", LocalDate.of(1946, 7, 8), Plec.MEZCZYZNA));
//        rejestr.dodajOsobe(new Osoba("Marianna", "Paździoch", "Wrocław", "ćwiartki", "53-200", LocalDate.of(1946, 7, 8), Plec.KOBIETA));
//        rejestr.dodajOsobe(new Osoba("Ferdynand", "Kiepski", "Wrocław", "Ćwiartki", "53-200", LocalDate.of(1962, 7, 9), Plec.MEZCZYZNA ));
//        rejestr.dodajOsobe(new Osoba("Bożenka", "Lubicz", "Warszawa", "Józefa Stalina", "03-200", LocalDate.of(1996, 12, 22), Plec.KOBIETA ));
//        rejestr.dodajOsobe(new Osoba("Hanka", "Mostowiak", "Pcim Dolny", "Armii Czerwonej", "33-200", LocalDate.of(1976, 3, 29), Plec.KOBIETA ));
//        rejestr.dodajOsobe(new Osoba("Robert", "Lewandowski", "Monachium", "Bismarck Strasse", "1488-200", LocalDate.of(1988, 4, 2), Plec.MEZCZYZNA ));
//        rejestr.dodajOsobe(new Osoba("Beata", "Szydło", "Brzeszcze", "Smolenska", "33-260", LocalDate.of(1969, 8, 16), Plec.KOBIETA));
//        rejestr.dodajOsobe(new Osoba("Zenon", "Martyniuk", "Białystok", "Obrońców Stalingradu", "13-200", LocalDate.of(1981, 10, 2), Plec.MEZCZYZNA ));
//        rejestr.dodajOsobe(new Osoba("Krystyna", "Pawłowicz", "Tworki", "Szpitalna", "03-200", LocalDate.of(1953, 1, 1), Plec.KOBIETA ));
//        rejestr.dodajOsobe(new Osoba("Anna", "Nowak", "Giżycko", "Wyzwolenia", "11-500", LocalDate.of(2000, 11, 11), Plec.KOBIETA ));
//        System.out.println(rejestr.pokazOsobyStarszeNiz(70));
//        TreeSet<Osoba> zestaw = new TreeSet<>(rejestr.getListaOsob());
//        System.out.println(zestaw);
        String sciezkaDoPliku = "D:/coding/projekty/temp/zajecia30wrzesnia/baza.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        //System.out.println(wierszePliku.get(0));
        List<Osoba> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);
        //Wszystkie osoby o imieniu Dariusz
        List<Osoba> adamowie = osoby.stream().filter(persona -> persona.getImie().equals("Dariusz")).collect(Collectors.toList());
        wyswietlListe(adamowie);
        System.out.println(adamowie.size());
        // Zwracamy wszystkie nazwiska
        List<String> nazwiska = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toList());
        System.out.println(nazwiska);
        Set<String> nazwiskaUnikalne = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toSet());
        System.out.println(nazwiskaUnikalne);
        //Osoby starsze niż 35 lat i nazwiska zaczynajace sie S
        System.out.println("=================Osoby Starsze niż 35 lat i nazwisko na S==================");
        List<Osoba> starszeNiz35 = osoby.stream().filter(persona -> persona.getNazwisko().charAt(0) == 'S' && persona.getWiek() > 35).collect(Collectors.toList());
        wyswietlListe(starszeNiz35);
        System.out.println(starszeNiz35.size());
        //Osoby w wieku produkcyjnym
        System.out.println("=================wiek produkcyjny==================");
        List<Osoba> wiekProdukcyjny = osoby.stream().filter(persona -> persona.getWiek() > 17 && persona.getWiek() < 65 && persona.getPlec().equals(Plec.MEZCZYZNA) || persona.getWiek() > 17 && persona.getWiek() < 60 && persona.getPlec().equals(Plec.KOBIETA)).collect(Collectors.toList());
        wyswietlListe(wiekProdukcyjny);
        System.out.println(wiekProdukcyjny.size());
        System.out.println("=================Osoby mieszkające w Gdansku lub w Warzawie==================");
        List<Osoba> gdanskIWawa = osoby.stream().filter(persona -> persona.getMiasto().equals("Warszawa") || persona.getMiasto().equals("Gdańsk")).collect(Collectors.toList());
        wyswietlListe(gdanskIWawa);
        System.out.println(gdanskIWawa.size());
        System.out.println("=================Osoby urodzone w maju==================");
        List<Osoba> urodzeniWMaju = osoby.stream().filter(persona -> persona.getDataUrodzenia().getMonthValue() == 5).collect(Collectors.toList());
        wyswietlListe(urodzeniWMaju);
        System.out.println(urodzeniWMaju.size());
        System.out.println("=================Osoby których kod pocztowy zaczyna się od 9==================");
        List<Osoba> kodOd9 = osoby.stream().filter(persona -> persona.getKodPocztowy().charAt(0) == 57).collect(Collectors.toList());
        wyswietlListe(kodOd9);
        System.out.println(kodOd9.size());
        System.out.println("=================Unikalne zawody==================");
        Set<String> unikalneZawody = osoby.stream().map(persona -> persona.getZawod()).collect(Collectors.toSet());
        System.out.println(unikalneZawody);
        System.out.println(unikalneZawody.size());
        System.out.println("=================Pierwsze 20 osób z najwyższymi dochodami==================");
        long start = System.currentTimeMillis();
        List<Osoba> burzuje = osoby.stream().sorted((o1, o2) -> o2.getZarobki().compareTo(o1.getZarobki())).limit(20).collect(Collectors.toList());
        wyswietlListe(burzuje);
        System.out.println(burzuje.size());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("=================Pierwsze 20 osób z najwyższymi dochodami standardowo==================");
        start = System.currentTimeMillis();
        List<Osoba> burzuje1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int max = 0;
            Osoba krezus = new Osoba();
            for (Osoba osoba : osoby) {
                if (osoba.getZarobki() > max && !burzuje1.contains(osoba)) {
                    max = osoba.getZarobki();
                    krezus = osoba;
                }
            }
            burzuje1.add(krezus);
        }
        wyswietlListe(burzuje1);
        System.out.println(burzuje1.size());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("=================Pierwsze 20 osób z najwyższymi dochodami jeszcze inaczej==================");
        start = System.currentTimeMillis();
        List<Osoba> burzuje2 = new ArrayList<>(osoby);
        Collections.sort(burzuje2, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o2.getZarobki().compareTo(o1.getZarobki());
            }
        });
        List<Osoba> burzujePoNowemu = burzuje2.subList(0, 20);
        wyswietlListe(burzujePoNowemu);
        System.out.println(burzujePoNowemu.size());
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("=================Lista osób z nazwiskiem na literę C==================");
        List<Osoba> nazwiskoC = osoby.stream().filter(persona -> persona.getNazwisko().charAt(0) == 67).collect(Collectors.toList());
        wyswietlListe(nazwiskoC);
        System.out.println(nazwiskoC.size());
        System.out.println("=================średnia zarobków==================");
        Double srednia = osoby.stream().filter(persona -> persona.getWiek() < 31 && persona.getWiek() > 20).mapToInt(osoba -> osoba.getZarobki()).average().getAsDouble();
        System.out.println(srednia);
        System.out.println("=================ilość mężczyzn i kobiet==================");
//        Long nrMezczyzn=osoby.stream().filter(persona->persona.getPlec().equals(Plec.MEZCZYZNA)).count();
//        System.out.println(nrMezczyzn);
        int[] wynik = osoby.stream().map(persona -> {
            if (persona.getPlec().equals(Plec.KOBIETA)) {
                return new int[]{1, 0};
            } else {
                return new int[]{0, 1};
            }
        }).reduce(new int[2], (a, b) -> {
            a[0] = a[0] + b[0];
            a[1] = a[1] + b[1];
            return a;
        });
        System.out.println(wynik[0] +" "+ wynik[1]);
        wyswietlListe(listaOsobzMiasta("Warszawa", osoby));
        System.out.println(listaOsobzMiasta("Warszawa",osoby).size());
        System.out.println(sredniaZarobkow("Groomer",osoby));

    }

    private static void wyswietlListe(List<Osoba> lista) {
        for (Osoba persona : lista) {
            System.out.println(persona);
        }
    }
    private static List<Osoba> listaOsobzMiasta (String miasto, List<Osoba>osoby){
        List<Osoba>miastowi=osoby.stream().filter(persona->persona.getMiasto().equals(miasto)).collect(Collectors.toList());
        return miastowi;
    }
    private static Double sredniaZarobkow (String zawod, List<Osoba>osoby){
        Double miastowi=osoby.stream().filter(persona->persona.getZawod().equals(zawod)).mapToInt(persona->persona.getZarobki()).average().getAsDouble();
        return miastowi;
    }
}
