package streamy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SitoLambda {
    public static void main(String[] args) throws RuntimeException {
         List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < 200000; i++) {
            lista.add(i + 1);
        }
        long czas=System.currentTimeMillis();
        try {
            lista.stream().forEach(numer -> {
                if (numer>Math.sqrt(Collections.max(lista))){
                    throw new RuntimeException();
                }
                List<Integer>zlozone = lista.stream().filter(element -> element % numer != 0 || element == numer).collect(Collectors.toList());
                lista.clear();
                lista.addAll(zlozone);

            });
        } catch (RuntimeException e) {
            System.out.println(lista);
            System.out.println(System.currentTimeMillis()-czas);
        }


    }
}
