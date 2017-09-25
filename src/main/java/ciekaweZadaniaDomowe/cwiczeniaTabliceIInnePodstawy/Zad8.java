package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad8
//8. Napisz funkcję, która jako argument przyjmuje dodatnią liczbę całkowitą większą od zera. Dla podanego zakresu wydrukuj kolejne wartości pomijając te, które są podzielne przez 3 lub przez 4
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj dowolną liczbę większą od 0");
        int liczba=s.nextInt();
        while (liczba<=0)
        {
            System.out.println("Wczytaj dowolną liczbę większą od 0");
            liczba=s.nextInt();
        }
        for (int i=1;i<=liczba;i++)
        {
            if (i%3==0||i%4==0)
                continue;
            System.out.println(i);
        }
    }


}
