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
            System.out.println("Co chcesz zrobi�?");
            System.out.println("1. Jeste� nowym klientem");
            System.out.println("2. Zak�adasz nowe konto");
            System.out.println("3. Zwracasz po�yczk�");
            System.out.println("4. Wyjmujesz lokat�");
            System.out.println("5. Chcesz now� po�yczk�");
            System.out.println("6. Chcesz za�o�y� lokat�");
            String ops = s.next();
            if (ops.equals("stop"))
                return;
            else
                bank1.obs�uga(Integer.parseInt(ops));

            System.out.println(bank1);
            bank1.wyswietlKlientow();


        }
    }


}
