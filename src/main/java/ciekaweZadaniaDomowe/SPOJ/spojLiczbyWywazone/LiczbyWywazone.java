/*
Liczby wyważone
Liczbą wyważoną nazwiemy dodatnią liczbę naturalną posiadającą tyle samo dzielników parzystych co nieparzystych.
Twoim zadaniem będzie wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wyważonej większej od N.
Wejście
W pierwszym wierszu wejścia znajduje się liczba C, określająca ilość zestawów danych, 1 ? C ? 100.
Każdy z C zestawów danych składa się z jednego wiersza zawierającego jedną dodatnią liczbę naturalną N, składającą się co najwyżej z 200 cyfr.
Wyjście
Dla każdego zestawu danych, w osobnych liniach wyjścia, należy wyznaczyć najmniejszą liczbę wyważoną większą od zadanej liczby N z każdego zestawu danych.
Przykład
Dla danych wejściowych:
2
1
2
poprawną odpowiedzią jest:
2
6
 */

import java.math.BigInteger;
import java.util.Scanner;

public class LiczbyWywazone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb mam przetworzyć?");
        int ileLiczb = scanner.nextInt();
        for (int i = 0; i < ileLiczb; i++) {
            try {
                System.out.println("Wczytaj "+(i+1)+" liczbę");
                BigInteger bi = new BigInteger(scanner.next());
                if (bi.remainder(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                    bi = bi.add(BigInteger.ONE);
                }
                if (bi.remainder(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
                    bi = bi.add(BigInteger.valueOf(2));
                }
                System.out.println("Czy chcesz znaleźć najmniejszą liczbę wyważoną większą od podanej za pomocą metody szybkiej z wyjaśnieniem, czy też wolnej, ale bez wyjaśnienia? \n" +
                        "1. Szybko\n" +
                        "2. Wolno");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Liczba wyważona to liczba posiadająca tyle samo dzielników parzystych, co nieparzystych.\n" +
                                "Z góry odrzucamy wszelkie liczby nieparzyste, jako nieposiadające dzielników parzystych\n" +
                                "Problem pojawia się z parzystymi liczbami.\n" +
                                "Rozkład dzielników dowolnej liczny N to:\n" +
                                "1, d1, d2, d(x)... aż do pierwiastka kwadratowego z liczby N, następnie N/d(x)....N/d2, N/d1, N\n" +
                                "Każdy dzielnik koresponduje z innym dzielnikiem, który jest tak naprawdę ilorem dzielenia liczby bazowej przez dany dzielnik\n" +
                                "Jeżeli N jest kwadratem liczby całkowitej to mamy nieparzystą liczbę dzielników\n" +
                                "Aby liczba N (parzysta) była wyważona, to każdy z dzielników d1,d2,...d(x) musi dawać iloraz N/d1,N/d2,...N/dx\n" +
                                "pod takim warunkiem, że jeśli dx jest parzysta, to N/dx jest nieparzysta.\n" +
                                "Jeśli dx jest parzyste (podzielne przez 2) daje iloraz N/dx, który również jest parzysty, oznacza to dwie kwestie:\n" +
                                "1. N jest podzielne przez 4.\n" +
                                "2. N nie jest wyważone, ponieważ ma co najmniej o 2 dzielniki parzyste więcej od nieparzystych\n" +
                                "Należy odrzucić zatem wszelkie liczby podzielne przez 4." +
                                "Po odrzuceniu liczb nieparzystych oraz podzielnych przez 4 pozostają nam jedynie liczy postaci 4n+2 (należy do naturalnych)\n" +
                                "Dla takich liczb nie zachodzi warunek by dzielnik parzysty dawał parzysty iloraz, niemożliwe jest też by nieparzysty dzielnik dawał nieparzysty iloraz\n" +
                                "albowiem iloczyn dwóch liczb nieparzystych nie może dawać liczby parzystej.\n" +
                                "Pozostaje jedyne wyjście - każdy dzielnik parzysty dx daje nieparzysty iloraz N/dx, co spełnia warunek liczby wyważonej\n" +
                                "Wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wyważonej większej od N. sprowadza się do wyznaczenia kolejnej liczby większej od N\n" +
                                "spełniającej warunek 4n+2 (należy do naturalnych)\n" +
                                "W tym wypadku będzie to:");
                        System.out.println(bi);
                        break;
                    case 2:
                        scanner.nextLine();
                        while (!wywazone(bi)) {
                            bi = bi.add(BigInteger.ONE);
                            System.out.println(bi);
                        }
                        System.out.println(bi);
                        break;
                        default:
                            System.out.println("Nie umiesz czytać");
                            break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny format liczby");
                i--;
            }
        }
    }

    static BigInteger sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
        while (b.compareTo(a) >= 0) {
            BigInteger mid = a.add(b).shiftRight(1);
            if (mid.multiply(mid).compareTo(n) > 0) {
                b = mid.subtract(BigInteger.ONE);
            } else {
                a = mid.add(BigInteger.ONE);
            }
        }
        return a.subtract(BigInteger.ONE);
    }

    static boolean wywazone(BigInteger bi) {
        BigInteger pierwiastek = sqrt(bi);
        for (BigInteger bg = BigInteger.valueOf(2); bg.compareTo(pierwiastek) <= 0; bg = bg.add(BigInteger.ONE)) {
            if (bi.remainder(bg).equals(BigInteger.ZERO)) {
                if (bg.remainder(BigInteger.valueOf(2)).equals(bi.divide(bg).remainder(BigInteger.valueOf(2)))) {
                    return false;
                }
            }
            if (bg.equals(pierwiastek)) {
                return true;
            }
        }
        return false;
    }
}

