package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad4
//4. Napisz funkcję, która przyjmie dwa argumenty: liczbę znaków oraz zdanie. Funkcja powinna wypisać słowa, które są dłuższe niż zadana liczba w pierwszym argumencie.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst do przetworzenia");
        String sentence = s.nextLine();
        System.out.println("Słów o jakiej długości (lub mniejszej) nie wypisywać?");
        int maksymalna = s.nextInt();
        Zad4 zadanie = new Zad4();
        zadanie.zadanie4(maksymalna,sentence);
    }
    public void zadanie4 (int a, String tekst)
    {
        String[] slowa = tekst.split("\\W"); //tworzymy tablicę stringów dzieląc zdanie na słowa wg spacji
        for (String word:slowa)
            if (word.length()>a)
            System.out.println(word);
    }

}
