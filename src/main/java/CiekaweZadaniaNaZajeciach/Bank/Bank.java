package CiekaweZadaniaNaZajeciach.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    private double balance = 1000000;
    private Map<Integer, Client> klienci = new HashMap<>();
    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nowyKlient() {
        Scanner s = new Scanner(System.in);
        System.out.println("Jak masz na imi�?");
        String imie = s.next();
        for (Client klient : klienci.values()) {
            if (klient.getName().equals(imie)) {
                System.out.println("Masz nast�puj�ce konta: " + klient.getKonta());
                return;
            }
        }
        Client klient = new Client(imie);
        klient.noweKonto();
        balance += klient.lastKonto().getBalance();
        klienci.put(klient.getId(), klient);
        System.out.println(klient + "\n" + klient.getKonta());
    }

    public Client getKlient(int i) {
        return klienci.get(i);
    }

    public void wyswietlKlientow() {
        System.out.println("\n\n");
        for (Client klient : klienci.values()) {
            System.out.println(klient);
            System.out.println(klient.getKonta());
        }
    }

    public void przyjmijLokate(Client klient, double kasa) {

        for (Konto acc : klient.getKonta()) {
            if (acc.getType().equals("saving")) {
                acc.setBalance(acc.getBalance() + kasa);
            }
        }

        setBalance(getBalance() + kasa);
        System.out.println("Klient " + klient + " z�o�y� lokat� o wysoko�ci " + kasa);
    }

    public void udzielPo�yczki(Client klient, double kasa) {

        for (Konto acc : klient.getKonta()) {
            if (acc.getType().equals("checking")) {
                acc.setBalance(acc.getBalance() - kasa);
            }
        }
        setBalance(getBalance() - kasa);
        System.out.println("Klient " + klient + " wzi�� po�yczk� o wysoko�ci " + kasa);

    }

    public void wyjmijLokate(Client klient, double kasa) {

        for (Konto acc : klient.getKonta()) {
            if (acc.getType().equals("saving")) {
                if (acc.getBalance() < kasa) {
                    System.out.println("Nie mo�esz tyle wyj��");
                } else {
                    acc.setBalance(acc.getBalance() - kasa);
                }
            }
        }
        setBalance(getBalance() - kasa);
        System.out.println("Klient " + klient + " zabra� lokat� o wysoko�ci " + kasa);

    }

    public void zwrocPo�yczke(Client klient, double kasa) {
        for (Konto acc : klient.getKonta()) {
            if (acc.getType().equals("checking")) {
                if ((0 - acc.getBalance()) > kasa) {
                    System.out.println("Nie mo�esz zwr�ci� tyle pieni�dzy");
                } else {
                    acc.setBalance(acc.getBalance() + kasa);
                }
            }
        }
        setBalance(getBalance() + kasa);
        System.out.println("Klient " + klient + " zwr�ci� po�yczke o wysoko�ci " + kasa);
    }

    public void obs�uga(int ops) {

        Scanner s = new Scanner(System.in);
        if (ops == 1) {
            nowyKlient();
        } else {
            System.out.println("Podaj swoje imi�");
            String imie = s.next();
            if (klienci.size() == 0) {
                System.out.println("Nie znaleziono konta dla podanego imienia");
                System.out.println("Czy chcesz za�o�y� u nas konto?\n1.Tak\n2.Nie");
                int ops2 = s.nextInt();
                switch (ops2) {
                    case 1:
                        nowyKlient();
                        return;

                    case 2:
                        System.out.println("Do zobaczenia");
                        break;
                }
            }
            for (Client klient : klienci.values()) {
                if (klient.getName().equals(imie)) {
                    System.out.println("Masz nast�puj�ce konta: " + klient.getKonta());
                    switch (ops) {
                        case 2:
                            Konto konto1 = klient.lastKonto();
                            klient.noweKonto();
                            if (!klient.lastKonto().equals(konto1)) {
                                balance += klient.lastKonto().getBalance();
                            }
                            break;
                        case 3:
                            if (klient.isKonto("checking")) {
                                System.out.println("Ile pieni�dzy chcesz zwr�ci�?");
                                double kasa = s.nextDouble();
                                zwrocPo�yczke(klient, kasa);
                                System.out.println("Teraz masz nast�puj�ce konta: " + klient.getKonta());
                            } else {
                                System.out.println("Nie masz konta do po�yczek. Za�� takie");
                            }
                            break;
                        case 4:
                            if (klient.isKonto("saving")) {
                                System.out.println("Ile pieni�dzy chcesz wyj��?");
                                double kasa = s.nextDouble();
                                wyjmijLokate(klient, kasa);
                                System.out.println("Teraz masz nast�puj�ce konta: " + klient.getKonta());
                            } else {
                                System.out.println("Nie masz konta do lokat. Za�� takie");
                            }
                            break;
                        case 5:
                            if (klient.isKonto("checking")) {
                                System.out.println("Ile pieni�dzy chcesz po�yczy�?");
                                double kasa = s.nextDouble();
                                udzielPo�yczki(klient, kasa);
                                System.out.println("Teraz masz nast�puj�ce konta: " + klient.getKonta());
                            } else {
                                System.out.println("Nie masz konta do po�yczek. Za�� takie");
                            }
                            break;
                        case 6:
                            if (klient.isKonto("saving")) {
                                System.out.println("Ile pieni�dzy chcesz z�o�y� na lokacie");
                                double kasa = s.nextDouble();
                                przyjmijLokate(klient, kasa);
                                System.out.println("Teraz masz nast�puj�ce konta: " + klient.getKonta());
                            } else {
                                System.out.println("Nie masz konta do lokat. Za�� takie");
                            }
                            break;
                    }
                } else {
                    System.out.println("Nie znaleziono konta dla podanego imienia");
                    System.out.println("Czy chcesz za�o�y� u nas konto?\n1.Tak\n2.Nie");
                    int ops2 = s.nextInt();
                    switch (ops2) {
                        case 1:
                            nowyKlient();
                            break;
                        case 2:
                            System.out.println("Do zobaczenia");
                    }
                }
            }
        }

    }

    public void odsetki(double rate) {
        {
            for (Client klient : klienci.values()) {
                for (Konto acc : klient.getKonta()) {
                    //if ((acc.getType().equals("saving") && acc.getBalance() > 0) || (acc.getType().equals("checking") && acc.getBalance() < 0)) {
                    double odsetki = acc.getBalance() * (rate / 100);
                    System.out.println("Naliczono odsetki dla konta " + acc + " nale��cego do klienta " + klient + " w wysoko�ci " + odsetki);
                    acc.setBalance(acc.getBalance() + odsetki);
                    setBalance(getBalance() + odsetki);
                    System.out.println("Stan skarbca banku wynosi teraz " + getBalance());

                }
            }
        }

    }

    @Override
    public String toString() {
        return "Bank o nazwie " + name + " o stanie skarbca r�wnym " + balance;
    }
}
