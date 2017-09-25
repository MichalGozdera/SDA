package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad3
//3. Napisz funkcjê, w której dla zadanego ³añcucha znaków, wszystkie znaki - takie same jak pierwsza litera ci¹gu znaków zostan¹ zamienione na znak '_', wyj¹tkiem jednak jest pierwszy znak.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst do przerobienia");
        String napis = s.nextLine();
        zad3 zadanie = new zad3();
        zadanie.toUnderscore(napis);
    }

    public void toUnderscore(String napis) {
        StringBuilder napis1 = new StringBuilder(napis.toLowerCase()); //zamieniamy napis na Stringbuilder, by nie tworzyæ stringów bez potrzeby.
        //w celu unikniêcia kwestii wielkoœci liter, zamieniam ca³oœæ na ma³e litery.
        for (int i = 0; i < napis1.length(); i++) //iterujemy po ca³ym napisie wg znaków
        {
            for (int j = i+1; j < napis1.length(); j++) //iterujemy po reszcie napisu zaczynaj¹c od nastêpnego znaku po wczytaniu danej litery.
                // Istotne by nie zaczynaæ od pocz¹tku napisu po raz kolejny. Po co program ma wykrywaæ ten sam znak stoj¹cy na tym samym miejscu?
            {
                if (napis1.substring(i, i + 1).equals(napis1.substring(j, j + 1)))
                {
                    napis1.replace(j, j + 1, "_"); //zamieniamy powtarzaj¹ce siê literki na znaki _

                }

            }
        }
        System.out.println(napis1.toString());
    }

}
