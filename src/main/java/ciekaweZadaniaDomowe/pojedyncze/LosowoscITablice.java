/**
 * ) Uzupe³nienie tablicy 20 elementowej losowymi liczbami z zakresu <0;100> (Do losowania polecam u¿yæ klasy Random)
 b) Znalezienie  najwiêkszego elementu tablicy
 c) Wyznaczenie œredniej arytmetycznej wartoœci zawartych w tablicy
 d) Zamiana wartoœci w tablicy wg nastêpuj¹cego schematu (do wykonania w ramach jednej pêtli):
 - jeœli liczba jest < 20 -> pomnó¿ razy 2
 - jeœli liczba jest podzielna przez 5 -> Dodaj 2
 - jeœli liczba jest == 50 -> podnieœ do potêgi 2
 - jeœli liczba jest > 80 -> odejmij od niej wartoœæ pierwszego elementu tablicy
 - UWAGA - mo¿e siê okazaæ ¿e dany element tablicy mo¿e spe³niaæ kilka warunków - wtedy nale¿y wykonaæ ka¿d¹ czynnoœæ, która jest przypisana do tych warunków, które spe³nia dana liczba
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
