package ciekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;


public class Square extends Rectangle {
    Square(){}
    Square (double side){
        super(side,side);
    }
    Square (double side, String color, boolean filled){
        super(side, side, color,filled);
    }
    public double getSide(){
       return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Kfadrat o boku "+getSide()+" i o powierzchni "+getArea()+" i obwodzie "+getPerimeter();
    }
}
