package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

public class Zad1
//1. Napisz program sumujący elementy podzielne przez 7 tablicy dwuwymiarowej.
//public int addElementsDividedBySeven(int[][] arr);
{
    public static void main(String[] args) {

        Zad1 zadanie1 = new Zad1();
        System.out.println("suma elementów podzielnych przez 7 wynosi "+zadanie1.addElementsDividedBySeven(Tablica.wczytaj()));
    }

    public int addElementsDividedBySeven(int[][] arr) {
        int suma = 0;
        for (int[] a : arr) {
            for (int b : a) {
                if (b % 7 == 0)
                    suma +=b;
            }
        }
        return suma;
    }
}
