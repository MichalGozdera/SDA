package CiekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;

public class Run {
    public static void main(String[] args) {
//Cylinder walec = new Cylinder();
//        System.out.println(walec.getVolume());
//        System.out.println(walec.toString());
//        Cylinder walec1=new Cylinder(2,"¿ó³ty",2137);
//        System.out.println(walec1.getVolume());
//        System.out.println(walec1.toString());

        Circle kolko1=new Circle(1,"¿ó³ty",true);
        System.out.println(kolko1.getArea());
        System.out.println(kolko1.getPerimeter());
        System.out.println(kolko1);
        Rectangle prostokat1=new Rectangle(21,37);
        System.out.println(prostokat1);
        Square kwadrat1=new Square(32);
        System.out.println(kwadrat1);
        Wiatr irma=new Wiatr(15);
        System.out.println(irma.mph());
        System.out.println(irma.wezel());
        System.out.println(irma.sila());
        System.out.println(irma.Beaufort());

    }
}
