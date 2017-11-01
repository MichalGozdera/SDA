package sortowanie.sortowanieszybkie;

import kolejki.biblioteka.Porzadek;
import sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowanieSzybkie implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        List<Integer> listaElementow = new ArrayList<>();
        for (int elem : tablicaElementow) {
            listaElementow.add(elem);
        }
        AlgorytmSzybkiWyniki wyniki = sortujRekurencjnie(listaElementow);
        for (int i = 0; i < wyniki.getSrodek().size(); i++) {
            switch (porzadek) {
                case ROSNACY:
                tablicaElementow[i] = wyniki.getSrodek().get(i);
                break;
                case MALEJACY:
                    tablicaElementow[i] = wyniki.getSrodek().get(wyniki.getSrodek().size()-i-1);
                    break;
            }
        }
        return tablicaElementow;
    }

    private AlgorytmSzybkiWyniki sortujRekurencjnie(List<Integer> lista) {

        List<Integer> mniejsze = new ArrayList<>();
        List<Integer> wieksze = new ArrayList<>();
        List<Integer> srodek = new ArrayList<>();
        //Warunek stopu
        if (lista.size() < 2) {
            if (!lista.isEmpty()) {
                srodek.add(lista.get(0));
            }
            AlgorytmSzybkiWyniki wyniki = new AlgorytmSzybkiWyniki(mniejsze, srodek, wieksze);
            return wyniki;
        }
        int srodkowyIndex = lista.size() / 2;
        srodek.add(lista.get(srodkowyIndex));
        for (int i = 0; i < lista.size(); i++) {
            if (i != srodkowyIndex) {
                if (lista.get(i) <= lista.get(srodkowyIndex)) {
                    mniejsze.add(lista.get(i));
                } else {
                    wieksze.add(lista.get(i));
                }
            }
        }
        AlgorytmSzybkiWyniki wynikiMniejsze=sortujRekurencjnie(mniejsze);
        AlgorytmSzybkiWyniki wynikiSrodek=sortujRekurencjnie(srodek);
        AlgorytmSzybkiWyniki wynikiWieksze=sortujRekurencjnie(wieksze);
        List<Integer>wyniki=new ArrayList<>();
        wyniki.addAll(wynikiMniejsze.getMniejsze());
        wyniki.addAll(wynikiMniejsze.getSrodek());
        wyniki.addAll(wynikiMniejsze.getWieksze());
        wyniki.addAll(wynikiSrodek.getSrodek());
        wyniki.addAll(wynikiWieksze.getMniejsze());
        wyniki.addAll(wynikiWieksze.getSrodek());
        wyniki.addAll(wynikiWieksze.getWieksze());
        return new AlgorytmSzybkiWyniki(new ArrayList<>(),wyniki,new ArrayList<>());
    }
}
