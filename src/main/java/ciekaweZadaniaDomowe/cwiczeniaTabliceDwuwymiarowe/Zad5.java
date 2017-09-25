package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

public class Zad5 {
/*
5. Napisz program obliczający iloczyn elementów podzielnych przez 3 tablicy dwuwymiarowej.
public int multiplyElementsDividedByThree(int[][] arr);
 */

        public static void main(String[] args) {

            Zad5 zadanie5 = new Zad5();
            System.out.println("iloczyn podzielnych przez 3 elementów tablicy wynosi " + zadanie5.multiplyElementsDividedByThree(Tablica.tab1.wczytaj()));
        }

        public int multiplyElementsDividedByThree(int[][] arr) {
            int iloczyn = 1;
            for (int[] a : arr) {
                for (int b : a) {
                    if (b % 3 != 0)
                        continue;
                    iloczyn *= b;
                }
            }
            return iloczyn;
        }
}
