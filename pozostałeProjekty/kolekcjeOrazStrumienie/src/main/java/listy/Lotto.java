package listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        List<Integer>lista=losujLiczby();
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);
    }

    private static List<Integer> losujLiczby() {
        List<Integer>losowanie=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i<6;i++){
           int numerek=random.nextInt(49)+1;
           while (!losowanie.contains(numerek)){
               losowanie.add(numerek);
           }
        }
        return losowanie;
    }
}
