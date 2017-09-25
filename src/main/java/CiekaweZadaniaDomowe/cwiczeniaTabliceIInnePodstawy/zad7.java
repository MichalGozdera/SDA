package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad7
//7. Napisz funkcję, która dla wczytanego od użytkownika słowa, wyświetla jego litery w kolejności odwrotnej.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj słowo by wyświetlić jego litery w kolejności odwrotnej");
        String slowo = s.next();
        StringBuilder odwrocone = new StringBuilder(slowo);
        System.out.println(odwrocone.reverse());
    }
}
