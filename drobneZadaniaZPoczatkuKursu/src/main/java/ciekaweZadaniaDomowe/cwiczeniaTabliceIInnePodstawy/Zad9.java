package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad9
/*
Dane jest osiedle bloków. Każdy blok zawiera 2 klatki, po 2 piętra (+ parter), na każdym piętrze znajdują się dwa mieszkania.
Napisz skrypt, który wyświetli adres każdego mieszkania tak, aby można było zaadresować kopertę. Bloki znajdują się tylko pod numerami nieparzystymi - pierwszy blok znajduje się pod numerem 1.
Funkcja powinna przyjmować nazwę ulicy oraz ostatni numer, który występuje na danej ulicy (może być parzysty lub nieparzysty) oraz na wyjściu drukować poszczególne adresy.
 */
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź nazwę ulicy");
        String ulica = s.nextLine();
        System.out.println("Wprowadź osatni numer ulicy");
        int last = s.nextInt();
        Zad9 adresy = new Zad9();
        adresy.skrypt(ulica,last);
    }

    public void skrypt (String ulica, int last)
    {
        for (int i=1; i<=last;i++) //iterujemy po blokach
        {
            if (i%2==0) //pomijamy numery parzyste
                continue;
            for (int j=1; j<=12;j++) //iterujemy po numerze mieszkań. 2 klatki*3 kondygnacje*2mieszkania = 12 mieszkań na blok
                System.out.println(ulica+" "+i+"/"+j);
        }
    }

}
