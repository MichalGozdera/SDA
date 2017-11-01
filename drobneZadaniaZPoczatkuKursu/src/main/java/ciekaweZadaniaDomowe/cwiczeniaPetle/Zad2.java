public class Zad2 {
    //2. Napisz pętlę for, która automatycznie uzupełni wartości w tablicy liczbami parzystymi z zakresu <0, 10>, wynik wyświetl w konsoli - weź pod uwagę złożoność obliczeniową pętli;

    public static void main(String[] args) {
        int[] even = new int[6]; //deklaruję tablicę 6 elementową bo tyle jest liczb parzystych od 0 do 10 włącznie
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {//pomijam liczny nieparzyste
                continue;
            }
            even[i / 2] = i; //przypisuje elementom tablicy odpowiednie wartości. Jako,że to są liczny parzyste, to wartości są 2x większe niż indeksy tablicy stąd wyrażenie i/2
            System.out.println(i); //wyświetlenie elementów tablicy.
        }
    }
}
