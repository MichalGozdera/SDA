package CiekaweZadaniaNaZajeciach.Bank;


public class Konto {
    private String type;
    private double balance=0;
    private int nrkonta;
    private static int id2 = 0;

    public Konto(String type) {

        id2++;
        nrkonta = id2;
        this.type = type;
    }

    public Konto(String type, double balance) {
        id2++;
        nrkonta = id2;
        this.type = type;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Konto o numerze " + nrkonta+ " typu "+type+" o bilansie równym "+balance;

    }
}
