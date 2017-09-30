/*
CALC - Kalkulator
Napisz program, kt�ry dzia�a jak prosty kalkulator obs�uguj�cy pi�� operacji: dodawanie, odejmowanie, mno�enie, dzielenie i obliczanie reszty z dzielenia liczb ca�kowitych.

Wej�cie
Na wej�cie programu podana zostanie pewna nieokre�lona liczba zestaw�w danych. Zestawy sk�adaj� si� z jednoznakowego symbolu operacji do wykonania (+ dodawanie, - odejmowanie,
* mno�enie, / dzielenie ca�kowitoliczbowe, % reszta z dzielenia) oraz nast�puj�cych po nim dw�ch liczb ca�kowitych. Poszczeg�lne sk�adowe zestawu zostan� rozdzielone spacjami,
* a same zestawy znakiem nowej linii. Liczba test�w nie przekracza 100, wynik zawiera si� w typie int32.

Wyj�cie
Na wyj�ciu programu ma si� pojawi� ci�g liczb b�d�cych rezultatem wykonania pojawiaj�cych si� na wej�ciu polece�. Poszczeg�lne liczby nale�y rozdzieli� znakami nowej linii.
 Uwaga! Mo�na za�o�y�, �e dane wej�ciowe nie zawieraj� polecenia dzielenia przez 0.
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
                System.out.println("Wczytano za du�o zmiennych");
                return;
            }
            int liczba1 = 0;
            int liczba2 = 0;
            try {
                liczba1 = Integer.parseInt(dane[1]);
                liczba2 = Integer.parseInt(dane[2]);
            } catch (NumberFormatException e) {
                System.out.println("Z�e dane wej�ciowe");
            }
            switch (dane[0]) {
                case "+":
                    System.out.println("Rezultat dodawnia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 + liczba2));
                    break;
                case "-":
                    System.out.println("Rezultat odejmowania " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 - liczba2));
                    break;
                case "*":
                    System.out.println("Rezultat mno�enia " + dane[1] + " i " + dane[2] + " wynosi " + (liczba1 * liczba2));
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
                    System.out.println("Niepoprawne dzia�anie");
                    continue;
            }


        }
    }
}
