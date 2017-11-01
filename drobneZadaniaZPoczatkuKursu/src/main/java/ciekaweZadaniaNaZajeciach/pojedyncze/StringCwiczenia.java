package ciekaweZadaniaNaZajeciach.pojedyncze;

import java.util.Scanner;

public class StringCwiczenia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj pierwszego stringa");
        String s1 = s.next();
        System.out.println("Wczytaj drugiego stringa");
        String s2 = s.next();
        System.out.println("Pierwszy string ma długość " + s1.length() + " natomiast drugi ma długość " + s2.length());
        if (s1.toLowerCase().compareTo(s2.toLowerCase()) < 0) {
            System.out.println("Tak, pierwszy string jest alfabetycznie pierwszy");
        } else {
            System.out.println("nie, pierwszy string jest alfabetycznie drugi");
        }
        System.out.println(s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase()).concat(" ").concat(s2.substring(0, 1).toUpperCase()).concat(s2.substring(1).toLowerCase()));
        System.out.println("Wczytaj jakiś tekst");
        s.nextLine();
        String str = s.nextLine();
        System.out.println(str);
        System.out.println("Od którego elementu mam wyświetlić");
        int i1 = s.nextInt();
        System.out.println("Na którym elemencie mam skończyć wyświetlanie");
        int i2 = s.nextInt();
      if (i1 > str.length() || i2 > str.length()) {
            System.out.println("Długość ma znaczenie. Nie tylko stringa, który też jest za krótki");
            return;
        }
        if (i1 >= i2)
            System.out.println(str.subSequence(i2-1, i1-1));
        else
            System.out.println(str.subSequence(i1-1, i2-1));

        System.out.println("Wczytaj jakiś tekst by sprawdzić czy to palindrom");
        s.nextLine();
        String s3 = s.nextLine();
        String s4 = s3.replaceAll("\\s+", "").toLowerCase();
        char[] palin = s4.toCharArray();
        for (int i = 0; i < palin.length; i++) {
            if (palin[i] != palin[palin.length - i - 1]) {
                System.out.println(s3 + " nie jest palindromem");
                break;
            }
            if (i > palin.length / 2) {
                System.out.println(s3 + " jest palindromem");
                break;
            }
        }
        String s5 = new StringBuilder(s4).reverse().toString();
        if (s5.equals(s4))
            System.out.println("Metoda equals wykazała, że " + s3 + " jest palindromem");
        else
            System.out.println("Metoda equals wykazała, że " + s3 + " nie jest palindromem");

    }


}
