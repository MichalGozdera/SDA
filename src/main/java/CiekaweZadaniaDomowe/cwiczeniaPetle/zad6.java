import java.util.ArrayList;
import java.util.Scanner;

public class zad6 {
    //6. Napisz pętlę do..while, która będzie wczytywała elementy do tablicy dopóki użytkownik nie poda argumentu -1.
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(); //a co mi tam. Nie wiem jaka będzie wielkość tablicy więc użyję kontenera, o którym było na preworkach.
        int i = 0; //do iteracji po pętli
        Scanner s = new Scanner(System.in); //wczytujemy dane z klawiatury
        do {
            lista.add(i++, s.nextInt()); //dodajemy elementy do listy
        }
        while (lista.get(i - 1) != -1); //warunek kontynuacji pętli
    }
}
