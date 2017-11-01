package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

public class Zad6
/*
6. Napisz program znajdujący minimalny element tablicy dwuwymiarowej.
public int find2DArrayMin(int[][] arr);
 */
{
    public static void main(String[] args) {

        Zad6 zadanie6 = new Zad6();
        System.out.println("minimalny element tablicy wynosi " + zadanie6.find2DArrayMin(Tablica.wczytaj()));
    }

    public int find2DArrayMin(int[][] arr) {
        int min = arr[0][0];
        for (int[] a : arr) {
            for (int b : a) {
                if (b >=min)
                    continue;
                min=b;
            }
        }
        return min;
    }

}
