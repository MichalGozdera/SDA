public class Zad3 {

    //3. Napisz pętlę for, która uzupełni wartości w tablicy wartościami i+3 w zakresie <100, 130>, wyświetl tablicę w konsoli;
    public static void main(String[] args) {
        int[] tab=new int[31]; //inicjalizacja tablicy
        for (int i=100;i<=130;i++)
        {
            tab[i-100]=i+3;
            System.out.println(tab[i-100]);
        }
    }
}
