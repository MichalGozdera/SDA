package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad13

//13. Na farmie występuje n królików. Nieparzyste z nich, mają niestety tylko jedno ucho, parzyste są w komplecie. Dla wczytanego n wypisz ile uszu znajduje się na farmie
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ile królików jest na farmie?");
        int rabbit = s.nextInt();
        if (rabbit%2==0)
            System.out.println("Na farmie jest "+rabbit/2*3+" uszu"); //na każde 2 kolejne króliki mamy 3 uszy
        else
            System.out.println("Na farmie jest "+(rabbit/2*3+1)+" uszu");
    }
}
