package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad2
/*2. Mamy dwie tablice liczb całkowitych, należy
1. wyświetlić te liczby, które występują w obydwu tablicach
2. wyświetlić liczby z obu tablic, które się nie powtarzają
        */ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Jak wielka ma być pierwsza tablica?");
        int tab1Wielkosc = s.nextInt();
        System.out.println("Jak wielka ma być druga tablica?");
        int tab2Wielkosc = s.nextInt();
        int[] tab1 = new int[tab1Wielkosc];
        int[] tab2 = new int[tab2Wielkosc];
        System.out.println("Wczytujemy elementy tablicy 1");
        for (int i = 0; i < tab1.length; i++)
            tab1[i] = s.nextInt();
        System.out.println("Wczytujemy elementy tablicy 2");
        for (int i = 0; i < tab2.length; i++)
            tab2[i] = s.nextInt();
        Zad2 zadanie = new Zad2(); //tworzymy nowy obiekt klasy zad1 by na nim wywołać funkcję.
        zadanie.takieSame(tab1, tab2);
        zadanie.inne(tab1, tab2);
    }

    public void takieSame(int[] tab1, int[] tab2) {
        for (int i = 0; i < tab1.length; i++) //iteracja po pierwszej tablicy
        {
            for (int j = 0; j < tab2.length; j++) //iteracja po drugiej tablicy
            {
                if (tab1[i] == tab2[j]) //warunek sprawdzający czy jakiś element powtarza się.
                {
                    System.out.println("powtórka " + tab1[i]); //wyświetlanie  powtórek
                }

            }
        }

    }

    public void inne(int[] tab1, int[] tab2) {
        //znajdujemy elementy z tablicy 1, któych nie ma w tablicy2
        for (int i = 0; i < tab1.length; i++) //iteracja po pierwszej tablicy
        {
            boolean repeat = false; //zmienna pomocnicza w pętli uaktywniająca się, gdy będzie powtórka
            for (int j = 0; j < tab2.length; j++) //iteracja po drugiej tablicy
            {
                if (tab1[i] == tab2[j]) //warunek sprawdzający czy jakiś element powtarza się.
                {
                    repeat = true; //aktywacja zmiennej pomocniczej
                    continue;
                }
            }
            if (repeat == false) //sprawdzenie czy nie wykryto powtórki
                System.out.println("W tablicy 2 nie znalieziono " + tab1[i]); //wyświetlenie elementu, który się nie powtarza.
        }
        //znajdujemy elementy z tablicy 2, któych nie ma w tablicy1. Reszta analogicznie jak u góry
        for (int i = 0; i < tab2.length; i++) //iteracja po pierwszej tablicy
        {
            boolean repeat = false;
            for (int j = 0; j < tab1.length; j++) //iteracja po drugiej tablicy
            {
                if (tab1[j] == tab2[i]) //warunek sprawdzający czy jakiś element powtarza się.
                {
                    repeat = true;
                    continue;
                }
            }
            if (repeat == false)
                System.out.println("W tablicy 1 nie znalieziono " + tab2[i]);
        }

    }
}
