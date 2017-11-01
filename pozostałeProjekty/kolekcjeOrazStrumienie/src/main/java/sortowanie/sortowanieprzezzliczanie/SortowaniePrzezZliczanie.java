package sortowanie.sortowanieprzezzliczanie;

import kolejki.biblioteka.Porzadek;
import sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezZliczanie implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < tablicaElementow.length; i++) {
            if (tablicaElementow[i] > max) {
                max = tablicaElementow[i];
            }
            if (tablicaElementow[i] < min) {
                min = tablicaElementow[i];
            }
        }
        int[] zliczanieElementow = new int[max - min + 1];
        for (int i = 0; i < tablicaElementow.length; i++) {
            int liczba = tablicaElementow[i] - min;
            zliczanieElementow[liczba] += 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < zliczanieElementow.length; i++) {
            for (int j = 0; j < zliczanieElementow[i]; j++) {
                list.add(i+min);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            switch (porzadek) {
                case ROSNACY:
                    tablicaElementow[i] = list.get(i);
                    break;
                case MALEJACY:
                    tablicaElementow[i] = list.get(list.size() - i-1);
            }

        }
        return tablicaElementow;
    }
}
