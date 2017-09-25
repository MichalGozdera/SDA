package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;

import java.util.Scanner;

public class Tablica {
    static Tablica tab1=new Tablica();
    public static void main(String[] args) {

    }
        public int[][]wczytaj(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ile wierszy ma mieæ tablica?");
        int rows = s.nextInt();
        System.out.println("Ile kolumn ma mieæ tablica?");
        int columns = s.nextInt();
        int[][]tab=new int[rows][columns];

        for (int i=0;i<tab.length;i++)
        {
            for (int j=0;j<tab[i].length;j++)
            {
                System.out.println("Wczytaj element znajduj¹cy siê w "+ (i+1)+" wierszu i "+(j+1)+" kolumnie");
                tab[i][j]=s.nextInt();
            }
        }
            System.out.println("Tablica wygl¹da tak:");
            for (int i=0;i<tab.length;i++)
            {
                for (int j=0;j<tab[i].length;j++)
                {
                    System.out.print(tab[i][j]+"\t");
                }
                System.out.println();
            }

return tab;
    }
}
