package streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SitoLambda2 {
    public static void main(String[] args) throws RuntimeException {
         List<Integer> listaa = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            listaa.add(i + 1);
        }
        long czas=System.currentTimeMillis();

        final List<Integer>lista=new ArrayList<>(listaa);
          listaa.stream().forEach(numer->{
              List<Integer>zlozone = lista.stream().filter(element -> element % numer != 0 || element == numer).collect(Collectors.toList());
              lista.clear();
              lista.addAll(zlozone);
//             // System.out.println(lista);
          });

        System.out.println(lista);
    }
}
