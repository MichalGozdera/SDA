package CiekaweZadaniaDomowe.CwiczeniaTabliceDwuwymiarowe;

public class zad6
/*
6. Napisz program znajdujący minimalny element tablicy dwuwymiarowej.
public int find2DArrayMin(int[][] arr);
 */
{
    public static void main(String[] args) {

        zad6 zadanie6 = new zad6();
        System.out.println("minimalny element tablicy wynosi " + zadanie6.find2DArrayMin(tablica.tab1.wczytaj()));
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
