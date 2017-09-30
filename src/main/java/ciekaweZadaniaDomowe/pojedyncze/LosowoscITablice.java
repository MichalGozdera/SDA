/**
 * ) Uzupe�nienie tablicy 20 elementowej losowymi liczbami z zakresu <0;100> (Do losowania polecam u�y� klasy Random)
 b) Znalezienie  najwi�kszego elementu tablicy
 c) Wyznaczenie �redniej arytmetycznej warto�ci zawartych w tablicy
 d) Zamiana warto�ci w tablicy wg nast�puj�cego schematu (do wykonania w ramach jednej p�tli):
 - je�li liczba jest < 20 -> pomn� razy 2
 - je�li liczba jest podzielna przez 5 -> Dodaj 2
 - je�li liczba jest == 50 -> podnie� do pot�gi 2
 - je�li liczba jest > 80 -> odejmij od niej warto�� pierwszego elementu tablicy
 - UWAGA - mo�e si� okaza� �e dany element tablicy mo�e spe�nia� kilka warunk�w - wtedy nale�y wykona� ka�d� czynno��, kt�ra jest przypisana do tych warunk�w, kt�re spe�nia dana liczba
 */

import java.util.Random;

public class LosowoscITablice {
    public static void main(String[] args) {

        int[] tablica = new int[20];
        fillArray(tablica);
        printArray(tablica);
        System.out.println("Maksymalny element wynosi "+getMax(tablica));
        System.out.println("Srednia z element�w wynosi "+srednia(tablica));
        zamiana(tablica);
        printArray(tablica);
    }

    static void fillArray(int[] tablica) {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = r.nextInt(101);
        }
    }

    static void printArray(int[] tablica) {
        for (int i = 1; i < tablica.length; i++) {
            System.out.print(tablica[i]+"\t");
        }
    }

    static int getMax(int[] tablica) {
        int i = 0;
        for (int j : tablica) {
            if (j > i) {
                i = j;
            }
        }
        return i;
    }
    static double srednia(int[] tablica) {
        int suma = 0;
        for (int j : tablica) {
            suma+=j;
        }
        return (double)suma/tablica.length;
    }
    static void zamiana (int[] tablica){
        for (int i=0;i<tablica.length;i++){
            if (tablica[i]<20){
                tablica[i]*=2;
            }
            if (tablica[i]%5==0){
                tablica[i]+=2;
            }
            if (tablica[i]==50){
                tablica[i]*=tablica[i];
            }
            if (tablica[i]>80){
                tablica[i]-=tablica[0];
            }
        }
    }
}
