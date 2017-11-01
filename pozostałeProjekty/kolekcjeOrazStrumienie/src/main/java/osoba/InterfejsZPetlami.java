package osoba;

import java.util.*;

public class InterfejsZPetlami {
    public static void main(String[] args) {
        String sciezkaDoPliku = "D:/coding/projekty/temp/zajecia30wrzesnia/baza.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        List<Osoba> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);
        wyswietlListe(wyswietlanieOsobOImieniu("Michał", osoby));
        System.out.println(nazwiska(osoby));
        wyswietlListe(osobyStarszeNiz35latZNazwiskamiNaS(osoby));
        wyswietlListe(wiekProdukcyjny(osoby));
        wyswietlListe(gdanskWawa(osoby));
        wyswietlListe(maj(osoby));
        wyswietlListe(kodna9(osoby));
        System.out.println(zawody(osoby));
        wyswietlListe(nazwiskaNaC(osoby));
        System.out.println(sredniaZarobkow(osoby));
        gendery(osoby);
        System.out.println(liczbaZMiasta(osoby));
        System.out.println(zarobkiZawodowe(osoby));
    }

    private static void wyswietlListe(List<Osoba> lista) {
        for (Osoba persona : lista) {
            System.out.println(persona);
        }
    }

    private static List<Osoba> wyswietlanieOsobOImieniu(String imie, List<Osoba> osoby) {
        List<Osoba> imionka = new ArrayList<>();
        for (Osoba person : osoby) {
            if (person.getImie().equals(imie)) {
                imionka.add(person);
            }
        }
        return imionka;
    }

    private static Set<String> nazwiska(List<Osoba> osoby) {
        Set<String> nazwiska = new HashSet<>();
        for (Osoba osoba : osoby) {
            nazwiska.add(osoba.getNazwisko());
        }
        return nazwiska;
    }

    private static List<Osoba> osobyStarszeNiz35latZNazwiskamiNaS(List<Osoba> osoby) {
        List<Osoba> nazwiskaNaS = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getWiek() > 35 && osoba.getNazwisko().charAt(0) == 83) {
                nazwiskaNaS.add(osoba);
            }
        }
        return nazwiskaNaS;
    }

    private static List<Osoba> wiekProdukcyjny(List<Osoba> osoby) {
        List<Osoba> nieEmeryci = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getPlec().equals(Plec.KOBIETA) && osoba.getWiek() > 17 && osoba.getWiek() < 60)
                nieEmeryci.add(osoba);
            if (osoba.getPlec().equals(Plec.MEZCZYZNA) && osoba.getWiek() > 17 && osoba.getWiek() < 65)
                nieEmeryci.add(osoba);
        }
        return nieEmeryci;
    }

    private static List<Osoba> gdanskWawa(List<Osoba> osoby) {
        List<Osoba> danzigWawa = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getMiasto().equals("Warszawa") || osoba.getMiasto().equals("Gdańsk")) {
                danzigWawa.add(osoba);
            }
        }
        return danzigWawa;
    }

    private static List<Osoba> maj(List<Osoba> osoby) {
        List<Osoba> maj = new ArrayList<>();
        osoby.forEach(osoba -> {
            if (osoba.getDataUrodzenia().getMonthValue() == 5)
                maj.add(osoba);
        });
        return maj;
    }

    private static List<Osoba> kodna9(List<Osoba> osoby) {
        List<Osoba> kod9 = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getKodPocztowy().charAt(0) == '9') {
                kod9.add(osoba);
            }
        }
        return kod9;
    }

    private static Set<String> zawody(List<Osoba> osoby) {
        Set<String> profesje = new HashSet<>();
        for (Osoba osoba : osoby) {
            profesje.add(osoba.getZawod());
        }
        return profesje;
    }

    private static List<Osoba> nazwiskaNaC(List<Osoba> osoby) {
        List<Osoba> lastNameC = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getNazwisko().charAt(0) == 'C') {
                lastNameC.add(osoba);
            }
        }
        return lastNameC;
    }

    private static double sredniaZarobkow(List<Osoba> osoby) {
        double suma = 0;
        int index = 0;
        for (Osoba osoba : osoby) {
            if (osoba.getWiek() < 31 && osoba.getWiek() > 20) {
                suma += osoba.getZarobki();
                index++;
            }
        }
        return suma / index;
    }

    private static void gendery(List<Osoba> osoby) {
        int kobiety = 0;
        int faceci = 0;
        for (Osoba osoba : osoby) {
            if (osoba.getPlec().equals(Plec.KOBIETA))
                kobiety++;
            else
                faceci++;
        }
        System.out.println("Kobiet jest: " + kobiety + " natomiast facetów jest: " + faceci);
    }

    private static Map<String, Integer> liczbaZMiasta(List<Osoba> osoby) {
        Map<String, Integer> miasta = new HashMap<>();
        for (Osoba osoba : osoby) {
            if (miasta.containsKey(osoba.getMiasto())) {
                miasta.put(osoba.getMiasto(), miasta.get(osoba.getMiasto()) + 1);
            } else {
                miasta.put(osoba.getMiasto(), 1);
            }
        }
        return miasta;
    }
    private static Map<String,List <Double>> zarobkiZawodowe(List<Osoba> osoby) {
        Map<String, List<Double>> zawody = new HashMap<>();
        for (Osoba osoba : osoby) {
            if (zawody.containsKey(osoba.getZawod())) {
                List<Double> srednie=zawody.get(osoba.getZawod());
                Double sumaDawnychZarobkow= Double.valueOf(srednie.get(0));
                Double index= Double.valueOf(srednie.get(1));
                index=index+1;
                Double nowSrednia=(sumaDawnychZarobkow+osoba.getZarobki())/index;

                srednie.set(0,nowSrednia);
                srednie.set(1,index);
                zawody.put(osoba.getZawod(),srednie);
            } else {
                List<Double> srednie=new ArrayList<>();
                srednie.add(Double.valueOf(osoba.getZarobki()));
                srednie.add((double) 1);
                zawody.put(osoba.getZawod(), srednie);
            }
        }
        return zawody;
    }
}
