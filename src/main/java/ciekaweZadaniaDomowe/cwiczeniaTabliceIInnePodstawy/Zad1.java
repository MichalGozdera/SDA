package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;

import java.util.Scanner;

public class Zad1
/*
1. Napisz funkcj�, kt�ra przyjmuje dwie tablice jako argumenty. Je�eli na obu tablicach wyst�puje ten sam element, funkcja powinna zwraca� true, w przeciwnym wypadku false.
 */ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Jak wielka ma by� pierwsza tablica?");
        int tab1Wielkosc = s.nextInt();
        System.out.println("Jak wielka ma by� druga tablica?");
        int tab2Wielkosc = s.nextInt();
        int[] tab1 = new int[tab1Wielkosc];
        int[] tab2 = new int[tab2Wielkosc];
        System.out.println("Wczytujemy elementy tablicy 1");
        for (int i = 0; i < tab1.length; i++)
            tab1[i] = s.nextInt();
        System.out.println("Wczytujemy elementy tablicy 2");
        for (int i = 0; i < tab2.length; i++)
            tab2[i] = s.nextInt();
        Zad1 zadanie = new Zad1(); //tworzymy nowy obiekt klasy zad1 by na nim wywo�a� funkcj�.
        System.out.println(zadanie.theSame(tab1, tab2)); //wywo�ujemy funkcj� podan� w zadaniu
    }


    public boolean theSame(int[] tab1, int[] tab2) {
        for (int i = 0; i < tab1.length; i++) //iteracja po pierwszej tablicy
        {
            for (int j = 0; j < tab2.length; j++) //iteracja po drugiej tablicy
            {
                if (tab1[i] == tab2[j]) //warunek sprawdzaj�cy czy jaki� element powtarza si�.
                    return true;
            }
        }
        return false;
    }
}
