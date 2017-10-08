/**
 * ) Uzupełnienie tablicy 20 elementowej losowymi liczbami z zakresu <0;100> (Do losowania polecam użyć klasy Random)
 b) Znalezienie  największego elementu tablicy
 c) Wyznaczenie średniej arytmetycznej wartości zawartych w tablicy
 d) Zamiana wartości w tablicy wg następującego schematu (do wykonania w ramach jednej pętli):
 - jeśli liczba jest < 20 -> pomnóż razy 2
 - jeśli liczba jest podzielna przez 5 -> Dodaj 2
 - jeśli liczba jest == 50 -> podnieś do potęgi 2
 - jeśli liczba jest > 80 -> odejmij od niej wartość pierwszego elementu tablicy
 - UWAGA - może się okazać że dany element tablicy może spełniać kilka warunków - wtedy należy wykonać każdą czynność, która jest przypisana do tych warunków, które spełnia dana liczba
 */

import java.util.Random;

public class LosowoscITablice {
    public static void main(String[] args) {

        int[] tablica = new int[20];
        fillArray(tablica);
        printArray(tablica);
        System.out.println("Maksymalny element wynosi "+getMax(tablica));
        System.out.println("Srednia z elementów wynosi "+srednia(tablica));
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
