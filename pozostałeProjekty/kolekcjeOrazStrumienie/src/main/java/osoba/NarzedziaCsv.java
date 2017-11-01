package osoba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NarzedziaCsv {
    public static List<Map<String, Object>> wczytajCsvZPliku(String sciezkaDoPliku) {
        List<Map<String, Object>> wyniki = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sciezkaDoPliku));
            String linia = reader.readLine();
            while (linia != null) {
                Map<String, Object> wiersz = new HashMap<>();
                String[] wierszTablica = linia.split(";");
                if (wierszTablica.length < 11) {
                    linia = reader.readLine();
                    continue;
                }
                wiersz.put("Płeć", wierszTablica[0]);
                wiersz.put("Imię", wierszTablica[1]);
                wiersz.put("Nazwisko", wierszTablica[2]);
                wiersz.put("Miasto", wierszTablica[3]);
                wiersz.put("Ulica", wierszTablica[4]);
                wiersz.put("KodPocztowy", wierszTablica[5]);
                wiersz.put("Wiek", wierszTablica[8]);
                wiersz.put("DataUrodzenia", wierszTablica[9]);
                wiersz.put("Zawod", wierszTablica[10]);
                wiersz.put("Zarobki", wierszTablica[11]);
                wyniki.add(wiersz);
                linia = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wyniki;
    }

    public static List<Osoba> zamienMapeNaPersone(List<Map<String, Object>> wiersze) {
        List<Osoba> persony = new ArrayList<>();
        for (int i = 1; i < wiersze.size(); i++) {
            Map<String, Object> wiersz = wiersze.get(i);
            Osoba persona = new Osoba();
            persona.setImie((String) wiersz.get("Imię"));
            persona.setNazwisko((String) wiersz.get("Nazwisko"));
            persona.setKodPocztowy((String) wiersz.get("KodPocztowy"));
            persona.setUlica((String) wiersz.get("Ulica"));
            persona.setMiasto((String) wiersz.get("Miasto"));
            persona.setZawod((String) wiersz.get("Zawod"));
            persona.setZawod((String) wiersz.get("Zawod"));
            Integer wiek = Integer.parseInt((String) wiersz.get("Wiek"));
            Integer zarobki = Integer.parseInt((String) wiersz.get("Zarobki"));
            persona.setZarobki(zarobki);
            persona.setWiek(wiek);
            String plec = (String) wiersz.get("Płeć");
            if (plec.equals("male")) {
                persona.setPlec(Plec.MEZCZYZNA);
            } else {
                persona.setPlec(Plec.KOBIETA);
            }
            String dataUrodzenia = (String)wiersz.get("DataUrodzenia");
            dataUrodzenia = dataUrodzenia.replaceAll("\\.", "/");
            String []data = dataUrodzenia.split("/");
            if (data.length==3){
                Integer dzien = Integer.parseInt(data[1]);
                Integer miesiac = Integer.parseInt(data[0]);
                Integer rok = Integer.parseInt(data[2]);
                persona.setDataUrodzenia(LocalDate.of(rok,miesiac,dzien));
            }
            persony.add(persona);
        }
        return persony;
    }
}
