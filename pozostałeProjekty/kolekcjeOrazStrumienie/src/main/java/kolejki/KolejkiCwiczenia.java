package kolejki;

import java.util.*;

public class KolejkiCwiczenia {
    public static void main(String[] args) {
        Queue<Integer> linkedList = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if (o1.equals(o2)){
                   return 0;
               }else if (o1.intValue()>o2.intValue()){
                   return -1;
               }else {
                   return 1;
               }

            }
        });
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt(100);
            linkedList.offer(liczba);
            priorityQueue.offer(liczba);
        }
        System.out.println(linkedList);
        System.out.println(priorityQueue);

        wyswietlKolejke(linkedList);
        wyswietlKolejke(priorityQueue);
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }
    }

    private static void wyswietlKolejke(Queue<Integer> queue) {
        Iterator<Integer> iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("==============");
    }
}
