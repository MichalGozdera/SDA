package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad5 {
    /*
    5. Napisz funkcj�, kt�ra dla podanego n wydrukuje piramid� gwiazdek:
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
        System.out.println("Jak wielka ba by� piramida?");
        int piramidaWielkosc = s.nextInt();
        Zad5 zadanie = new Zad5();
        zadanie.piramidka(piramidaWielkosc);
    }

    public void piramidka (int wielko��)
    {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<wielko��;i++)
        {
            sb.insert(i,"*"); //dodajemy gwiazdki
            System.out.println(sb); //drukujemy gwiazdki
        }
        for (int i=wielko��-1;i>0;i--)
        {
            sb.deleteCharAt(i); //odejmujemy gwiazdki
            System.out.println(sb);

        }
    }
}
