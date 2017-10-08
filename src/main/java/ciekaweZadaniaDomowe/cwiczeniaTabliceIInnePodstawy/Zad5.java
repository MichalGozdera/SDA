package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad5 {
    /*
    5. Napisz funkcję, która dla podanego n wydrukuje piramidę gwiazdek:
*
**
***
****
***
**
*
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Jak wielka ba być piramida?");
        int piramidaWielkosc = s.nextInt();
        Zad5 zadanie = new Zad5();
        zadanie.piramidka(piramidaWielkosc);
    }

    public void piramidka (int wielkosc)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<wielkosc;i++)
        {
            sb.insert(i,"*"); //dodajemy gwiazdki
            System.out.println(sb); //drukujemy gwiazdki
        }
        for (int i=wielkosc-1;i>0;i--)
        {
            sb.deleteCharAt(i); //odejmujemy gwiazdki
            System.out.println(sb);

        }
    }
}
