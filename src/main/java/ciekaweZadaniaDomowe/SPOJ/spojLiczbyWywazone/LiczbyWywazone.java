/*
Liczby wywa�one
Liczb� wywa�on� nazwiemy dodatni� liczb� naturaln� posiadaj�c� tyle samo dzielnik�w parzystych co nieparzystych.
Twoim zadaniem b�dzie wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wywa�onej wi�kszej od N.
Wej�cie
W pierwszym wierszu wej�cia znajduje si� liczba C, okre�laj�ca ilo�� zestaw�w danych, 1 ? C ? 100.
Ka�dy z C zestaw�w danych sk�ada si� z jednego wiersza zawieraj�cego jedn� dodatni� liczb� naturaln� N, sk�adaj�c� si� co najwy�ej z 200 cyfr.
Wyj�cie
Dla ka�dego zestawu danych, w osobnych liniach wyj�cia, nale�y wyznaczy� najmniejsz� liczb� wywa�on� wi�ksz� od zadanej liczby N z ka�dego zestawu danych.
Przyk�ad
Dla danych wej�ciowych:
2
1
2
poprawn� odpowiedzi� jest:
2
6
 */

import java.math.BigInteger;
import java.util.Scanner;

public class LiczbyWywazone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb mam przetworzy�?");
        int ileLiczb = scanner.nextInt();
        for (int i = 0; i < ileLiczb; i++) {
            try {
                System.out.println("Wczytaj "+(i+1)+" liczb�");
                BigInteger bi = new BigInteger(scanner.next());
                if (bi.remainder(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                    bi = bi.add(BigInteger.ONE);
                }
                if (bi.remainder(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) {
                    bi = bi.add(BigInteger.valueOf(2));
                }
                System.out.println("Czy chcesz znale�� najmniejsz� liczb� wywa�on� wi�ksz� od podanej za pomoc� metody szybkiej z wyja�nieniem, czy te� wolnej, ale bez wyja�nienia? \n" +
                        "1. Szybko\n" +
                        "2. Wolno");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Liczba wywa�ona to liczba posiadaj�ca tyle samo dzielnik�w parzystych, co nieparzystych.\n" +
                                "Z g�ry odrzucamy wszelkie liczby nieparzyste, jako nieposiadaj�ce dzielnik�w parzystych\n" +
                                "Problem pojawia si� z parzystymi liczbami.\n" +
                                "Rozk�ad dzielnik�w dowolnej liczny N to:\n" +
                                "1, d1, d2, d(x)... a� do pierwiastka kwadratowego z liczby N, nast�pnie N/d(x)....N/d2, N/d1, N\n" +
                                "Ka�dy dzielnik koresponduje z innym dzielnikiem, kt�ry jest tak naprawd� ilorem dzielenia liczby bazowej przez dany dzielnik\n" +
                                "Je�eli N jest kwadratem liczby ca�kowitej to mamy nieparzyst� liczb� dzielnik�w\n" +
                                "Aby liczba N (parzysta) by�a wywa�ona, to ka�dy z dzielnik�w d1,d2,...d(x) musi dawa� iloraz N/d1,N/d2,...N/dx\n" +
                                "pod takim warunkiem, �e je�li dx jest parzysta, to N/dx jest nieparzysta.\n" +
                                "Je�li dx jest parzyste (podzielne przez 2) daje iloraz N/dx, kt�ry r�wnie� jest parzysty, oznacza to dwie kwestie:\n" +
                                "1. N jest podzielne przez 4.\n" +
                                "2. N nie jest wywa�one, poniewa� ma co najmniej o 2 dzielniki parzyste wi�cej od nieparzystych\n" +
                                "Nale�y odrzuci� zatem wszelkie liczby podzielne przez 4." +
                                "Po odrzuceniu liczb nieparzystych oraz podzielnych przez 4 pozostaj� nam jedynie liczy postaci 4n+2 (nale�y do naturalnych)\n" +
                                "Dla takich liczb nie zachodzi warunek by dzielnik parzysty dawa� parzysty iloraz, niemo�liwe jest te� by nieparzysty dzielnik dawa� nieparzysty iloraz\n" +
                                "albowiem iloczyn dw�ch liczb nieparzystych nie mo�e dawa� liczby parzystej.\n" +
                                "Pozostaje jedyne wyj�cie - ka�dy dzielnik parzysty dx daje nieparzysty iloraz N/dx, co spe�nia warunek liczby wywa�onej\n" +
                                "Wyznaczenie dla zadanej dodatniej liczby N najmniejszej liczby wywa�onej wi�kszej od N. sprowadza si� do wyznaczenia kolejnej liczby wi�kszej od N\n" +
                                "spe�niaj�cej warunek 4n+2 (nale�y do naturalnych)\n" +
                                "W tym wypadku b�dzie to:");
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
                            System.out.println("Nie umiesz czyta�");
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

