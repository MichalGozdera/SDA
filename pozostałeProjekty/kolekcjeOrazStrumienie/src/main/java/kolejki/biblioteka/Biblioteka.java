package kolejki.biblioteka;

import osoba.Osoba;

import java.util.*;

public class Biblioteka {
    private List<Ksiazka> listaKsiazek;
    private Map<Ksiazka, List<Osoba>> rejestrCzytelnikow;

    public Biblioteka() {
        this.listaKsiazek = new ArrayList<>();
        this.rejestrCzytelnikow = new HashMap<>();

    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (ksiazka != null) {
            listaKsiazek.add(ksiazka);
        }
    }

    public List<String> pokazListeKsiazek() {
        List<String> wynik = new ArrayList<>();
        for (Ksiazka ksiazka : listaKsiazek) {
            String opis = String.format("%s, %s. %s", ksiazka.getAutor().toString(), ksiazka.getTytul(), ksiazka.getKategoria().getCzytelnaNazwa());
            wynik.add(opis);
        }
        return wynik;
    }

    public Queue<Ksiazka> zwrocListeKsiazekWgKryterium(Kryterium kryterium, Porzadek porzadek) {
        PorownywarkaKsiazek porownywarka = new PorownywarkaKsiazek(kryterium, porzadek);
        Queue<Ksiazka> wynik = new PriorityQueue<>(porownywarka);
        wynik.addAll(listaKsiazek);
        return wynik;
    }

    public Set<String> zwrocUnikalnetytuly() {
        Set<Ksiazka> ksiazki = new TreeSet<>();
        ksiazki.addAll(listaKsiazek);
        Set<String> wynik = new TreeSet<>();
        for (Ksiazka ksiazka : ksiazki) {
            StringBuilder sb = new StringBuilder();
            sb.append(ksiazka.getAutor().toString()).append(" - ").append(ksiazka.getTytul());
            wynik.add(sb.toString());
        }
        return wynik;
    }

    public Set<Ksiazka> znajdzWgKryterium(String klucz, Kryterium kryterium) {
        Set<Ksiazka> wynik = new TreeSet<>();
        for (Ksiazka ks : listaKsiazek) {
            if (kryterium == Kryterium.LICZBA_STRON) {
                if (ks.getLiczbaStron() >= Integer.parseInt(klucz)) {
                    wynik.add(ks);
                }
            } else {
                String szukane = "";
                switch (kryterium) {
                    case TYTUL:
                        szukane = ks.getTytul();
                        break;
                    case AUTOR:
                        szukane = ks.getAutor().toString();
                        break;
                    case ISBN:
                        szukane = ks.getIsbn();
                        break;
                    case KATEGORIA:
                        szukane = ks.getKategoria().getCzytelnaNazwa();
                        break;
                    case ROK_WYDANIA:
                        szukane = ks.getRokWydania().toString();
                        break;
                }
                if (szukane.contains(klucz)) {
                    wynik.add(ks);
                }
            }
        }
        return wynik;
    }

    public int podajIloscKsiazekZRoku(int rok) {
        int suma = 0;
        for (Ksiazka ks : listaKsiazek) {
            if (ks.getRokWydania() == rok) {
                suma++;
            }
        }
        return suma;
    }

    public void zapiszCzytelnika(Ksiazka wypozyczonaKsiazka, Osoba czytelnik) {
        if (rejestrCzytelnikow.containsKey(wypozyczonaKsiazka)) {
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);
        } else {
            rejestrCzytelnikow.put(wypozyczonaKsiazka, new ArrayList<>());
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);
        }
    }

    public List<String> pokazCzytelnikowWgKsiazki(Ksiazka ksiazka) {
        List<String> wyniki = new ArrayList<>();
        if (rejestrCzytelnikow.containsKey(ksiazka)) {
            List<Osoba> osobyZRejestru = rejestrCzytelnikow.get(ksiazka);
            for (Osoba osoba : osobyZRejestru) {
                wyniki.add(osoba.getImie() + " " + osoba.getNazwisko());
            }
            return wyniki;
        } else {
            return wyniki;
        }
    }

    public List<Ksiazka> zwrocKsiazkiWypozyczonePrzezOsobe(Osoba osoba) {
        ArrayList<Ksiazka> books = new ArrayList<>();
        for (Map.Entry<Ksiazka, List<Osoba>> entry : rejestrCzytelnikow.entrySet()) {
            if (entry.getValue().contains(osoba)) {
                books.add(entry.getKey());
            }
        }
        return books;
    }

    public Map<Ksiazka, Integer> zwrocKsiazkiPrzeczytanePrzezOsoby(Osoba osoba) {
        Map<Ksiazka, Integer> wyniki = new HashMap<>();
        for (Ksiazka ksiazka : rejestrCzytelnikow.keySet()) {
            List<Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
            for (Osoba czytelnik : czytelnicy) {
                if (czytelnik.equals(osoba)) {
                    if (wyniki.containsKey(ksiazka)){
                        Integer poprzedniaWartosc=wyniki.get(ksiazka);
                        wyniki.put(ksiazka,poprzedniaWartosc+1);
                    }
                    else {
                        wyniki.put(ksiazka,1);
                    }
                }
            }
        }
        return wyniki;
    }
}
