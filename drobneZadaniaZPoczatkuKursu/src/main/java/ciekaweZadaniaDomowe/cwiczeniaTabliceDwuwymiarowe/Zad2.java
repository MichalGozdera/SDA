package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

public class Zad2
/*
2. Napisz program obliczający iloczyn elementów tablicy dwuwymiarowej.
public int multiplyElements(int[][] arr);
 */ {
    public static void main(String[] args) {

        Zad2 zadanie2 = new Zad2();
        System.out.println("iloczyn elementów tablicy wynosi "+zadanie2.multiplyElements(Tablica.wczytaj()));
    }

    public int multiplyElements(int[][] arr) {
        int iloczyn = 1;
        for (int[] a : arr) {
            for (int b : a) {
                iloczyn *= b;
            }
        }
        return iloczyn;
    }
}
