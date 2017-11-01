package sortowanie.sortowanieBabelkowe;

import kolejki.biblioteka.Porzadek;
import sortowanie.Sortowanie;
import sortowanie.SortowanieUI;

public class SortowanieBabelkowe implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
//        int iloscOperacji=0;
        for (int i = 0; i < tablicaElementow.length; i++) {
//            System.out.println("Biorę i-ty element tablicy i wynosi on "+i+" jest to liczba:"+tablicaElementow[i]);
            for (int j = i+1; j < tablicaElementow.length; j++) {
//                System.out.println("Biorę j-ty element tablicy i wynosi on "+j+" jest to liczba:"+tablicaElementow[j]);
//                iloscOperacji++;
                if (i != j) { //nie chcemy porownywac tego samego elementu
                    switch (porzadek){
                        case ROSNACY:
//                            System.out.println(String.format("Porównuję, czy liczba %d>%d",tablicaElementow[i],tablicaElementow[j]));
                            if (tablicaElementow[i] > tablicaElementow[j]) {
//                                System.out.println("Zamieniam miejscami liczby");
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d",tablicaElementow[i],tablicaElementow[j]));
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d",tablicaElementow[i],tablicaElementow[j]));
//                                SortowanieUI.wyswietlTablice(tablicaElementow);
                            }
                            break;
                        case MALEJACY:
//                            System.out.println(String.format("Porównuję, czy liczba %d<%d",tablicaElementow[i],tablicaElementow[j]));
                            //Czy element o indeksie 0>element o indeksie 1///
                            if (tablicaElementow[i] < tablicaElementow[j]) {
//                                System.out.println("Zamieniam miejscami liczby");
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d",tablicaElementow[i],tablicaElementow[j]));
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d",tablicaElementow[i],tablicaElementow[j]));
//                               SortowanieUI.wyswietlTablice(tablicaElementow);
                            }
                            break;
                    }
                }
            }
        }
//        System.out.println("Ilość operacji "+ iloscOperacji);
        return tablicaElementow;
    }

}
