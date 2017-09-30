package CiekaweZadaniaNaZajeciach.pojedyncze;

/**
 * operacje na listach (po ka¿dym punkcie wyœwietlamy)
 wype³niamy listê kolejnymi wartoœciami od 1 do 10
 co trzeci¹ liczbê zwiêkszamy o wartoœæ jej poprzednika
 ka¿d¹ liczbê parzyst¹ dzielimy przez 2
 sumujemy wszystkie liczby z listy
 Znajdujemy najwiêkszy i najmniejszy element listy

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListyZadanie {
    public static void main(String[] args) {
        List<Integer>lista1=new ArrayList<>();
        wypelnijListe(lista1);
        System.out.println(lista1);
        List<Integer>listaLosowa=new ArrayList<>();
        wypelnijListeLosowo(listaLosowa);
        System.out.println(listaLosowa);
        coTrzeciElementZwiekszamyOWartoscPoprzednika(lista1);
        coTrzeciElementZwiekszamyOWartoscPoprzednika(listaLosowa);
        System.out.println(lista1);
        System.out.println(listaLosowa);
        parzysteDzielimyPrzez2(lista1);
        parzysteDzielimyPrzez2(listaLosowa);
        System.out.println(lista1);
        System.out.println(listaLosowa);
        System.out.println("Suma elementów listy1 wynosi: "+sumaElementów(lista1));
        System.out.println("Suma elementów listy losowej wynosi: "+sumaElementów(listaLosowa));
        System.out.println("Minimalny element listy1 wynosi "+min(lista1));
        System.out.println("Minimalny element listy losowej wynosi "+min(listaLosowa));
        System.out.println("Maksymalny element listy1 wynosi "+max(lista1));
        System.out.println("Maksymalny element listy losowej wynosi "+max(listaLosowa));
    }
    private static void wypelnijListe(List<Integer>lista){
        for (int i=0;i<10;i++){
            lista.add(i+1);
        }
    }
    private static void wypelnijListeLosowo(List<Integer>lista){
        Random random=new Random();
        for (int i=0;i<20;i++){
            lista.add(random.nextInt(200));
        }
    }
    private static void coTrzeciElementZwiekszamyOWartoscPoprzednika (List<Integer>lista){
        for (int i=2;i<lista.size();i+=3){
           lista.set(i,lista.get(i)+lista.get(i-1));
        }
    }
    private static void parzysteDzielimyPrzez2(List<Integer>list){
        for (int i=0;i<list.size();i++){
            if (list.get(i)%2==0){
                list.set(i,list.get(i)/2);
            }
        }
    }
    private static int sumaElementów (List<Integer>list){
        int suma=0;
        for (int liczba:list){
            suma+=liczba;
        }
        return suma;
    }
    private static int min (List<Integer>list){
        int min = list.get(0);
        for (int liczba:list){
            if (liczba<min){
                min=liczba;
            }
        }
        return min;
    }
    private static int max (List<Integer>list){
        int max = list.get(0);
        for (int liczba:list){
            if (liczba>max){
                max=liczba;
            }
        }
        return max;
    }
}
