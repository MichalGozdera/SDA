public class zad7 {
    /*
    double[] arr = { -5, 2.2, 3.011, -10, 15, -13, 123.14, -1/2 };
double sum = 0;
     */

    public static void main(String[] args) {

        double[] arr = {-5, 2.2, 3.011, -10, 15, -13, 123.14, (double) -1 / 2}; //musiałem zrzutować ostatni element bo czytało 0
        double sum = 0;
        //Zad 8 8. Napisz pętlę for, która w zmiennej sum zsumuje tylko liczby ujemne, a następnie wyświetl sumę w konsoli;
        System.out.println("Sumujemy liczby ujemne");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) //omijamy liczby dodatnie
            {
                continue;
            }
            sum += arr[i]; //sumujemy resztę
        }
        System.out.println("Suma liczb ujemnych wynosi " + sum);

        //9. Napisz pętlę for, która w zmiennej sum zsumuje tylko liczby nieparzyste, a następnie wyświetli sumę w konsoli;
        sum = 0; //zeruję sumę
        System.out.println("Sumujemy liczby ujemne");
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] % 2 == 0) //omijam liczby parzyste i liczby zmiennoprzecinkowe rzutuję na całkowite
                continue; //bez klamer bo tylko to robię po if
            sum += arr[i]; //sumuję resztę
        }
        System.out.println("Suma liczb nieparzystych wynosi " + sum);
        //10. Napisz pętlę while, która zsumuje w zmiennej sum tylko liczby dodatnie, wynik wyświetl w konsoli;
        sum = 0;
        System.out.println("Sumujemy liczby dodatnie");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) //omijamy liczby ujemne
            {
                continue;
            }
            sum += arr[i]; //sumujemy resztę
        }
        System.out.println("Suma liczb ujemnych dodatnich " + sum);
        //11. Napisz pętlę while, która w zmiennej sum zsumuje tylko i wyłącznie elementy całkowite (bez zmiennoprzecinkowych);
        sum = 0;
        System.out.println("Sumujemy liczby całkowite");
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] != arr[i])
                continue;
            sum += arr[i];
        }
        System.out.println("Suma liczb ujemnych całkowitych " + sum);
    }
}
