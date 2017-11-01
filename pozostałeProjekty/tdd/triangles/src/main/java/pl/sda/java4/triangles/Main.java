/**
 *Podaj 3 liczby - czy odcinki zadanych długości tworzą trójkąt?
 wydziel do osobnych metod parsowanie wejścia i sprawdzenie “trójkątności” - przetestuj te metody jednostkowo - wymyśl i zapisz przypadki testowe, zanim napiszesz implementację

 */
package pl.sda.java4.triangles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String input=scan.nextLine();
            int[]nums=new Parser().parseTriple(input);
            boolean isTriangle=new Triangility().isTriangle(nums[0],nums[1],nums[2]);
            if (isTriangle){
                System.out.println("To jest trójkąt");
            }
            else {
                System.out.println("To nie jest trójkąt");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Failed: "+e.getMessage());
        }
    }
}
