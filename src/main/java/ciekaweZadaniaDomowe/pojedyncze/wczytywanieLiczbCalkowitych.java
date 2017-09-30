import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Nale¿y napisaæ program, który bêdzie wczytywa³ kolejno wartoœci do tablicy - wartoœci maj¹ byæ podawane przez u¿ytkownika
 * - APLIKACJA NIE MO¯E siê zamkn¹æ, dopóki u¿ytkownik nie poda 5 poprawnych liczb.
 * W przypadku podania ³añcucha nie bêd¹cego liczb¹ nale¿y poinformowaæ u¿ytkownika o b³êdzie i poprosiæ o podanie kolejnej liczby.
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
