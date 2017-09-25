package CiekaweZadaniaDomowe.cwiczeniaPodstawyObiektowosci;

public class Wiatr {
    private double speed;

    public Wiatr(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double mph (){
        return speed*0.621371192;
    }
    public double wezel (){
        return speed/1.852;
    }
    public String sila () {
        if (speed < 2)
            return "Lekki wiater";
        if (speed>120)
            return "Huragan";
        return "";
    }
    public int Beaufort(){
        double wykladnik=(double)2/3;
        double result=Math.pow(speed/3.01,wykladnik)+0.5;
        if (result>12)
            return 12;
        return (int)result;
    }
}
