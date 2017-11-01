import java.time.DateTimeException;
import java.time.LocalDate;

public class Peselweryfikator {
    /**
     * Metoda weyfikująca poprawność numeru PESEL
     *
     * @param pesel Numer PESEL do sprawdzenia
     * @return true - jeśli PESEL jest poprawny; false - w przeciwnym wypadku
     * @throws Exception Jeśli PESEL jest niepoprawny, metoda zwróci wyjątek
     *                   z komunikatem z przyczyną nieprawidłowości
     */
    public static boolean czyPoprawny(String pesel) throws Exception {
        sprawdzIloscZnakow(pesel);
        sprawdzCzyWszystkieSaCyframi(pesel);
        sprawdzDateUrodzenia(pesel);
        sprawdzSumeKontrolna(pesel);
        return true;
    }

    private static void sprawdzIloscZnakow(String pesel) throws Exception {
        if (pesel == null || pesel.length() != 11)
            throw new Exception("PESEL nie zawiera 11 znaków!");
    }

    private static void sprawdzCzyWszystkieSaCyframi(String pesel) throws Exception {
        for (int i = 0; i < pesel.length(); i++) {
            zamienZnakNaCyfre(pesel, i);
        }
    }

    private static int zamienZnakNaCyfre(String pesel, int i) throws Exception {
        char znak = pesel.charAt(i);
        String znakJakoString = String.valueOf(znak);
        try {
            int cyfra = Integer.parseInt(znakJakoString);
            return cyfra;
        } catch (NumberFormatException e) {
            throw new Exception("Nie wszystkie cyfry numeru PESEL są poprawne");
        }
    }

    private static void sprawdzDateUrodzenia(String pesel) throws Exception {
        String rokString = pesel.substring(0, 2);
        String miesiacString = pesel.substring(2, 4);
        String dzienString = pesel.substring(4, 6);
        int rok = Integer.parseInt(rokString);
        int miesiac = Integer.parseInt(miesiacString);
        int dzien = Integer.parseInt(dzienString);
        if (miesiac < 20) {
            rok += 1900;
        } else if (miesiac < 40) {
            miesiac -= 20;
            rok += 2000;
        } else if (miesiac < 60) {
            miesiac -= 40;
            rok += 2100;
        } else if (miesiac < 80) {
            miesiac -= 60;
            rok += 2200;
        } else if (miesiac < 100) {
            miesiac -= 80;
            rok += 1800;
        }
        try {
            LocalDate.of(rok, miesiac, dzien);
        } catch (DateTimeException e) {
            throw new Exception("Data urodzenia jest nieprawidłowa");
        }
    }

    private static void sprawdzSumeKontrolna(String pesel) throws Exception {
        int[] wspolczynniki = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int cyfra = zamienZnakNaCyfre(pesel, i);
            suma += cyfra * wspolczynniki[i];
        }
        int ostatniaCyfraPesel=zamienZnakNaCyfre(pesel,10);
        if (suma%10!=ostatniaCyfraPesel){
            throw new Exception("Suma kontrolna numeru PESEL jest niepoprawna");
        }
    }
}



