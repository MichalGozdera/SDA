import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List lista1 = nowaLista(1);
        odwroc(lista1);
        System.out.println(mieszaj(lista1));
        List lista2 = nowaLista(2);
        System.out.println("Wszystkie elementy listy 1 znajdują się na liście 2 " +takieSame(lista1, lista2));



/*      //1) napisz program, który odwróci ArrayList - przykład: [0, 5, 9, 1, 2], wynik: [2, 1, 9, 5, 0]
        Collections.reverse(lista);
        System.out.println("Odwrócona lista to " + lista);
        //2) napisz program, który pomiesza elementy na ArrayList - przykład: [0, 6, 2, 4, 9, 7], wynik(losowa kolejność liczb, za każdym razem wynik powinien być inny): [2, 0, 7, 9, 6, 4]
        Collections.shuffle(lista);
        System.out.println(lista);
        System.out.println("Pomieszana lista to " + lista);
        //3) napisz program, który sprawdzi czy dwie ArrayListy posiadają takie same wartości - listy mogą być różnej długości
        List<Integer> lista2 = new ArrayList<Integer>(); //inicjalizacja kolejnej listy
        losowy = r.nextInt(10);
        for (int i = 0; i < losowy; i++) {
            System.out.println("Wczytaj kolejny element listy 2");
            lista2.add(s.nextInt());
        }
        if (lista.containsAll(lista2) || lista2.containsAll(lista))
            System.out.println("Listy posiadają takie same wartości");
        else
            System.out.println("Listy nie mają takich samych wartości");*/
    }

    //1) napisz program, który odwróci ArrayList - przykład: [0, 5, 9, 1, 2], wynik: [2, 1, 9, 5, 0]
    public static <T> void odwroc(List<T> listaa) {
        for (int j = 0; j < listaa.size() / 2; j++) {
            T o = listaa.get(j);
            listaa.set(j, listaa.get(listaa.size() - 1 - j));
            listaa.set(listaa.size() - 1 - j, o);
        }
        System.out.println("Odwrocona lista to " + listaa);
    }

    /*2) napisz program, który pomiesza elementy na ArrayList - przykład: [0, 6, 2, 4, 9, 7], wynik(losowa kolejność liczb, za każdym razem wynik powinien być inny): [2, 0, 7, 9, 6, 4]*/
    public static <T> List<T> mieszaj(List<T> listab) {
        Random r = new Random();
        for (int j = 0; j < listab.size(); j++) {
            int losowy1 = r.nextInt(listab.size());
            int losowy2 = r.nextInt(listab.size());
            int temp = 0;
            T o = listab.get(losowy1);
            listab.set(losowy1, listab.get(losowy2));
            listab.set(losowy2, o);
        }
        System.out.print("Pomieszana lista to ");
        return listab;
    }

    public static List<Integer> nowaLista(int numerListy) {
        Scanner s = new Scanner(System.in); //do Wczytania danych
        Random r =new Random();
        Integer losowy = r.nextInt(10);
        List<Integer> lista = new ArrayList<>(); //inicjalizacja listy
        for (int i = 0; i < losowy; i++)

        {
            System.out.println("Wczytaj " + (i + 1) + " element listy " + numerListy);
            lista.add(s.nextInt());
        }
        return lista;
    }
    //3) napisz program, który sprawdzi czy dwie ArrayListy posiadają takie same wartości - listy mogą być różnej długości

    public static boolean takieSame(List<?> listaA, List<?> listaB)  //Metoda sprawdza czy wszystkie wartości z listy A znajdują się na liście B
    {
        boolean cyngiel=false;
        for (Object o : listaA) {
            cyngiel = false;
            for (int i = 0; i < listaB.size(); i++) {
                if (o.equals(listaB.get(i))) {
                    cyngiel = true;
                    break;
                }
            }
            if (cyngiel==false)
            return cyngiel;
        }
        return cyngiel;
    }

}