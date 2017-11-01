package sortowanie.sortowanieszybkie;

import java.util.List;

public class AlgorytmSzybkiWyniki {
    private List<Integer>mniejsze;
    private List<Integer>srodek;
    private List<Integer>wieksze;

    public AlgorytmSzybkiWyniki(List<Integer> mniejsze, List<Integer> srodek, List<Integer> wieksze) {
        this.mniejsze = mniejsze;
        this.srodek = srodek;
        this.wieksze = wieksze;
    }

    public List<Integer> getMniejsze() {
        return mniejsze;
    }

    public void setMniejsze(List<Integer> mniejsze) {
        this.mniejsze = mniejsze;
    }

    public List<Integer> getSrodek() {
        return srodek;
    }

    public void setSrodek(List<Integer> srodek) {
        this.srodek = srodek;
    }

    public List<Integer> getWieksze() {
        return wieksze;
    }

    public void setWieksze(List<Integer> wieksze) {
        this.wieksze = wieksze;
    }
}
