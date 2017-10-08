
package ciekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width* length;
    }

    @Override
    public double getPerimeter() {
        return width*2+ length *2;
    }

    @Override
    public String toString() {
        return "Prostokąt o boku "+width+" i drugim boku "+length+" i o powierzchni "+getArea()+" i obwodzie "+getPerimeter();
    }
}
