package ciekaweZadaniaNaZajeciach.bank;


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
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Jesteś nowym klientem");
            System.out.println("2. Zakładasz nowe konto");
            System.out.println("3. Zwracasz pożyczkę");
            System.out.println("4. Wyjmujesz lokatę");
            System.out.println("5. Chcesz nową pożyczkę");
            System.out.println("6. Chcesz założyć lokatę");
            String ops = s.next();
            if (ops.equals("stop"))
                return;
            else
                bank1.obsluga(Integer.parseInt(ops));

            System.out.println(bank1);
            bank1.wyswietlKlientow();


        }
    }


}
