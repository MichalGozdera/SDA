

public class Zad1 {
    //1. Napisz pętlę for, która automatycznie uzupełni wartości w tablicy wartościami od 0 do 5, następnie wyświetl tablicę w konsoli;
    public static void main(String[] args) {
        int[] tab1 = new int[6]; //tablica ma 6 elementów, bo liczymy od 0
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i; // uzupełnianie tablicy
            System.out.print(tab1[i] + "\t"); //wyświetlanie elemetów tablicy w jednej linijce. Elementy oddzielone tabulatorem.
        }
    }
}
