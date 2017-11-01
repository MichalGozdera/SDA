package ciekaweZadaniaNaZajeciach.pojedyncze;

import java.math.BigInteger;

public class Silnia {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000");
        System.out.println(duzaSilniaIteracyjnie(a));
        System.out.println(duzaSilniaRekurencyjnie(a));
        System.out.println(silniaIteracyjnie(10));
        System.out.println(silniaRekurencyjnie(10));
    }

    static BigInteger duzaSilniaRekurencyjnie(BigInteger a) {
        BigInteger jeden = new BigInteger("1");
        int cos = a.intValue();
        if (cos == 1)
            return jeden;
        else
            return a.multiply(duzaSilniaRekurencyjnie(a.subtract(jeden)));
    }

    static BigInteger duzaSilniaIteracyjnie(BigInteger a) {
        BigInteger jeden = new BigInteger("1");
        BigInteger silniaa = jeden;
        while (a.compareTo(jeden) > 0) {
            silniaa = silniaa.multiply(a);
            a = a.subtract(jeden);
        }
        return silniaa;
    }

    static int silniaRekurencyjnie(int a) {
        if (a == 0)
            return 1;
        else if (a == 1)
            return 1;
        else
            return silniaRekurencyjnie(a - 1) * a;
    }

    static int silniaIteracyjnie(int a) {
        int wynik = 1;
        while (a > 0) {
            wynik *= a;
            a--;
        }
        return wynik;
    }
}
