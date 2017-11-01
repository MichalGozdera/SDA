package osoba;

import java.util.ArrayList;
import java.util.List;

public class RejestrOsob {
    private List<Osoba> listaOsob;

    public RejestrOsob() {
        this.listaOsob = new ArrayList<Osoba>();
    }

    public List<Osoba> getListaOsob() {
        return listaOsob;
    }

    public void dodajOsobe(Osoba osoba) {
        if (osoba != null) {
            listaOsob.add(osoba);
        }
    }

    public List<Osoba> pokazOsobyStarszeNiz(int wiek) {
        List<Osoba> starszyzna = new ArrayList<Osoba>();
        for (Osoba os : listaOsob) {
            if (os.getWiek() > wiek) {
                starszyzna.add(os);
            }
        }
        return starszyzna;
    }

}
