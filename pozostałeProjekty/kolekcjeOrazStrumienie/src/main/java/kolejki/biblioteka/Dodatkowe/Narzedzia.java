package kolejki.biblioteka.Dodatkowe;

import kolejki.biblioteka.Autor;
import kolejki.biblioteka.Kategoria;
import kolejki.biblioteka.Ksiazka;

public class Narzedzia {

    public static Ksiazka utworzKsiazke(String imie, String nazwisko,
                                         Integer wiek, String tytul,
                                         String isbn, Integer liczbaStron,
                                         Kategoria kategoria, Integer rokWydania) {
        Autor autor = new Autor(imie, nazwisko, wiek);
        Ksiazka ksiazka = new Ksiazka(tytul, liczbaStron, isbn, autor, kategoria, rokWydania);
        return ksiazka;
    }
}
