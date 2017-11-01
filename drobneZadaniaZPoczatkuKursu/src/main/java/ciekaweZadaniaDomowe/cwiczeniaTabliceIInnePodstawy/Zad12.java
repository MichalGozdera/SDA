package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad12
//12. Napisz funkcję, która przetłumaczy wybraną liczbę całkowitą z zakresu <0-999>, na jej odpowiednik słownie np. 123 -> sto dwadzieścia trzy.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj liczbę z zakresu <0-999>");
        int liczba = s.nextInt();
        while (liczba < 0 || liczba > 999) {
            System.out.println("Wczytaj liczbę z zakresu <0-999>");
            liczba = s.nextInt();
        }
        if (liczba==0)
            System.out.println("zero");
        int setki = liczba / 100;
        switch (setki)
        {
            case 1:
                System.out.print("sto ");
                liczba -= setki * 100;
                break;
            case 2:
                System.out.print("dwieście ");
                liczba -= setki * 100;
                break;
            case 3:
                System.out.print("trzysta ");
                liczba -= setki * 100;
                break;
            case 4:
                System.out.print("czterysta ");
                liczba -= setki * 100;
                break;
            case 5:
                System.out.print("pięćset ");
                liczba -= setki * 100;
                break;
            case 6:
                System.out.print("sześćset ");
                liczba -= setki * 100;
                break;
            case 7:
                System.out.print("siedemset ");
                liczba -= setki * 100;
                break;
            case 8:
                System.out.print("osiemset ");
                liczba -= setki * 100;
                break;
            case 9:
                System.out.print("dziewięćset ");
                liczba -= setki * 100;
                break;

        }
        if (liczba>9&&liczba<20) {
            switch (liczba)
            {
                case 10:
                    System.out.print("dziesięć");
                    break;
                case 11:
                    System.out.print("jedenaście");
                    break;
                case 12:
                    System.out.print("dwanaście");
                    break;
                case 13:
                    System.out.print("trzynaście");
                    break;
                case 14:
                    System.out.print("czternaście");
                    break;
                case 15:
                    System.out.print("piętnaście");
                    break;
                case 16:
                    System.out.print("szesnaście");
                    break;
                case 17:
                    System.out.print("siedemnaście");
                    break;
                case 18:
                    System.out.print("osiemnaście");
                    break;
                case 19:
                    System.out.print("dziewiętnaście");
                    break;
            }
        }
        else
            {
            int dziesiatki=liczba/10;

            switch (dziesiatki)
            {
                case 2:
                    System.out.print("dwadzieścia ");
                    liczba-=dziesiatki*10;
                    break;
                case 3:
                    System.out.print ("trzydzieści ");
                    liczba-=dziesiatki*10;
                    break;
                case 4:
                    System.out.print ("czterdzieści ");
                    liczba-=dziesiatki*10;
                    break;
                case 5:
                    System.out.print("pięćdziesiąt ");
                    liczba-=dziesiatki*10;
                    break;
                case 6:
                    System.out.print("sześćdziesiąt ");
                    liczba-=dziesiatki*10;
                    break;
                case 7:
                    System.out.print("siedemdziesiąt ");
                    liczba-=dziesiatki*10;
                    break;
                case 8:
                    System.out.print("osiemdziesiąt ");
                    liczba-=dziesiatki*10;
                    break;
                case 9:
                    System.out.print("dziewięćdziesiąt ");
                    liczba-=dziesiatki*10;
                    break;
            }
        }
switch (liczba) {
    case 1:
        System.out.print("jeden");
        break;
    case 2:
        System.out.print("dwa");
        break;
    case 3:
        System.out.print("trzy");
        break;
    case 4:
        System.out.print("cztery");
        break;
    case 5:
        System.out.print("pięć");
        break;
    case 6:
        System.out.print("sześć");
        break;
    case 7:
        System.out.print("siedem");
        break;
    case 8:
        System.out.print("osiem");
        break;
    case 9:
        System.out.print("dziewięć");
        break;
}
    }


}
