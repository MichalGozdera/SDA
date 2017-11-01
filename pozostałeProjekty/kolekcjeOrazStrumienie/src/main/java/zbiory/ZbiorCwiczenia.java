package zbiory;

import kolejki.biblioteka.*;
import kolejki.biblioteka.Dodatkowe.Narzedzia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ZbiorCwiczenia {
    public static void main(String[] args) {
        //PorownywarkaKsiazek porownywarka=new PorownywarkaKsiazek(Kryterium.TYTUL, Porzadek.MALEJACY);
        Set<Ksiazka> hashSet = new HashSet<>();
        Set<Ksiazka> treeSet = new TreeSet<>();

        Ksiazka ksiazka = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Pan Tadeusz", "4354235423", 300, Kategoria.EPOPEJA,1832);
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219, "Dziady", "4354235423", 300, Kategoria.EPOPEJA,1832);
        Ksiazka ksiazka3=Narzedzia.utworzKsiazke("Władysław","Gomułka",112,"Artykuły i Przemówienia","19561968", 300,Kategoria.POLITYKA,1956);
        Ksiazka ksiazka4 =Narzedzia.utworzKsiazke("Adolf","Hitler",140,"Moja Walka","14888814", 200,Kategoria.BAJKA,1923);
        Ksiazka ksiazka5 =Narzedzia.utworzKsiazke("Ayn","Rand",112,"Źródło","1943435432", 800,Kategoria.PROZA,1943);
        Ksiazka ksiazka6 =Narzedzia.utworzKsiazke("Ludwig","von Mises",134,"Ludzkie Działanie","3442423422", 750,Kategoria.POLITYKA,1949);


        hashSet.add(ksiazka);
        treeSet.add(ksiazka);
        hashSet.add(ksiazka2);
        treeSet.add(ksiazka2);
        hashSet.add(ksiazka3);
        treeSet.add(ksiazka3);
        hashSet.add(ksiazka4);
        treeSet.add(ksiazka4);
        hashSet.add(ksiazka5);
        treeSet.add(ksiazka5);
        hashSet.add(ksiazka6);
        treeSet.add(ksiazka6);
        for (Ksiazka ks:hashSet){
            System.out.println(ks);
        }
        System.out.println("===============================");
        Iterator<Ksiazka>iterator=treeSet.iterator();
        while (iterator.hasNext()){
            Ksiazka ks = iterator.next();
            System.out.println(ks);
        }
//        System.out.println(hashSet);
//        System.out.println(treeSet);
    }
}
