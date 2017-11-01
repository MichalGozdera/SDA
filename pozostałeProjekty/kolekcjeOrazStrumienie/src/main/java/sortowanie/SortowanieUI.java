package sortowanie;

import kolejki.biblioteka.Porzadek;
import sortowanie.sortowanieBabelkowe.SortowanieBabelkowe;
import sortowanie.sortowanieprzezwstawianie.SortowaniePrzezWstawianie;
import sortowanie.sortowanieprzezwybor.SortowaniePrzezWybor;
import sortowanie.sortowanieprzezzliczanie.SortowaniePrzezZliczanie;
import sortowanie.sortowanieszybkie.SortowanieSzybkie;


import java.util.*;

public class SortowanieUI {
    public static void main(String[] args) {
        int[]tablicaa=new int[20];
        Random random = new Random();
        for (int i=0;i<tablicaa.length;i++){
            tablicaa[i]=random.nextInt(50)-20;
        }
        Sortowanie[]sortowanie=new Sortowanie[5];
        sortowanie[0]=new SortowanieBabelkowe();
        sortowanie[1]=new SortowaniePrzezWstawianie();
        sortowanie[2]=new SortowaniePrzezZliczanie();
        sortowanie[3]=new SortowaniePrzezWybor();
        sortowanie[4]=new SortowanieSzybkie();
        wyswietlTablice(tablicaa);
        for (Sortowanie algorytm :sortowanie){
            int [] kopia=kopiaTablicy(tablicaa);

            long start = System.currentTimeMillis();
            kopia=algorytm.sortuj(kopia,Porzadek.MALEJACY);
            long end = System.currentTimeMillis();
            System.out.println(String.format("Czas wykonania algorytmem %s: %s", algorytm.getClass().getName(), Long.toString(end-start)));
            wyswietlTablice(kopia);
        }



    }
    private static int[]kopiaTablicy(int[]tablica){
        int [] kopia=new int[tablica.length];
        for (int i=0;i<tablica.length;i++){
            kopia[i]=tablica[i];
        }
        return kopia;
    }
    public static void wyswietlTablice(int[]tablica){
        for (int elem:tablica){
            System.out.print(elem+" ");
        }
        System.out.println();
    }

}
