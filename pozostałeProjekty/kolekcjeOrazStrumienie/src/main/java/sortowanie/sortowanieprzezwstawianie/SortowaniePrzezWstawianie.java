package sortowanie.sortowanieprzezwstawianie;

import kolejki.biblioteka.Porzadek;
import sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezWstawianie implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        List<Integer> wynik = new ArrayList<>();
        for (int i = 0; i < tablicaElementow.length; i++) {
            if (wynik.isEmpty()) {
                wynik.add(tablicaElementow[i]);
                continue;
            }
            boolean czyDodano = false;
            for (int j = 0; j < wynik.size(); j++) {
                if (porzadek.equals(Porzadek.MALEJACY)) {
                    if (tablicaElementow[i] > wynik.get(j)) {
                        wynik.add(j, tablicaElementow[i]);
                        czyDodano = true;
                        break;
                    }
                } else {
                    if (tablicaElementow[i] < wynik.get(j)) {
                        wynik.add(j, tablicaElementow[i]);
                        czyDodano = true;
                        break;
                    }
                }
            }
            if (!czyDodano) {
                wynik.add(tablicaElementow[i]);
            }
        }
        for (int i = 0; i < wynik.size(); i++) {
            tablicaElementow[i] = wynik.get(i);
        }

        return tablicaElementow;
    }
}
