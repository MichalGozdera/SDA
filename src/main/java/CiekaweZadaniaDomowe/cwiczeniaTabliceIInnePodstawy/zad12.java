package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad12
//12. Napisz funkcjê, która przet³umaczy wybran¹ liczbê ca³kowit¹ z zakresu <0-999>, na jej odpowiednik s³ownie np. 123 -> sto dwadzieœcia trzy.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj liczbê z zakresu <0-999>");
        int liczba = s.nextInt();
        while (liczba < 0 || liczba > 999) {
            System.out.println("Wczytaj liczbê z zakresu <0-999>");
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
                System.out.print("dwieœcie ");
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
                System.out.print("piêæset ");
                liczba -= setki * 100;
                break;
            case 6:
                System.out.print("szeœæset ");
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
                System.out.print("dziewiêæset ");
                liczba -= setki * 100;
                break;

        }
        if (liczba>9&&liczba<20) {
            switch (liczba)
            {
                case 10:
                    System.out.print("dziesiêæ");
                    break;
                case 11:
                    System.out.print("jedenaœcie");
                    break;
                case 12:
                    System.out.print("dwanaœcie");
                    break;
                case 13:
                    System.out.print("trzynaœcie");
                    break;
                case 14:
                    System.out.print("czternaœcie");
                    break;
                case 15:
                    System.out.print("piêtnaœcie");
                    break;
                case 16:
                    System.out.print("szesnaœcie");
                    break;
                case 17:
                    System.out.print("siedemnaœcie");
                    break;
                case 18:
                    System.out.print("osiemnaœcie");
                    break;
                case 19:
                    System.out.print("dziewiêtnaœcie");
                    break;
            }
        }
        else
            {
            int dziesi¹tki=liczba/10;

            switch (dziesi¹tki)
            {
                case 2:
                    System.out.print("dwadzieœcia ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 3:
                    System.out.print ("trzydzieœci ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 4:
                    System.out.print ("czterdzieœci ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 5:
                    System.out.print("piêædziesi¹t ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 6:
                    System.out.print("szeœædziesi¹t ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 7:
                    System.out.print("siedemdziesi¹t ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 8:
                    System.out.print("osiemdziesi¹t ");
                    liczba-=dziesi¹tki*10;
                    break;
                case 9:
                    System.out.print("dziewiêædziesi¹t ");
                    liczba-=dziesi¹tki*10;
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
        System.out.print("piêæ");
        break;
    case 6:
        System.out.print("szeœæ");
        break;
    case 7:
        System.out.print("siedem");
        break;
    case 8:
        System.out.print("osiem");
        break;
    case 9:
        System.out.print("dziewiêæ");
        break;
}
    }


}
