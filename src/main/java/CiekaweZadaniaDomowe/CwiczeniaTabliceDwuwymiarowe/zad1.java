package CiekaweZadaniaDomowe.CwiczeniaTabliceDwuwymiarowe;

public class zad1
//1. Napisz program sumujący elementy podzielne przez 7 tablicy dwuwymiarowej.
//public int addElementsDividedBySeven(int[][] arr);
{
    public static void main(String[] args) {

        zad1 zadanie1 = new zad1();
        System.out.println("suma elementów podzielnych przez 7 wynosi "+zadanie1.addElementsDividedBySeven(tablica.tab1.wczytaj()));
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
