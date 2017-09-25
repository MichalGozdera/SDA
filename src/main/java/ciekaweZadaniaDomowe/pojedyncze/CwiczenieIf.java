public class CwiczenieIf {


    public static void main(String[] args) {
        //deklaracja zmiennych
        double x = 5.0;
        int y = 10;
        int z = 15;

        //1. Napisz warunek sprawdzaj¹cy, czy x jest wiêksze od y.
        if (x > y) {
            System.out.println(x + " jest wiêksze od " + y);
        }
        //2. Napisz warunek sprawdzaj¹cy, czy podwojona wartoœæ x jest równa y.
        if (x * 2 == y) {
            System.out.println(2 * x + " jest równe " + y);
        }
        //3. Napisz warunek sprawdzaj¹cy, czy suma x oraz y równa siê z.
        if ((x + y) == z) {
            System.out.println((x + y) + " jest równe " + z);
        }
        //4. Napisz warunek sprawdzaj¹cy, czy ró¿nica z oraz y równa jest x.
        if (z - y == x) {
            System.out.println((z - y) + " jest równe " + x);
        }
        //5. SprawdŸ, czy negacja warunku: potrojonej wartoœci x równej z + 1 zwraca prawdê czy fa³sz?
        if (!(3 * x == z + 1)) {
            System.out.println(!(3 * x == z + 1));
        }
        //6. Jaki wynik (prawdê lub fa³sz) zwróci ró¿nica liczb z, y, x? Fa³sz reprezentowany jest przez jak¹ liczbê?

        //7. SprawdŸ, czy liczba x jest sta³o- czy zmiennoprzecinkowa?
        if (x == (int) x) {
            System.out.println(x + " jest sta³oprzecinkowa");
        } else {
            System.out.println(x + " jest zmiennoprzecinkowa");
        }
        //7 wersja druga

        Object o=x;
        System.out.println();
        if (o.getClass().getSimpleName().equals("Double")||o.getClass().getSimpleName().equals("Float")) {
            System.out.println(x + " jest zmiennoprzecinkowa");
    } else {
            System.out.println(x + " jest sta³oprzecinkowa");
        }
        //8. Napisz warunek sprawdzaj¹cy czy iloczyn x jest wiêkszy od ilorazu z oraz x powiêkszonego o 1.
        if (x * z > z / x + 1) {
            System.out.println("iloczyn " + x + " jest wiêkszy od ilorazu " + z + " oraz " + x + " powiêkszonego o 1 ");
        }
        //9. SprawdŸ, czy kwadrat liczby y równy jest równy sumie iloczynu x oraz y i kwadratu liczby x.
        if (y * y == x * y + x * x) {
            System.out.println("kwadrat liczby " + y + " równy jest równy sumie iloczynu " + x + " oraz " + y + "i kwadratu liczby " + x);
        }

    }
}
