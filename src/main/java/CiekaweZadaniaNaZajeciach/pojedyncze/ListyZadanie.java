package CiekaweZadaniaNaZajeciach.pojedyncze;

/**
 * operacje na listach (po ka�dym punkcie wy�wietlamy)
 wype�niamy list� kolejnymi warto�ciami od 1 do 10
 co trzeci� liczb� zwi�kszamy o warto�� jej poprzednika
 ka�d� liczb� parzyst� dzielimy przez 2
 sumujemy wszystkie liczby z listy
 Znajdujemy najwi�kszy i najmniejszy element listy

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
        System.out.println("Suma element�w listy1 wynosi: "+sumaElement�w(lista1));
        System.out.println("Suma element�w listy losowej wynosi: "+sumaElement�w(listaLosowa));
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
    private static int sumaElement�w (List<Integer>list){
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
