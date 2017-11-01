package kolejki.biblioteka;

public enum Kategoria {
    SCI_FI("Science-Fiction"), DRAMAT("Dramat"), KOMEDIA("Komedia"), BAJKA("Bajka"), EPOPEJA("Epopeja"), IT("IT"), POLITYKA("Polityka i historia"), PROZA("Proza");

    private String czytelnaNazwa;

    private Kategoria (String czytelnaNazwa){
        this.czytelnaNazwa=czytelnaNazwa;
    }

    public String getCzytelnaNazwa() {
        return czytelnaNazwa;
    }
}
