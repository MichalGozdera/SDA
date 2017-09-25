
import java.util.*;

public class Totolotek {


    public static void main(String[] args) {
        Set<Integer> zwyciêskie = losuj();
        Set<Integer> losowe = null;
        switch (choice()) {
            case 1:
                losowe = wczytaj();
                break;
            case 2:
                losowe = losuj();
                break;

        }
        System.out.println("Poda³eœ nastêpuj¹ce liczby" + losowe);
        wygrana(zwyciêskie, losowe);
        System.out.println("Zwyciêskie liczby to " + zwyciêskie);
        System.out.println("z takimi liczbami wygra³byœ szóstkê dopiero w " + iloscLosowan(losowe) + " losowaniu");

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
        System.out.println("Wybierz 1 by wprowadziæ w³asne liczby albo 2 by zagraæ na chybi³ trafi³.");
        switch (s.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                System.out.println("Wracaj do podstawówki uczyæ siê czytaæ\n Gramy na chybi³ trafi³");
                return 2;
        }
    }

    public static Set<Integer> wczytaj() {
        Scanner s = new Scanner(System.in);
        Set<Integer> zestaw = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Wczytaj " + (i + 1) + " liczbê");
            int liczba = s.nextInt();
            while (liczba > 49 || liczba < 1 || zestaw.contains(liczba)) {
                System.out.println("Z³a liczba, wczytaj kolejn¹");
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
        System.out.println("Wylosowa³eœ " + wylosowane + " liczb");
    }

    public static int iloscLosowan(Set<Integer> losowe) {
        Set<Integer> zwyciêskie = losuj();
        int liczbaSzans = 0;
        while (!(losowe.containsAll(zwyciêskie))) {
            zwyciêskie = losuj();
            liczbaSzans++;
        }
        System.out.println(zwyciêskie);
        return liczbaSzans;
    }

}
