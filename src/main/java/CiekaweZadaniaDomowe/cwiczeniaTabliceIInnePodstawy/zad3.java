package CiekaweZadaniaDomowe.cwiczeniaTabliceIInnePodstawy;


import java.util.Scanner;

public class zad3
//3. Napisz funkcj�, w kt�rej dla zadanego �a�cucha znak�w, wszystkie znaki - takie same jak pierwsza litera ci�gu znak�w zostan� zamienione na znak '_', wyj�tkiem jednak jest pierwszy znak.
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wczytaj tekst do przerobienia");
        String napis = s.nextLine();
        zad3 zadanie = new zad3();
        zadanie.toUnderscore(napis);
    }

    public void toUnderscore(String napis) {
        StringBuilder napis1 = new StringBuilder(napis.toLowerCase()); //zamieniamy napis na Stringbuilder, by nie tworzy� string�w bez potrzeby.
        //w celu unikni�cia kwestii wielko�ci liter, zamieniam ca�o�� na ma�e litery.
        for (int i = 0; i < napis1.length(); i++) //iterujemy po ca�ym napisie wg znak�w
        {
            for (int j = i+1; j < napis1.length(); j++) //iterujemy po reszcie napisu zaczynaj�c od nast�pnego znaku po wczytaniu danej litery.
                // Istotne by nie zaczyna� od pocz�tku napisu po raz kolejny. Po co program ma wykrywa� ten sam znak stoj�cy na tym samym miejscu?
            {
                if (napis1.substring(i, i + 1).equals(napis1.substring(j, j + 1)))
                {
                    napis1.replace(j, j + 1, "_"); //zamieniamy powtarzaj�ce si� literki na znaki _

                }

            }
        }
        System.out.println(napis1.toString());
    }

}
