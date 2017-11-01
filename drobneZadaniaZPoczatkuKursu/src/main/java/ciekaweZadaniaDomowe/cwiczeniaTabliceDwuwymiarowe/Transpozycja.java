package ciekaweZadaniaDomowe.cwiczeniaTabliceDwuwymiarowe;
//8. Napisz funkcję, która pozowli na realizację tranpozycji macierzy (tranpozycja, w skrócie zamiana wierszy z kolumnami /także jeśli chodzi o wymiary/).
//public int[][] transpose(int[][] m);
public class Transpozycja {
    public static void main(String[] args) {
Tablica.printArray(transponse(Tablica.wczytaj()));
    }
    public static int[][] transponse(int[][]bazowa){
        int m=bazowa.length;
       int n=bazowa[0].length;
        int [][]trans= new int[n][m];
        for (int i=0;i<trans.length;i++){
            for (int j=0;j<trans[0].length;j++){
                trans[i][j]=bazowa[j][i];
            }
        }
        return trans;
    }
}
