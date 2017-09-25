public class zad4 {
    // 4. Napisz pętlę while, która wczyta 10 elementów do tablicy (typ elementów jest dowolny)

    public static void main(String[] args) {
        String[] napisy = new String[11];//inicjalizacja tablicy
        char literka = 'A'; // zabawimy się w abecadło. Duże A zrzutowane na liczbę to 65
        napisy[0] = new StringBuilder().append((char) 10).toString(); //pierwszy element tablicy to enter. zrzutowałem liczbę 10 na znak w systemie ASCII i to jest nowa linijka czyli ENTER
        //https://pl.wikipedia.org/wiki/ASCII tutaj jest cała tablica, która liczba odpowiada za jaki znak
        while (literka < 75) {// od 65 do 74 to będzie 10 elementów czyli tyle ile miało być w zadaniu
            napisy[(int) literka - 64] = new StringBuilder().append(napisy[literka - 65]).append(literka).toString();//element tablicy to literka dodana do poprzedniego elementu tablicy.
            //pierwszy element to litera A dodana do znaku ENTER.
            System.out.print(napisy[literka - 64]);//wypisujemy na konsoli kolejne elementy tablicy. Nie potrzebujemy używać println bo znak ENTER mamy na starcie każdego elementu tablicy.
            literka++; //przejście do następnego elementu tablicy.

        }
// Poświrowałem trochę, ale fajnie jest się trochę pobawić w zamianę liczb na znaki i ogarnąć jak komputer to widzi i potem sortuje.

    }
}
