public class CwiczenieIf {


    public static void main(String[] args) {
        //deklaracja zmiennych
        double x = 5.0;
        int y = 10;
        int z = 15;

        //1. Napisz warunek sprawdzający, czy x jest większe od y.
        if (x > y) {
            System.out.println(x + " jest większe od " + y);
        }
        //2. Napisz warunek sprawdzający, czy podwojona wartość x jest równa y.
        if (x * 2 == y) {
            System.out.println(2 * x + " jest równe " + y);
        }
        //3. Napisz warunek sprawdzający, czy suma x oraz y równa się z.
        if ((x + y) == z) {
            System.out.println((x + y) + " jest równe " + z);
        }
        //4. Napisz warunek sprawdzający, czy różnica z oraz y równa jest x.
        if (z - y == x) {
            System.out.println((z - y) + " jest równe " + x);
        }
        //5. Sprawdź, czy negacja warunku: potrojonej wartości x równej z + 1 zwraca prawdę czy fałsz?
        if (!(3 * x == z + 1)) {
            System.out.println(!(3 * x == z + 1));
        }
        //6. Jaki wynik (prawdę lub fałsz) zwróci różnica liczb z, y, x? Fałsz reprezentowany jest przez jaką liczbę?

        //7. Sprawdź, czy liczba x jest stało- czy zmiennoprzecinkowa?
        if (x == (int) x) {
            System.out.println(x + " jest stałoprzecinkowa");
        } else {
            System.out.println(x + " jest zmiennoprzecinkowa");
        }
        //7 wersja druga

        Object o=x;
        System.out.println();
        if (o.getClass().getSimpleName().equals("Double")||o.getClass().getSimpleName().equals("Float")) {
            System.out.println(x + " jest zmiennoprzecinkowa");
    } else {
            System.out.println(x + " jest stałoprzecinkowa");
        }
        //8. Napisz warunek sprawdzający czy iloczyn x jest większy od ilorazu z oraz x powiększonego o 1.
        if (x * z > z / x + 1) {
            System.out.println("iloczyn " + x + " jest większy od ilorazu " + z + " oraz " + x + " powiększonego o 1 ");
        }
        //9. Sprawdź, czy kwadrat liczby y równy jest równy sumie iloczynu x oraz y i kwadratu liczby x.
        if (y * y == x * y + x * x) {
            System.out.println("kwadrat liczby " + y + " równy jest równy sumie iloczynu " + x + " oraz " + y + "i kwadratu liczby " + x);
        }

    }
}
