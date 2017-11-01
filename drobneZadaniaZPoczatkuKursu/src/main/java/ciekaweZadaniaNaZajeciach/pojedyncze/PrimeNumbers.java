package ciekaweZadaniaNaZajeciach.pojedyncze;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do jakiej liczby mam podać liczby pierwsze ?");
        int noPrimes = s.nextInt();
        long starttime = System.currentTimeMillis();
        wyswietlListe(primes(noPrimes));
        System.out.println("Wyswietlenie algorytmem n^2 zajelo " + (System.currentTimeMillis() - starttime) + " milisekund");
        starttime = System.currentTimeMillis();
        wyswietlListe(sito(noPrimes));
        System.out.println("Wyswietlenie algorytmem sita Erastotenesa zajelo " + (System.currentTimeMillis() - starttime) + " milisekund");
    }
    private static int[] primes(int zakres) {
        int[] primes = new int[zakres / 2];
        int index = 0;

        for (int i = 2; i < zakres; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[index] = i;
                index++;

            }
        }
        return primes;
    }

    private static boolean[] sito(int zakres) {
        boolean[] primes = new boolean[zakres + 1];
        for (int i = 2; i <= Math.sqrt(zakres); i++) {
            if (primes[i] == true) {
                continue;
            }
            for (int j = i + i; j <= zakres; j += i) {
                if (primes[j]) {
                    continue;
                }
                primes[j] = true;

            }
        }
        return primes;
    }

    private static void wyswietlListe(boolean[] lista) {
        for (int i = 2; i < lista.length; i++) {
            if (!lista[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n=============================");
    }
    private static void wyswietlListe(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("\n=============================");
    }
}
