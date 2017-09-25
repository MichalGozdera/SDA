package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;

public class zad11
//11. Napisz zadanie które wyświetla wszystkie liczby pierwsze z zakresu od 1 do 100.
{
    public static void main(String[] args) {
        for (int i=2;i<=100;i++) {
            boolean prime=true;
            for (int j = 2; j <= 50; j++)
            {
                if (i%j==0&&i!=j)
                    prime=false;
                    continue;
            }
            if (prime==true)
            System.out.println(i);
        }
    }
}
