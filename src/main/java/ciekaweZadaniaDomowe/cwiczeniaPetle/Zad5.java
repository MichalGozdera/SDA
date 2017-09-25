public class Zad5 {
    //5. Napisz pętlę do..while, która wczyta dokładnie 5 elementów do tablicy;

    public static void main(String[] args) {
        int[]tab=new int[5];//deklaracja tablicy
        int i=1;//narzędzie do iteracji po pętli
        do {
            tab[i-1]=i*7;//wypełnienie tablicy
            System.out.println(tab[i-1]);//wyświetlanie elementów
            i++;//inkrementacja
        }
        while (i<=5); //warunek zakończenia
    }
}
