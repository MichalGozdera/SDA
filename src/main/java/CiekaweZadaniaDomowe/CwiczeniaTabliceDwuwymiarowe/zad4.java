package CiekaweZadaniaDomowe.CwiczeniaTabliceDwuwymiarowe;

public class zad4
/*
4. Napisz program obliczający iloczyn elementów nieparzystych tablicy dwuwymiarowej.
public int multiplyOddElements(int[][] arr);
 */
{
    public static void main(String[] args) {

        zad4 zadanie4 = new zad4();
        System.out.println("iloczyn nieparzystych elementów tablicy wynosi "+zadanie4.multiplyOddElements(tablica.tab1.wczytaj()));
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
