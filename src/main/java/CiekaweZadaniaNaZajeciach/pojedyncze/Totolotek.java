
import java.util.*;

public class Totolotek {


    public static void main(String[] args) {
        Set<Integer> zwycieskie = losuj();
        Set<Integer> losowe = null;
        switch (choice()) {
            case 1:
                losowe = wczytaj();
                break;
            case 2:
                losowe = losuj();
                break;

        }
        System.out.println("Podałeś następujące liczby" + losowe);
        wygrana(zwycieskie, losowe);
        System.out.println("Zwycięskie liczby to " + zwycieskie);
        System.out.println("z takimi liczbami wygrałbyś szóstkę dopiero w " + iloscLosowan(losowe) + " losowaniu");

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
        System.out.println("Wybierz 1 by wprowadzić własne liczby albo 2 by zagrać na chybił trafił.");
        switch (s.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                System.out.println("Wracaj do podstawówki uczyć się czytać\n Gramy na chybił trafił");
                return 2;
        }
    }

    public static Set<Integer> wczytaj() {
        Scanner s = new Scanner(System.in);
        Set<Integer> zestaw = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Wczytaj " + (i + 1) + " liczbę");
            int liczba = s.nextInt();
            while (liczba > 49 || liczba < 1 || zestaw.contains(liczba)) {
                System.out.println("Zła liczba, wczytaj kolejną");
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
        System.out.println("Wylosowałeś " + wylosowane + " liczb");
    }

    public static int iloscLosowan(Set<Integer> losowe) {
        Set<Integer> zwycieskie = losuj();
        int liczbaSzans = 0;
        while (!(losowe.containsAll(zwycieskie))) {
            zwycieskie = losuj();
            liczbaSzans++;
        }
        System.out.println(zwycieskie);
        return liczbaSzans;
    }

}
