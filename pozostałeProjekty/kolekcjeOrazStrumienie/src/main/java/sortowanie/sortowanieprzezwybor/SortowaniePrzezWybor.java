package sortowanie.sortowanieprzezwybor;

import kolejki.biblioteka.Porzadek;
import sortowanie.Sortowanie;

public class SortowaniePrzezWybor implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {

        for (int i = 0; i < tablicaElementow.length; i++) {
            int min = tablicaElementow[i];
            int indexMinimum = i;
            for (int j = i + 1; j < tablicaElementow.length; j++) {
                //Szukamy najmniejszego elementu tavlicy
                switch (porzadek) {
                    case ROSNACY:
                    if (tablicaElementow[j] < min) {
                        min = tablicaElementow[j];
                        indexMinimum = j;
                    }
                    break;
                    case MALEJACY:
                        if (tablicaElementow[j] > min) {
                            min = tablicaElementow[j];
                            indexMinimum = j;
                        }
                        break;
                }
            }
            //Zamieniamy miejscami minimum
            //i pierwszą liczbę w tablicy, od któej zaczęłą się iteracja
            tablicaElementow[indexMinimum] = tablicaElementow[i];
            tablicaElementow[i] = min;
        }

        return tablicaElementow;
    }
}
