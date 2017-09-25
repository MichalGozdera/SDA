package CiekaweZadaniaNaZajeciach.Bank;


import java.util.Random;
import java.util.Scanner;


public class Zarzadzanie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank bank1 = new Bank("PKO");
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        while (true) {
            if (System.currentTimeMillis() > (startTime + (1000 * 300))) {
                bank1.odsetki(5);
                startTime = System.currentTimeMillis();
            }
            System.out.println("Co chcesz zrobiæ?");
            System.out.println("1. Jesteœ nowym klientem");
            System.out.println("2. Zak³adasz nowe konto");
            System.out.println("3. Zwracasz po¿yczkê");
            System.out.println("4. Wyjmujesz lokatê");
            System.out.println("5. Chcesz now¹ po¿yczkê");
            System.out.println("6. Chcesz za³o¿yæ lokatê");
            String ops = s.next();
            if (ops.equals("stop"))
                return;
            else
                bank1.obs³uga(Integer.parseInt(ops));

            System.out.println(bank1);
            bank1.wyswietlKlientow();


        }
    }


}
