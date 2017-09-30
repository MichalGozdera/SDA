
import java.time.LocalDate;
import java.util.Scanner;

public class PESEL {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wczytaj 11 cyfrowy nr PESEL");
        String pesel = scanner.nextLine();
        try {
        isValid(pesel);
    } catch (Exception e){
            System.out.println(e.getMessage());
    }
}

    static boolean isValid(String pesel) throws Exception {
        String komunikat = "";
        if (pesel.length() != 11) {
            komunikat = "Niepoprawna d�ugo�� numeru PESEL";
            throw new Exception(komunikat);
        }
        char[] peselarray = pesel.toCharArray();
        for (char c : peselarray) {
            if (c < 48 || c > 57) { // cyfry to znaki o warto�ci ASCII od 48 do 57.
                komunikat = "Nr PESEL powinien zawiera� tylko liczby";
                throw new Exception(komunikat);
            }
        }
        for (int i = 0; i < peselarray.length; i++) {
            peselarray[i] -= 48;
        }
        int sumakontrola = peselarray[0] * 9 + peselarray[1] * 7 + peselarray[2] * 3 + peselarray[3] + peselarray[4] * 9 + peselarray[5] * 7 + peselarray[6] * 3 + peselarray[7] + peselarray[8] * 9 + peselarray[9] * 7;
        if (sumakontrola % 10 != peselarray[10]) {
            komunikat = "Z�a suma kontrolna";
           throw new Exception(komunikat);
        }
        int[] miesiace = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = peselarray[0] * 10 + peselarray[1];
        int month = peselarray[2] * 10 + peselarray[3];
        int day = peselarray[4] * 10 + peselarray[5];
        if (month > 0 && month < 13) {
            year += 1900;
        } else if (month > 20 && month < 33) {
            year += 2000;
            month -= 20;
        } else if (month > 40 && month < 53) {
            year += 2100;
            month -= 40;
        } else if (month > 60 && month < 73) {
            year += 2200;
            month -= 60;
        } else if (month > 80 && month < 93) {
            year += 1800;
            month -= 80;
        } else {
            komunikat = "Niepoprawny miesi�c";
            throw new Exception(komunikat);
        }
        if (isLeapYear(year)) {
            miesiace[1] += 1;
        }
        if (day > miesiace[month - 1]) {
            komunikat = "Niepoprawny dzie�";
            throw new Exception(komunikat);
        }

        LocalDate dzisiaj = LocalDate.now();
        LocalDate data = LocalDate.of(year, month, day);

        String[] sex;
        if (peselarray[9] % 2 == 0) {
            sex = new String[]{"Kobieta", ", kt�ra urodzi si� w dniu ", ", kt�ra urodzi�a si� dnia ", " przysz�a na �wiat nowa obywatelka"};
        } else {
            sex = new String[]{"M�czyzna", ", kt�ry urodzi si� w dniu ", ", kt�ry urodzi� si� dnia ", " przyszed� na �wiat nowy obywatel"};
        }
        if (data.compareTo(dzisiaj) > 0) {
            komunikat = sex[0] + sex[1] + data;
            System.out.println(komunikat);
            return true;
        } else if (data.compareTo(dzisiaj) < 0) {
            komunikat = sex[0] + sex[2] + data;
            System.out.println(komunikat);
            return true;
        } else {
            komunikat = "Dzisiaj" + sex[3];
            System.out.println(komunikat);
            return true;
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
