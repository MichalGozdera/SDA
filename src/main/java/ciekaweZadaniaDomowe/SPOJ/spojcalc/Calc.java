/*
CALC - Kalkulator
Napisz program, który dzia³a jak prosty kalkulator obs³uguj¹cy piêæ operacji: dodawanie, odejmowanie, mno¿enie, dzielenie i obliczanie reszty z dzielenia liczb ca³kowitych.

Wejœcie
Na wejœcie programu podana zostanie pewna nieokreœlona liczba zestawów danych. Zestawy sk³adaj¹ siê z jednoznakowego symbolu operacji do wykonania (+ dodawanie, - odejmowanie,
* mno¿enie, / dzielenie ca³kowitoliczbowe, % reszta z dzielenia) oraz nastêpuj¹cych po nim dwóch liczb ca³kowitych. Poszczególne sk³adowe zestawu zostan¹ rozdzielone spacjami,
* a same zestawy znakiem nowej linii. Liczba testów nie przekracza 100, wynik zawiera siê w typie int32.

Wyjœcie
Na wyjœciu programu ma siê pojawiæ ci¹g liczb bêd¹cych rezultatem wykonania pojawiaj¹cych siê na wejœciu poleceñ. Poszczególne liczby nale¿y rozdzieliæ znakami nowej linii.
 Uwaga! Mo¿na za³o¿yæ, ¿e dane wejœciowe nie zawieraj¹ polecenia dzielenia przez 0.
 */

import com.sun.deploy.util.ArrayUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws FileNotFoundException {
        File fr = new File("dane.txt");
        Scanner plik = new Scanner(fr);
        while (plik.hasNextLine()) {
            String line = plik.nextLine();
            System.out.println(line);
            String[] dane = line.split("\\s");
            if (dane.length > 3) {
                System.out.println("Wczytano za du¿o zmiennych");
                return;
            }
            int liczba1 = 0;
            int liczba2 = 0;
            try {
                liczba1 = Integer.parseInt(dane[1]);
                liczba2 = Integer.parseInt(dane[2]);
            } catch (NumberFormatException e) {
                System.out.println("Z³e dane wejœciowe");
            }
            switch (dane[0]) {
                case "+":
                    System.out.println("Rezultat dodawnia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 + liczba2));
                    break;
                case "-":
                    System.out.println("Rezultat odejmowania " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 - liczba2));
                    break;
                case "*":
                    System.out.println("Rezultat mno¿enia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 * liczba2));
                    break;
                case "/":
                    if (liczba2!=0) {
                        System.out.println("Rezultat dzielenia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 / liczba2));
                    }
                    else {
                        System.out.println("Nie dzielimy przez 0");
                    }
                    break;
                case "%":
                    if (liczba2!=0) {
                        System.out.println("Rezultat dzielenia modulo " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 % liczba2));
                    }
                    else {
                        System.out.println("Nie dzielimy przez 0");
                    }
                    break;
                default:
                    System.out.println("Niepoprawne dzia³anie");
                    continue;
            }


        }
    }
}
