package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

public class Zad4
/*
4. Napisz program obliczający iloczyn elementów nieparzystych tablicy dwuwymiarowej.
public int multiplyOddElements(int[][] arr);
 */
{
    public static void main(String[] args) {

        Zad4 zadanie4 = new Zad4();
        System.out.println("iloczyn nieparzystych elementów tablicy wynosi "+zadanie4.multiplyOddElements(Tablica.wczytaj()));
    }

    public int multiplyOddElements(int[][] arr) {
        int iloczyn = 1;
        for (int[] a : arr) {
            for (int b : a) {
                if(b%2==0)
                    continue;
                iloczyn *= b;
            }
        }
        return iloczyn;
    }
}
