package pl.sda.java4.triangles;

public class Triangility {

    public boolean isTriangle(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return false;
        } else if (x < (long) y + z && y < (long) x + z && z < (long) x + y) {
            return true;
        } else
            return false;
    }
}
