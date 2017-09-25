public class CwiczenieIf {


    public static void main(String[] args) {
        //deklaracja zmiennych
        double x = 5.0;
        int y = 10;
        int z = 15;

        //1. Napisz warunek sprawdzaj�cy, czy x jest wi�ksze od y.
        if (x > y) {
            System.out.println(x + " jest wi�ksze od " + y);
        }
        //2. Napisz warunek sprawdzaj�cy, czy podwojona warto�� x jest r�wna y.
        if (x * 2 == y) {
            System.out.println(2 * x + " jest r�wne " + y);
        }
        //3. Napisz warunek sprawdzaj�cy, czy suma x oraz y r�wna si� z.
        if ((x + y) == z) {
            System.out.println((x + y) + " jest r�wne " + z);
        }
        //4. Napisz warunek sprawdzaj�cy, czy r�nica z oraz y r�wna jest x.
        if (z - y == x) {
            System.out.println((z - y) + " jest r�wne " + x);
        }
        //5. Sprawd�, czy negacja warunku: potrojonej warto�ci x r�wnej z + 1 zwraca prawd� czy fa�sz?
        if (!(3 * x == z + 1)) {
            System.out.println(!(3 * x == z + 1));
        }
        //6. Jaki wynik (prawd� lub fa�sz) zwr�ci r�nica liczb z, y, x? Fa�sz reprezentowany jest przez jak� liczb�?

        //7. Sprawd�, czy liczba x jest sta�o- czy zmiennoprzecinkowa?
        if (x == (int) x) {
            System.out.println(x + " jest sta�oprzecinkowa");
        } else {
            System.out.println(x + " jest zmiennoprzecinkowa");
        }
        //7 wersja druga

        Object o=x;
        System.out.println();
        if (o.getClass().getSimpleName().equals("Double")||o.getClass().getSimpleName().equals("Float")) {
            System.out.println(x + " jest zmiennoprzecinkowa");
    } else {
            System.out.println(x + " jest sta�oprzecinkowa");
        }
        //8. Napisz warunek sprawdzaj�cy czy iloczyn x jest wi�kszy od ilorazu z oraz x powi�kszonego o 1.
        if (x * z > z / x + 1) {
            System.out.println("iloczyn " + x + " jest wi�kszy od ilorazu " + z + " oraz " + x + " powi�kszonego o 1 ");
        }
        //9. Sprawd�, czy kwadrat liczby y r�wny jest r�wny sumie iloczynu x oraz y i kwadratu liczby x.
        if (y * y == x * y + x * x) {
            System.out.println("kwadrat liczby " + y + " r�wny jest r�wny sumie iloczynu " + x + " oraz " + y + "i kwadratu liczby " + x);
        }

    }
}
