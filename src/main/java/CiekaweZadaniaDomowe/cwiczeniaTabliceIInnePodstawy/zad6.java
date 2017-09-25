package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad6
//6. Napisz funkcję, która zamienia dla zadanego ciągu znaków pierwszy znak z ostatnim
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst by zamienić pierwszy znak z ostatnim");
        String ciag = s.nextLine();
        /*
        najpierw koniec potem środek potem początek
        */
        System.out.println(ciag.substring(ciag.length()-1,ciag.length())+ciag.substring(1,ciag.length()-1)+ciag.substring(0,1));

    }
}
