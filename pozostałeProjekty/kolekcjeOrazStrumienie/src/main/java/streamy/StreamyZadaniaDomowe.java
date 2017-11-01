package streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamyZadaniaDomowe {
    public static void main(String[] args) {
        List <String> filmy=new ArrayList<>();
        filmy.add("Gwiezdne Wojny");
        filmy.add("Blade Runner");
        filmy.add("Pan Tadeusz");
        filmy.add("Incepcja");
        filmy.add("Ojciec Chrzestny");
        filmy.add("Botoks");
        filmy.add("Kiler");
        filmy.add("Kilerów dwóch");
        filmy.add("Seksmisja");
        filmy.add("Miś");
        filmy.add("Pulp Fiction");
        filmy.add("Man Behind The Sun");
        filmy.add("Upadek");
        filmy.add("Lecą Żurawie");
        filmy.add("Smoleńsk");
        filmy.add("Titanic");
        filmy.add("Ziemia Obiecana");
        filmy.add("Pingwiny z Madagaskaru");
        filmy.add("Król Lew");
        filmy.add("Amadeusz");
        List<String>filmynaA=filmy.stream().filter(film->film.charAt(0)==65).collect(Collectors.toList());
        System.out.println(filmynaA);
        List<String>  filmy2Czlonowwe=filmy.stream().filter(film->{
            if (film.length()-film.replace(" ","").length()==1)
                return true;
            else
                return false;
//            if (film.lastIndexOf(32)==film.indexOf(32)&&film.indexOf(32)!=-1)
//                return true;
//            else
//                return false;
        }).collect(Collectors.toList());

        System.out.println(filmy2Czlonowwe);
        List<String>tytulyWiecejNiz5Znakow=filmy.stream().filter(film->film.length()>5).collect(Collectors.toList());
        System.out.println(tytulyWiecejNiz5Znakow);
        String filmMax=filmy.stream().max((String film1, String film2)->{
            if(film1.length()>film2.length())
                return 1;
            else if (film1.length()==film2.length())
                return 0;
            else
                return -1;
        }).get();
        System.out.println(filmMax);
        Map<Integer,Long>dlugosc=filmy.stream().collect(Collectors.groupingBy(film->film.length()-film.replace(" ","").length()+1,Collectors.counting()));
        dlugosc.entrySet().stream().forEach(spacje-> System.out.println("Liczba filmów o długości "+spacje.getKey()+" wyrazów wynosi "+spacje.getValue()));


    }
}
