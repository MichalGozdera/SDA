package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad12
//12. Napisz funkcj�, kt�ra przet�umaczy wybran� liczb� ca�kowit� z zakresu <0-999>, na jej odpowiednik s�ownie np. 123 -> sto dwadzie�cia trzy.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj liczb� z zakresu <0-999>");
        int liczba = s.nextInt();
        while (liczba < 0 || liczba > 999) {
            System.out.println("Wczytaj liczb� z zakresu <0-999>");
            liczba = s.nextInt();
        }
        if (liczba==0)
            System.out.println("zero");
        int setki = liczba / 100;
        switch (setki)
        {
            case 1:
                System.out.print("sto ");
                liczba -= setki * 100;
                break;
            case 2:
                System.out.print("dwie�cie ");
                liczba -= setki * 100;
                break;
            case 3:
                System.out.print("trzysta ");
                liczba -= setki * 100;
                break;
            case 4:
                System.out.print("czterysta ");
                liczba -= setki * 100;
                break;
            case 5:
                System.out.print("pi��set ");
                liczba -= setki * 100;
                break;
            case 6:
                System.out.print("sze��set ");
                liczba -= setki * 100;
                break;
            case 7:
                System.out.print("siedemset ");
                liczba -= setki * 100;
                break;
            case 8:
                System.out.print("osiemset ");
                liczba -= setki * 100;
                break;
            case 9:
                System.out.print("dziewi��set ");
                liczba -= setki * 100;
                break;

        }
        if (liczba>9&&liczba<20) {
            switch (liczba)
            {
                case 10:
                    System.out.print("dziesi��");
                    break;
                case 11:
                    System.out.print("jedena�cie");
                    break;
                case 12:
                    System.out.print("dwana�cie");
                    break;
                case 13:
                    System.out.print("trzyna�cie");
                    break;
                case 14:
                    System.out.print("czterna�cie");
                    break;
                case 15:
                    System.out.print("pi�tna�cie");
                    break;
                case 16:
                    System.out.print("szesna�cie");
                    break;
                case 17:
                    System.out.print("siedemna�cie");
                    break;
                case 18:
                    System.out.print("osiemna�cie");
                    break;
                case 19:
                    System.out.print("dziewi�tna�cie");
                    break;
            }
        }
        else
            {
            int dziesi�tki=liczba/10;

            switch (dziesi�tki)
            {
                case 2:
                    System.out.print("dwadzie�cia ");
                    liczba-=dziesi�tki*10;
                    break;
                case 3:
                    System.out.print ("trzydzie�ci ");
                    liczba-=dziesi�tki*10;
                    break;
                case 4:
                    System.out.print ("czterdzie�ci ");
                    liczba-=dziesi�tki*10;
                    break;
                case 5:
                    System.out.print("pi��dziesi�t ");
                    liczba-=dziesi�tki*10;
                    break;
                case 6:
                    System.out.print("sze��dziesi�t ");
                    liczba-=dziesi�tki*10;
                    break;
                case 7:
                    System.out.print("siedemdziesi�t ");
                    liczba-=dziesi�tki*10;
                    break;
                case 8:
                    System.out.print("osiemdziesi�t ");
                    liczba-=dziesi�tki*10;
                    break;
                case 9:
                    System.out.print("dziewi��dziesi�t ");
                    liczba-=dziesi�tki*10;
                    break;
            }
        }
switch (liczba) {
    case 1:
        System.out.print("jeden");
        break;
    case 2:
        System.out.print("dwa");
        break;
    case 3:
        System.out.print("trzy");
        break;
    case 4:
        System.out.print("cztery");
        break;
    case 5:
        System.out.print("pi��");
        break;
    case 6:
        System.out.print("sze��");
        break;
    case 7:
        System.out.print("siedem");
        break;
    case 8:
        System.out.print("osiem");
        break;
    case 9:
        System.out.print("dziewi��");
        break;
}
    }


}
