import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Nale�y napisa� program, kt�ry b�dzie wczytywa� kolejno warto�ci do tablicy - warto�ci maj� by� podawane przez u�ytkownika
 * - APLIKACJA NIE MO�E si� zamkn��, dop�ki u�ytkownik nie poda 5 poprawnych liczb.
 * W przypadku podania �a�cucha nie b�d�cego liczb� nale�y poinformowa� u�ytkownika o b��dzie i poprosi� o podanie kolejnej liczby.
 */

public class wczytywanieLiczbCalkowitych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            try {
                Integer.parseInt(scanner.nextLine());
                i++;
            } catch (NumberFormatException e) {
            }
        }
    }
}
