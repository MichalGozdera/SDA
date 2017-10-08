package ciekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class Zad3
//3. Napisz funkcję, w której dla zadanego łańcucha znaków, wszystkie znaki - takie same jak pierwsza litera ciągu znaków zostaną zamienione na znak '_', wyjątkiem jednak jest pierwszy znak.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst do przerobienia");
        String napis = s.nextLine();
        Zad3 zadanie = new Zad3();
        zadanie.toUnderscore(napis);
    }

    public void toUnderscore(String napis) {
        StringBuilder napis1 = new StringBuilder(napis.toLowerCase()); //zamieniamy napis na Stringbuilder, by nie tworzyć stringów bez potrzeby.
        //w celu uniknięcia kwestii wielkości liter, zamieniam całość na małe litery.
        for (int i = 0; i < napis1.length(); i++) //iterujemy po całym napisie wg znaków
        {
            for (int j = i+1; j < napis1.length(); j++) //iterujemy po reszcie napisu zaczynając od następnego znaku po wczytaniu danej litery.
                // Istotne by nie zaczynać od początku napisu po raz kolejny. Po co program ma wykrywać ten sam znak stojący na tym samym miejscu?
            {
                if (napis1.substring(i, i + 1).equals(napis1.substring(j, j + 1)))
                {
                    napis1.replace(j, j + 1, "_"); //zamieniamy powtarzające się literki na znaki _

                }

            }
        }
        System.out.println(napis1.toString());
    }

}
