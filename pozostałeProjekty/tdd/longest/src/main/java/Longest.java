public class Longest {
    String tekst;
    int dlugosc;

    public Longest(String tekst, int dlugosc) {
        this.tekst = tekst;
        this.dlugosc = dlugosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Longest longest = (Longest) o;

        if (dlugosc != longest.dlugosc) return false;
        return tekst != null ? tekst.equals(longest.tekst) : longest.tekst == null;
    }

    @Override
    public int hashCode() {
        int result = tekst != null ? tekst.hashCode() : 0;
        result = 31 * result + dlugosc;
        return result;
    }

    public Longest dlugi(String tekst) {
        if (tekst.length()==0){
            return new Longest("",0);
        }
        int numer = 1;
        int max = 1;
        StringBuilder sb = new StringBuilder(tekst.substring(0,1));
        String maxsb=sb.toString();
        for (int i = 1; i < tekst.length(); i++) {
            if (tekst.codePointAt(i) == tekst.codePointAt(i - 1)) {
                sb.append(tekst.substring(i, i + 1));
                numer++;
            } else {
                sb.delete(0, sb.length());
                numer=1;
                sb.append(tekst.substring(i,i+1));

            }
            if (numer>max){
                max=numer;
                maxsb=sb.toString();
            }
        }
        return new Longest(maxsb,max);
    }
}
