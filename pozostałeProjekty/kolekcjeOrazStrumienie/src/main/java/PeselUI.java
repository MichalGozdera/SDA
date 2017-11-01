import java.util.Scanner;

public class PeselUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PESEL do weryfikacji");
        String pesel = scanner.nextLine();
        //miejsce na metodę wryfikującą
        try {
            boolean poprawny = Peselweryfikator.czyPoprawny(pesel);
            if (poprawny){
                System.out.println("Podany PESEL jest prawidłowy");
            }
            else {
                System.out.println("Podany PESEL jest błędny");
            }
        } catch (Exception e) {
            System.out.println("Podany PESEL jest błędny. Przyczyna błędu: "+ e.getMessage());
        }
    }
}
