import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. Należy napisać program, który będzie wczytywał kolejno wartości do tablicy - wartości mają być podawane przez użytkownika
 * - APLIKACJA NIE MOŻE się zamknąć, dopóki użytkownik nie poda 5 poprawnych liczb.
 * W przypadku podania łańcucha nie będącego liczbą należy poinformować użytkownika o błędzie i poprosić o podanie kolejnej liczby.
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
