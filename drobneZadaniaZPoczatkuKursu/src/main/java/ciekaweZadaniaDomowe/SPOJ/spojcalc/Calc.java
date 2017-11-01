/*
CALC - Kalkulator
Napisz program, który działa jak prosty kalkulator obsługujący pięć operacji: dodawanie, odejmowanie, mnożenie, dzielenie i obliczanie reszty z dzielenia liczb całkowitych.

Wejście
Na wejście programu podana zostanie pewna nieokreślona liczba zestawów danych. Zestawy składają się z jednoznakowego symbolu operacji do wykonania (+ dodawanie, - odejmowanie,
* mnożenie, / dzielenie całkowitoliczbowe, % reszta z dzielenia) oraz następujących po nim dwóch liczb całkowitych. Poszczególne składowe zestawu zostaną rozdzielone spacjami,
* a same zestawy znakiem nowej linii. Liczba testów nie przekracza 100, wynik zawiera się w typie int32.

Wyjście
Na wyjściu programu ma się pojawić ciąg liczb będących rezultatem wykonania pojawiających się na wejściu poleceń. Poszczególne liczby należy rozdzielić znakami nowej linii.
 Uwaga! Można założyć, że dane wejściowe nie zawierają polecenia dzielenia przez 0.
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
                System.out.println("Wczytano za dużo zmiennych");
                return;
            }
            int liczba1 = 0;
            int liczba2 = 0;
            try {
                liczba1 = Integer.parseInt(dane[1]);
                liczba2 = Integer.parseInt(dane[2]);
            } catch (NumberFormatException e) {
                System.out.println("Złe dane wejściowe");
            }
            switch (dane[0]) {
                case "+":
                    System.out.println("Rezultat dodawnia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 + liczba2));
                    break;
                case "-":
                    System.out.println("Rezultat odejmowania " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 - liczba2));
                    break;
                case "*":
                    System.out.println("Rezultat mnożenia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 * liczba2));
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
                    System.out.println("Niepoprawne działanie");
                    continue;
            }


        }
    }
}
