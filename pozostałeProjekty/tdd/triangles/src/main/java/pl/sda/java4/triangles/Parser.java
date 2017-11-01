package pl.sda.java4.triangles;

public class Parser {
    public int[] parseTriple(String s) {
        String[]liczby= s.trim().split("[^0-9-]+");
        if (liczby.length!=3){
            throw  new IllegalArgumentException("Must have 3 numbers");
        }
        int[]numerki=new int[3];

for (int i=0;i<liczby.length;i++){
    numerki[i]=Integer.parseInt(liczby[i]);
}
        return numerki;
    }
}
