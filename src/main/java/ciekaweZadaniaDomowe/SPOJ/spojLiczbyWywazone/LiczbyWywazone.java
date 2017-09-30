/*
Liczby wywa¿one
Liczb¹ wywa¿on¹ nazwiemy dodatni¹ liczbê naturaln¹ posiadaj¹c¹ tyle samo dzielników parzystych co nieparzystych.
Twoim zadaniem bêdzie wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wywa¿onej wiêkszej od N.
Wejœcie
W pierwszym wierszu wejœcia znajduje siê liczba C, okreœlaj¹ca iloœæ zestawów danych, 1 ? C ? 100.
Ka¿dy z C zestawów danych sk³ada siê z jednego wiersza zawieraj¹cego jedn¹ dodatni¹ liczbê naturaln¹ N, sk³adaj¹c¹ siê co najwy¿ej z 200 cyfr.
Wyjœcie
Dla ka¿dego zestawu danych, w osobnych liniach wyjœcia, nale¿y wyznaczyæ najmniejsz¹ liczbê wywa¿on¹ wiêksz¹ od zadanej liczby N z ka¿dego zestawu danych.
Przyk³ad
Dla danych wejœciowych:
2
1
2
poprawn¹ odpowiedzi¹ jest:
2
6
 */

import java.math.BigInteger;
import java.util.Scanner;

public class LiczbyWywazone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb mam przetworzyæ?");
        int ileLiczb = scanner.nextInt();
        for (int i = 0; i < ileLiczb; i++) {
            try {
                System.out.println("Wczytaj "+(i+1)+" liczbê");
                BigInteger bi = new BigInteger(scanner.next());
                if (bi.remainder(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                    bi = bi.add(BigInteger.ONE);
                }
                if (bi.remainder(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
                    bi = bi.add(BigInteger.valueOf(2));
                }
                System.out.println("Czy chcesz znaleŸæ najmniejsz¹ liczbê wywa¿on¹ wiêksz¹ od podanej za pomoc¹ metody szybkiej z wyjaœnieniem, czy te¿ wolnej, ale bez wyjaœnienia? \n" +
                        "1. Szybko\n" +
                        "2. Wolno");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Liczba wywa¿ona to liczba posiadaj¹ca tyle samo dzielników parzystych, co nieparzystych.\n" +
                                "Z góry odrzucamy wszelkie liczby nieparzyste, jako nieposiadaj¹ce dzielników parzystych\n" +
                                "Problem pojawia siê z parzystymi liczbami.\n" +
                                "Rozk³ad dzielników dowolnej liczny N to:\n" +
                                "1, d1, d2, d(x)... a¿ do pierwiastka kwadratowego z liczby N, nastêpnie N/d(x)....N/d2, N/d1, N\n" +
                                "Ka¿dy dzielnik koresponduje z innym dzielnikiem, który jest tak naprawdê ilorem dzielenia liczby bazowej przez dany dzielnik\n" +
                                "Je¿eli N jest kwadratem liczby ca³kowitej to mamy nieparzyst¹ liczbê dzielników\n" +
                                "Aby liczba N (parzysta) by³a wywa¿ona, to ka¿dy z dzielników d1,d2,...d(x) musi dawaæ iloraz N/d1,N/d2,...N/dx\n" +
                                "pod takim warunkiem, ¿e jeœli dx jest parzysta, to N/dx jest nieparzysta.\n" +
                                "Jeœli dx jest parzyste (podzielne przez 2) daje iloraz N/dx, który równie¿ jest parzysty, oznacza to dwie kwestie:\n" +
                                "1. N jest podzielne przez 4.\n" +
                                "2. N nie jest wywa¿one, poniewa¿ ma co najmniej o 2 dzielniki parzyste wiêcej od nieparzystych\n" +
                                "Nale¿y odrzuciæ zatem wszelkie liczby podzielne przez 4." +
                                "Po odrzuceniu liczb nieparzystych oraz podzielnych przez 4 pozostaj¹ nam jedynie liczy postaci 4n+2 (nale¿y do naturalnych)\n" +
                                "Dla takich liczb nie zachodzi warunek by dzielnik parzysty dawa³ parzysty iloraz, niemo¿liwe jest te¿ by nieparzysty dzielnik dawa³ nieparzysty iloraz\n" +
                                "albowiem iloczyn dwóch liczb nieparzystych nie mo¿e dawaæ liczby parzystej.\n" +
                                "Pozostaje jedyne wyjœcie - ka¿dy dzielnik parzysty dx daje nieparzysty iloraz N/dx, co spe³nia warunek liczby wywa¿onej\n" +
                                "Wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wywa¿onej wiêkszej od N. sprowadza siê do wyznaczenia kolejnej liczby wiêkszej od N\n" +
                                "spe³niaj¹cej warunek 4n+2 (nale¿y do naturalnych)\n" +
                                "W tym wypadku bêdzie to:");
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
                            System.out.println("Nie umiesz czytaæ");
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

