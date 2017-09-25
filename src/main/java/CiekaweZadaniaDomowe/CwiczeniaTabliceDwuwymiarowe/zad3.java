package CiekaweZadaniaDomowe.CwiczeniaTabliceDwuwymiarowe;

public class zad3
/*
3. Napisz program obliczający iloczyn elementów parzystych tablicy dwuwymiarowej.
public int multiplyEvenElements(int[][] arr);
 */
{
    public static void main(String[] args) {

        zad3 zadanie3 = new zad3();
        System.out.println("iloczyn parzystych elementów tablicy wynosi "+zadanie3.multiplyEvenElements(tablica.tab1.wczytaj()));
    }

    public int multiplyEvenElements(int[][] arr) {
        int iloczyn = 1;
        for (int[] a : arr) {
            for (int b : a) {
                if(b%2==1)
                    continue;
                iloczyn *= b;
            }
        }
        return iloczyn;
    }
}
