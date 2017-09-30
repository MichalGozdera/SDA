/*
JZLICZ - Zliczacz liter
Ko³o M³odych Mi³oœników £amania Szyfrów pracuje nad odszyfrowaniem pewnego staro¿ytnego manuskryptu. J¹drem systemu ma byæ samoucz¹cy siê analizator tekstu, a jego pierwszym modu³em ma byæ "zliczacz liter", którego opracowanie powierzono Tobie.

Opracuj program ZLI, który:
- wczyta ze standardowego wejœcia tekst do analizy,
- dla ka¿dej litery obliczy liczbê jej wyst¹pieñ w tekœcie,
- wypisze wynik na standardowe wyjœcie.

Wejœcie
W pierwszym wierszu N - liczba wierszy tekstu do analizy (N ? 150). W ka¿dym z nastêpuj¹cych N wierszy ci¹g z³o¿ony z maksymalnie 200 znaków spoœród ma³ych i wielkich liter alfabetu ³aciñskiego ('a'..'z', 'A'..'Z') oraz spacji.

Wyjœcie
W kolejnych wierszach litery od 'a' do 'z' i od 'A' do 'Z' w tej kolejnoœci, a po ka¿dej literze spacja i liczba wskazuj¹ca, ile razy ta litera wyst¹pi³a w tekœcie.

Uwaga: Pomiñ litery, które nie wystêpuj¹ w tekœcie.

Przyk³ad
Wejœcie:
2
ala ma kota
Ola ma psa

Wyjœcie:
a 7
k 1
l 2
m 2
o 1
p 1
s 1
t 1
O 1
 */
import java.util.*;

public class ZliczaczLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wierszy dano do analizy");
        int liczbaWierszy = scanner.nextInt();
        scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < liczbaWierszy; i++) {
            String nowaLinia = scanner.nextLine();
            sb.append(nowaLinia);
        }
        String doPrzetowrzenia = sb.toString().replaceAll("\\s", "");
        Map<Character, Integer> litery = new TreeMap<Character, Integer>();
        for (int i = 0; i < doPrzetowrzenia.length(); i++) {
            if (litery.containsKey(doPrzetowrzenia.charAt(i))) {
                litery.put(doPrzetowrzenia.charAt(i), litery.get(doPrzetowrzenia.charAt(i)) + 1);
            } else {
                litery.put(doPrzetowrzenia.charAt(i), 1);
            }
        }
        for (Character c : litery.keySet()) {
            System.out.println(c + " " + litery.get(c));
        }
    }
}
