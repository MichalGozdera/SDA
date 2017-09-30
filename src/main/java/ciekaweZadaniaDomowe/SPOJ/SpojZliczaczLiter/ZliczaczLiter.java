/*
JZLICZ - Zliczacz liter
Ko�o M�odych Mi�o�nik�w �amania Szyfr�w pracuje nad odszyfrowaniem pewnego staro�ytnego manuskryptu. J�drem systemu ma by� samoucz�cy si� analizator tekstu, a jego pierwszym modu�em ma by� "zliczacz liter", kt�rego opracowanie powierzono Tobie.

Opracuj program ZLI, kt�ry:
- wczyta ze standardowego wej�cia tekst do analizy,
- dla ka�dej litery obliczy liczb� jej wyst�pie� w tek�cie,
- wypisze wynik na standardowe wyj�cie.

Wej�cie
W pierwszym wierszu N - liczba wierszy tekstu do analizy (N ? 150). W ka�dym z nast�puj�cych N wierszy ci�g z�o�ony z maksymalnie 200 znak�w spo�r�d ma�ych i wielkich liter alfabetu �aci�skiego ('a'..'z', 'A'..'Z') oraz spacji.

Wyj�cie
W kolejnych wierszach litery od 'a' do 'z' i od 'A' do 'Z' w tej kolejno�ci, a po ka�dej literze spacja i liczba wskazuj�ca, ile razy ta litera wyst�pi�a w tek�cie.

Uwaga: Pomi� litery, kt�re nie wyst�puj� w tek�cie.

Przyk�ad
Wej�cie:
2
ala ma kota
Ola ma psa

Wyj�cie:
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
