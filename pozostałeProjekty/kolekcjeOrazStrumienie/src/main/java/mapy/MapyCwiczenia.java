package mapy;

import kolejki.biblioteka.Dodatkowe.Narzedzia;
import kolejki.biblioteka.Kategoria;
import kolejki.biblioteka.Ksiazka;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {
    public static void main(String[] args){
        Map <String, Ksiazka> mapa = new HashMap<>();
        Ksiazka ksiazka1 = Narzedzia.utworzKsiazke("Adam", "Mickiewicza", 330, "Pan Tadeusz", "3231321312", 300, Kategoria.EPOPEJA, 1832);
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam", "Mickiewicza", 330, "Dziady", "5631321312", 300, Kategoria.DRAMAT, 1825);
        mapa.put("1", ksiazka1);
        mapa.put("2", ksiazka2);
        Ksiazka poprzednia = mapa.put("1", ksiazka2);
        Ksiazka poprzedniaPod3 = mapa.put("3",ksiazka1);
        System.out.println(poprzedniaPod3);



//        mapa.remove("1");
        Ksiazka ksiazkaPod1 = mapa.get("1");
        System.out.println(ksiazkaPod1);

        System.out.println("Mapa zawiera klucz 2: " +mapa.containsKey("2") );
        System.out.println("Mapa zawiera klucz 1: " +mapa.containsKey("1") );

        System.out.println(mapa);
        System.out.println(poprzednia);
        System.out.println(poprzedniaPod3);
        for (String key : mapa.keySet()){
            System.out.println(key);
        }
        for (Ksiazka ksiazka : mapa.values()){
            System.out.println(ksiazka);
        }
        for (Map.Entry<String, Ksiazka> entry: mapa.entrySet()){
            System.out.println("Klucz: "+entry.getKey());
            System.out.println("Wartoœæ: "+entry.getValue());
        }
    }
}
