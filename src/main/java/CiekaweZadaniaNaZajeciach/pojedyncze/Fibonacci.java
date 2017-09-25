package CiekaweZadaniaNaZajeciach.pojedyncze;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj kt�ry element ci�gu Fibonacciego mam wy�wietli�?");
        String liczbaElement�w = s.nextLine();
        int ntaLiczba = 1;
        int iminus1 = 1;
        int iminus2 = 1;
        try {
            Integer ilosc = Integer.parseInt(liczbaElement�w);
            if (ilosc >= 0) {
                for (int i = 0; i <= ilosc; i++) {
                    if (i == 1 || i == 0) {
                        ntaLiczba = 1;
                    } else {
                        ntaLiczba = iminus1 + iminus2;
                        iminus2 = iminus1;
                        iminus1 = ntaLiczba;

                    }
                }
                System.out.println("Iteracyjnie "+ ntaLiczba);
                System.out.println("Rekurencyjnie " + fiborekur(ilosc));
            }
            else {
                System.out.println("Nie ma ujemnych liczb Fibonacciego");
            }
        } catch (NumberFormatException e) {
            System.out.println("Poda�e� co� co nie jest liczb�");
        }
        System.out.println("Ile element�w ci�gu fibonacciego mam wy�wietli� ?");
        int ileFibo = s.nextInt();
        wyswietlListe(fibo(ileFibo));

    }

    public static int fiborekur(Integer liczba) {
        if (liczba <2) {
            return 1;
        } else
            return fiborekur(liczba - 1) + fiborekur(liczba - 2);
    }
    private static int[] fibo(int dlugosc) {
        int[] fibo = new int[dlugosc];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < dlugosc; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
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

