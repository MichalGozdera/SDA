package listy;

import java.util.*;

public class ListyCwiczenia {
    public static void main(String[] args) {
        tworzenieList();
        dodawanieElementowDoList();
        zamianaMiejscNaLisscie();
        iterowaniePoLiscie();

    }

    private static void iterowaniePoLiscie() {
        List <Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<10;i++){
            int liczba=random.nextInt(200);
            listaLiczb.add(liczba);
        }
        for (int i=0;i<listaLiczb.size();i++){
            System.out.println(String.format("%d elemenet listy wynosi %d",i,listaLiczb.get(i)));
        }
        for (Integer liczba: listaLiczb){
            System.out.println(String.format("Kolejny element listy do: %d",liczba));
        }
        Iterator <Integer> iterator=listaLiczb.iterator();
        while (iterator.hasNext()){
            Integer liczba=iterator.next();
            System.out.println("Wartość pobrana z iteratora: "+liczba);
        }
    }

    private static void zamianaMiejscNaLisscie(){
        List<Integer>listaliczb=new ArrayList<>();
        for (int i=20;i>10;i--){
            listaliczb.add(i);
        }
        System.out.println(listaliczb);
        //Zamieniamy miejscami liczbę 13 i 18
        int liczba13 = listaliczb.get(7);
        int liczba18 = listaliczb.get(2);
        listaliczb.remove(2);
        listaliczb.add(2,liczba13);
        listaliczb.remove(7);
        listaliczb.add(7,liczba18);
        System.out.println(listaliczb);
    }
    private static void dodawanieElementowDoList(){
        List <Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<10;i++){
            int liczba=random.nextInt(200);
            listaLiczb.add(liczba);
        }
        System.out.println(listaLiczb);
        listaLiczb.add(5,500);
        System.out.println(listaLiczb);
        List<Integer>drugaLista=new ArrayList<>();
        for (int i=0; i<10;i++){
            int liczba=random.nextInt(200);
            drugaLista.add(liczba);
        }
        System.out.println("===========================");
        System.out.println(drugaLista);
        drugaLista.addAll(listaLiczb);
        System.out.println("Połączone listy");
        System.out.println(drugaLista);
    }
    private static void tworzenieList(){
        List<Integer>lista1=new ArrayList<>();
        ArrayList<Integer>lista2=new ArrayList<>();
        List lista3=new ArrayList();
        lista1=new LinkedList<>();
    }
}
