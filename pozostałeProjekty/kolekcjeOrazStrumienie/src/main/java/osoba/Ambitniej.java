package osoba;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ambitniej {
    public static void main(String[] args) {
        String sciezkaDoPliku = "D:/coding/projekty/temp/zajecia30wrzesnia/baza.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        List<Osoba> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);
        System.out.println("=================ilość mężczyzn i kobiet==================");
        Map<String,Long>gendery=osoby.stream().map(osoba -> {
            if (osoba.getPlec().equals(Plec.KOBIETA))
                return "kobieta";
            else
                return "mezczyzna";
        }).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(gendery);
        System.out.println("=================Osoby z nazwiskami na literki==================");
        Map<Character,List<Osoba>>nazwiska=osoby.stream().collect(Collectors.groupingBy(o -> o.getNazwisko().charAt(0)));
      //  System.out.println(nazwiska);
        for (Character c:nazwiska.keySet())
        {
            System.out.println("==============nazwiska na literę "+c+"===================");
            for (Osoba osoba:nazwiska.get(c)){
                System.out.println(osoba);
            }
        }
        Map<Character,Long>nazwiskaWyliczone=osoby.stream().collect(Collectors.groupingBy(o -> o.getNazwisko().charAt(0),Collectors.counting()));
        System.out.println(nazwiskaWyliczone);
        Map<String,List<Osoba>>miasteczka=osoby.stream().collect(Collectors.groupingBy(o -> o.getMiasto()));
        for (String c:miasteczka.keySet())
        {
            System.out.println("==============mieszkańcy "+c+"===================");
            for (Osoba osoba:miasteczka.get(c)){
                System.out.println(osoba);
            }
        }
        Map<String,Long>miasteczkaWyliczone=osoby.stream().collect(Collectors.groupingBy(o -> o.getMiasto(),Collectors.counting()));
        System.out.println(miasteczkaWyliczone);


    }
    private static void wyswietlListe(List<Osoba> lista) {
        for (Osoba persona : lista) {
            System.out.println(persona);
        }
    }

//    private static void wyswietlMape(Map<String,Long> mapka){
//        for (Map.Entry entry:mapka)
//            System.out.println(entry.getKey()+"\t"+entry.getValue());
//    }

}