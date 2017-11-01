package kolejki.biblioteka;

import kolejki.biblioteka.Dodatkowe.Narzedzia;
import osoba.Osoba;
import osoba.Plec;
import osoba.Zawod;

import java.time.LocalDate;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteka b1 = new Biblioteka();
        Biblioteka b2 = new Biblioteka();
        dodajKsiazkidoBiblioteki(b1, b2);
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Hortsman", 45,
                "Java Podstawy. Wydanie X", "1234567890", 989, Kategoria.IT, 2010);
        Ksiazka javaAdvanced = Narzedzia.utworzKsiazke("Cay", "Hortsman", 45, "Java Techniki Zaawansowane", "214982123", 989, Kategoria.IT, 2010);
        System.out.println(b1.pokazListeKsiazek());
        //System.out.println(b2.pokazListeKsiazek());
        System.out.println(b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        Osoba mieciu = new Osoba("Mietek", "Krawężnik", "Chojnice", "Wyzwolenia", "83-200", LocalDate.of(1956, 4, 2), Plec.MEZCZYZNA);
        Osoba marian = new Osoba("Marian", "Paździoch", "Wrocław", "ćwiartki", "53-200", LocalDate.of(1946, 7, 8), Plec.MEZCZYZNA);
        Osoba marianna = new Osoba("Marianna", "Paździoch", "Wrocław", "ćwiartki", "53-200", LocalDate.of(1946, 7, 8), Plec.KOBIETA);
        Osoba ferdek = new Osoba("Ferdynand", "Kiepski", "Wrocław", "Ćwiartki", "53-200", LocalDate.of(1962, 7, 9), Plec.MEZCZYZNA);
        Osoba bozenka = new Osoba("Bożenka", "Lubicz", "Warszawa", "Józefa Stalina", "03-200", LocalDate.of(1996, 12, 22), Plec.KOBIETA);
        Osoba hanka = new Osoba("Hanka", "Mostowiak", "Pcim Dolny", "Armii Czerwonej", "33-200", LocalDate.of(1976, 3, 29), Plec.KOBIETA);
        Osoba lewy = new Osoba("Robert", "Lewandowski", "Monachium", "Bismarck Strasse", "1488-200", LocalDate.of(1988, 4, 2), Plec.MEZCZYZNA);
        Osoba beatka = new Osoba("Beata", "Szydło", "Brzeszcze", "Smolenska", "33-260", LocalDate.of(1969, 8, 16), Plec.KOBIETA);
        Osoba zenek = new Osoba("Zenon", "Martyniuk", "Białystok", "Obrońców Stalingradu", "13-200", LocalDate.of(1981, 10, 2), Plec.MEZCZYZNA);
        Osoba prezydent = new Osoba("Andrzej", "Duda", "Chojnice", "Wyzwolenia", "83-200", LocalDate.of(1956, 4, 2), Plec.MEZCZYZNA);
        Osoba ksiezniczka = new Osoba("Kinga", "Duda", "Chojnice", "Wyzwolenia", "83-200", LocalDate.of(1956, 4, 2), Plec.KOBIETA);
        b1.zapiszCzytelnika(javaPodstawy, ksiezniczka);
        b1.zapiszCzytelnika(javaAdvanced, prezydent);
        // System.out.println(b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
        b1.zapiszCzytelnika(javaPodstawy, zenek);
        b1.zapiszCzytelnika(javaAdvanced, ferdek);
        b1.zapiszCzytelnika(javaAdvanced, lewy);
        b1.zapiszCzytelnika(javaPodstawy, lewy);
        b1.zapiszCzytelnika(javaAdvanced, prezydent);
        //System.out.println(b1.pokazCzytelnikowWgKsiazki(javaPodstawy));
//        System.out.println(b1.pokazListeKsiazek());
//        System.out.println(b2.pokazListeKsiazek());
        Queue<Ksiazka> ksiazkiPoAutorze = b1.zwrocListeKsiazekWgKryterium(Kryterium.AUTOR, Porzadek.ROSNACY);
        while (!ksiazkiPoAutorze.isEmpty()) {
            Ksiazka ksiazka = ksiazkiPoAutorze.poll();

            System.out.println("Czytelniki książki o tytule :" + ksiazka.getTytul() + ": " + b1.pokazCzytelnikowWgKsiazki(ksiazka));
        }
        System.out.println(b1.zwrocKsiazkiWypozyczonePrzezOsobe(prezydent));
        System.out.println(b1.zwrocKsiazkiPrzeczytanePrzezOsoby(prezydent));

        System.out.println("======================");
        Queue<Ksiazka> ksiazkiPoAutorzeMalejaco = b2.zwrocListeKsiazekWgKryterium(Kryterium.AUTOR, Porzadek.MALEJACY);
        while (!ksiazkiPoAutorzeMalejaco.isEmpty()) {
            System.out.println(ksiazkiPoAutorzeMalejaco.poll());
        }
        System.out.println("======================");
        Queue<Ksiazka> ksiazkiPoISBN = b2.zwrocListeKsiazekWgKryterium(Kryterium.ISBN, Porzadek.ROSNACY);
        while (!ksiazkiPoISBN.isEmpty()) {
            System.out.println(ksiazkiPoISBN.poll());
        }
        System.out.println("======================");
        Queue<Ksiazka> ksiazkiPoRokuWydania = b2.zwrocListeKsiazekWgKryterium(Kryterium.ROK_WYDANIA, Porzadek.ROSNACY);
        while (!ksiazkiPoISBN.isEmpty()) {
            System.out.println(ksiazkiPoISBN.poll());
        }
        System.out.println("==========UNIKALNE TYTUŁY============");
        Set<String> unikalneTytuly = b2.zwrocUnikalnetytuly();
        for (String tyt : unikalneTytuly) {
            System.out.println(tyt);
        }
        System.out.println("==========ZNALEZIONE TYTUŁY============");
        System.out.println("Po jakim kryerium chcesz szukać?\n1. Tytuł\n2. Autor\n3. ISBN\n4. Liczba stron\n5. Kategoria");
        int kryt = scanner.nextInt();
        System.out.println("Co chcesz znaleźć");
        String szukane = scanner.next();
        Set<Ksiazka> znalezione;
        switch (kryt) {
            case 1:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.TYTUL);
                break;
            case 2:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.AUTOR);
                break;
            case 3:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.ISBN);
                break;
            case 4:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.LICZBA_STRON);
                break;
            case 5:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.KATEGORIA);
                break;
            case 6:
                znalezione = b2.znajdzWgKryterium(szukane, Kryterium.ROK_WYDANIA);
                break;
            default:
                System.out.println("Nie zrozumiałeś polecenia");
                return;
        }


        for (Ksiazka ks : znalezione) {
            System.out.println(ks);
        }
        System.out.println("Podaj rok, z którego chcesz znaleźć liczbę książek w bibliotece");
        int rok = scanner.nextInt();
        System.out.println("W bibliotece posiadamy "+b2.podajIloscKsiazekZRoku(rok)+" książki z roku "+ rok);

    }

    private static void dodajKsiazkidoBiblioteki(Biblioteka b1, Biblioteka b2) {
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Hortsman", 45,
                "Java Podstawy. Wydanie X", "1234567890", 989, Kategoria.IT, 2010);
        b1.dodajKsiazke(javaPodstawy);
        b1.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Hortsman", 45, "Java Techniki Zaawansowane", "214982123", 989, Kategoria.IT, 2010));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Pan Tadeusz", "4354235423", 300, Kategoria.EPOPEJA, 1832));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("adam", "Mickiewicz", 219, "Pan Tadeusz", "43542835423", 300, Kategoria.EPOPEJA, 1832));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Dan", "Brown", 55, "Inferno", "8974324321", 500, Kategoria.SCI_FI, 2005));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Hortsman", 45, "Java Techniki Zaawansowane", "214982123", 989, Kategoria.IT, 2010));
        b2.dodajKsiazke(javaPodstawy);
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Władysław", "Gomułka", 112, "Artykuły i Przemówienia", "19561968", 300, Kategoria.POLITYKA, 1956));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Władysław", "Gomułka", 112, "Artykuły i Przemówienia", "1921968", 200, Kategoria.POLITYKA, 1956));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Władysław", "Gomułka", 112, "Artykuły i Przemówienia", "19565568", 300, Kategoria.POLITYKA, 1956));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Władysław", "Gomułka", 112, "Artykuły i Przemówienia", "19567768", 300, Kategoria.POLITYKA, 1956));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Adolf", "Hitler", 140, "Moja Walka", "14888814", 200, Kategoria.BAJKA, 1923));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Ayn", "Rand", 112, "Źródło", "1943435432", 800, Kategoria.PROZA, 1943));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Ludwig", "von Mises", 134, "Ludzkie Działanie", "3442423422", 750, Kategoria.SCI_FI, 1949));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Jane", "Rowling", 45, "Harry Potter i Kamień Filozoficzny", "3442423422", 150, Kategoria.BAJKA, 1997));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Jane", "Rowling", 46, "Harry Potter i Komnata Tajemnic", "34432122", 250, Kategoria.BAJKA, 1998));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Jane", "Rowling", 47, "Harry Potter i Więzień Azkabanu", "3222423422", 350, Kategoria.BAJKA, 1999));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Jane", "Rowling", 48, "Harry Potter i Czara Ognia", "3882423422", 750, Kategoria.BAJKA, 2000));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Jane", "Rowling", 49, "Harry Potter i Zakon Feniksa", "34343422423422", 650, Kategoria.BAJKA, 2001));

    }


}
