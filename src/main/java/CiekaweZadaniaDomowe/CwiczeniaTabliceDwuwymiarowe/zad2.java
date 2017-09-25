package CiekaweZadaniaDomowe.CwiczeniaTabliceDwuwymiarowe;

public class zad2
/*
2. Napisz program obliczający iloczyn elementów tablicy dwuwymiarowej.
public int multiplyElements(int[][] arr);
 */ {
    public static void main(String[] args) {

        zad2 zadanie2 = new zad2();
        System.out.println("iloczyn elementów tablicy wynosi "+zadanie2.multiplyElements(tablica.tab1.wczytaj()));
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
