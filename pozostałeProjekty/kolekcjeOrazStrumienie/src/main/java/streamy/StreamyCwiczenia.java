package streamy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyCwiczenia {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(i + 1);
        }
        List<Integer> podzielnePrzez2 = lista.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());
        List<Integer> podzielnePrzez2PlusLambda = lista.stream().filter(liczba -> liczba % 2 == 0).collect(Collectors.toList());
        List<Integer> podzielnePrzez3iWiekszeOd20 = lista.stream().filter(liczba -> liczba % 3 == 0 && liczba > 20).collect(Collectors.toList());
        System.out.println(podzielnePrzez2);
        System.out.println(podzielnePrzez2PlusLambda);
        System.out.println(podzielnePrzez3iWiekszeOd20);
        List<Integer> wyniki1 = lista.stream().filter(liczba -> {
            if (liczba < 51) {
                return liczba % 2 == 0;
            } else {
                return liczba % 3 == 0;
            }
        }).collect(Collectors.toList());
        System.out.println(wyniki1);
        List<Integer> wyniki2 = lista.stream().filter(liczba -> {
            if (liczba < 20) {
                return liczba % 21 == 0;
            } else if (liczba < 40) {
                return liczba % 6 == 0;
            } else {
                return liczba % 12 == 0;
            }
        }).collect(Collectors.toList());
        System.out.println(wyniki2);
        List<Integer> wieksze3Razy = lista.stream().map(liczba -> liczba * 3).collect(Collectors.toList());
        List<Integer> wyniki4 = lista.stream().map(liczba -> {
            if (liczba < 21) {
                return liczba * 3 + 2;
            } else if (liczba < 41) {
                return liczba * 5 + 50;
            } else {
                return liczba * liczba;
            }
        }).filter(liczba -> liczba % 4 == 0).collect(Collectors.toList());
        System.out.println(wieksze3Razy);
        System.out.println(wyniki4);

        Random random = new Random();
        Integer maxim = lista.stream().mapToInt(Liczba -> Liczba * random.nextInt(100)).max().getAsInt();
        OptionalInt maximWyjatek = lista.stream().mapToInt(Liczba -> Liczba).filter(liczba->liczba>1000).max();
        if (maximWyjatek.isPresent()){
            System.out.println(maximWyjatek.getAsInt());
        }
        else {
            System.out.println("Zbiór jest pusty");
        }
        Double srednia = lista.stream().mapToInt(Liczba -> Liczba).average().getAsDouble();
        System.out.println(maxim);
        System.out.println(srednia);
        List<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista2.add(random.nextInt(100));
        }
        Integer maxim2=lista2.stream().mapToInt(liczba->liczba).max().getAsInt();
        System.out.println(maxim2);
        Optional<Integer> pierwszaPodzielna=lista.stream().map(liczba->liczba*random.nextInt(100)).filter(liczba->liczba%2==0).findFirst();
        if (pierwszaPodzielna.isPresent()){
            System.out.println(pierwszaPodzielna.get());
        }
        else {
            System.out.println("Zbiór jest pusty");
        }
    }
}