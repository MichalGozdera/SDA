
import java.util.*;

public class Totolotek {


    public static void main(String[] args) {
        Set<Integer> zwyci�skie = losuj();
        Set<Integer> losowe = null;
        switch (choice()) {
            case 1:
                losowe = wczytaj();
                break;
            case 2:
                losowe = losuj();
                break;

        }
        System.out.println("Poda�e� nast�puj�ce liczby" + losowe);
        wygrana(zwyci�skie, losowe);
        System.out.println("Zwyci�skie liczby to " + zwyci�skie);
        System.out.println("z takimi liczbami wygra�by� sz�stk� dopiero w " + iloscLosowan(losowe) + " losowaniu");

    }
    public static Set<Integer> losuj() {
        Random r = new Random();
        Set<Integer> zestaw = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            int liczba = r.nextInt(49) + 1;
            while (zestaw.contains(liczba))
                liczba = r.nextInt(49) + 1;
            zestaw.add(liczba);
        }
        return zestaw;
    }

    public static int choice() {
        Scanner s = new Scanner(System.in);
        System.out.println("Wybierz 1 by wprowadzi� w�asne liczby albo 2 by zagra� na chybi� trafi�.");
        switch (s.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                System.out.println("Wracaj do podstaw�wki uczy� si� czyta�\n Gramy na chybi� trafi�");
                return 2;
        }
    }

    public static Set<Integer> wczytaj() {
        Scanner s = new Scanner(System.in);
        Set<Integer> zestaw = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Wczytaj " + (i + 1) + " liczb�");
            int liczba = s.nextInt();
            while (liczba > 49 || liczba < 1 || zestaw.contains(liczba)) {
                System.out.println("Z�a liczba, wczytaj kolejn�");
                liczba = s.nextInt();
            }
            zestaw.add(liczba);
        }
        return zestaw;
    }

    public static void wygrana(Set<Integer> zwycieskie, Set<Integer> losowe) {
        int wylosowane = 0;
        for (Integer num : losowe) {
            if (zwycieskie.contains(num)) {
                wylosowane++;
            }
        }
        System.out.println("Wylosowa�e� " + wylosowane + " liczb");
    }

    public static int iloscLosowan(Set<Integer> losowe) {
        Set<Integer> zwyci�skie = losuj();
        int liczbaSzans = 0;
        while (!(losowe.containsAll(zwyci�skie))) {
            zwyci�skie = losuj();
            liczbaSzans++;
        }
        System.out.println(zwyci�skie);
        return liczbaSzans;
    }

}
