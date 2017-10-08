package CiekaweZadaniaNaZajeciach.Bank;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private String name;
    private int id;
    private static int id2 = 0;
    private List<Konto> konta = new ArrayList<>();

    public Client() {
        id2++;
        this.id = id2;
    }

    public Client(String name) {
        this.name = name;
        id2++;
        this.id = id2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static int getId2() {
        return id2;
    }

    public boolean isKonto(String typ) {
        for (Konto konto : konta) {
            if (konto.getType().equals(typ)) {
                return true;
            }
        }
        return false;
    }

    public void noweKonto() {
        Scanner s = new Scanner(System.in);
        System.out.println("Zakładamy konto na lokaty czy na pożyczki?\n 1 - lokaty\n 2 - pożyczki");
        String typ = " ";
        switch (s.nextInt()) {
            case 1:
                typ = "saving";
                break;
            case 2:
                typ = "checking";
                break;
        }
        if (isKonto(typ)) {
            System.out.println("Masz już konto typu " + typ);
            System.out.println("Wybierz inną opcję");
            return;
        } else {
            if (typ.equals("saving")) {
                System.out.println("Ile wpłacasz na początek");
            } else if (typ.equals("checking")) {
                System.out.println("Ile chcesz pożyczyć");
            }
            double poczatkowyStan = s.nextDouble();
            if (typ.equals("checking"))
                poczatkowyStan = 0 - poczatkowyStan;
            Konto konto = new Konto(typ, poczatkowyStan);
            konta.add(konto);
            return;
        }
    }

    public List<Konto> getKonta() {

        return konta;

    }
public Konto lastKonto(){
        return konta.get(konta.size()-1);
}

    @Override

    public String toString() {
        return "Klient o numerze" + id + " o imieniu " + name;
    }


}
