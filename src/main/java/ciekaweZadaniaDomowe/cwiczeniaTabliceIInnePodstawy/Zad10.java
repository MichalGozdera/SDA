package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad10
// 10. Napisz funkcję, sprawdzającą czy przekazany argument (String) jest palindromem (należy uwzględnić pomijanie spacji).
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst by sprawdzić czy to palindrom");
        String ciag = s.nextLine();
        String ciag1 = ciag.replaceAll("\\s","").toLowerCase(); //wywalamy spację i eliminujemy problem wielkości liter
        StringBuilder ciag11=new StringBuilder(ciag1); // przechodzimy do string builder bo tam jest funkcja reverse
        String ciag2= ciag11.reverse().toString(); //robimy nowego stringa będącego odwróceniem wczytanego bez spacji
        if (ciag1.equals(ciag2)){
            System.out.println(ciag + " jest palindromem");}
        else
            System.out.println(ciag + " nie jest palindromem");
    }
}
