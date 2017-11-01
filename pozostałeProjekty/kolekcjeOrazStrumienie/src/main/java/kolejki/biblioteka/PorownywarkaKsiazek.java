package kolejki.biblioteka;

import java.util.Comparator;

public class PorownywarkaKsiazek implements Comparator<Ksiazka> {

    private Kryterium kryterium;
    private Porzadek porzadek;

    public PorownywarkaKsiazek(Kryterium kryterium, Porzadek porzadek) {
        this.kryterium = kryterium;
        this.porzadek=porzadek;
    }

    public int compare(Ksiazka o1, Ksiazka o2){
        switch (porzadek){
            case ROSNACY:
                return compareInternal(o1, o2);
            case MALEJACY:
                return compareInternal(o2, o1);
        }
        return 0;
    }

    private int compareInternal(Ksiazka o1, Ksiazka o2) {
            switch (kryterium) {
                case AUTOR:
                    return compareAutor(o1, o2);
                case TYTUL:
                    return o1.getTytul().compareTo(o2.getTytul());
                case KATEGORIA:
                    return o1.getKategoria().getCzytelnaNazwa().compareTo(o2.getKategoria().getCzytelnaNazwa());
                case LICZBA_STRON:
                    return o1.getLiczbaStron().compareTo(o2.getLiczbaStron());
                case ISBN:
                    return o1.getIsbn().compareTo(o2.getIsbn());
                case ROK_WYDANIA:
                    return o1.getRokWydania().compareTo(o2.getRokWydania());
            }
        return 0;
    }

    private int compareAutor(Ksiazka o1, Ksiazka o2) {
        String autor1 = o1.getAutor().toString();
        String autor2 = o2.getAutor().toString();
        return autor1.compareTo(autor2);
    }
}
