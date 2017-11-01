package pl.sda.java4.triangles;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.lang.Integer.MAX_VALUE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TriangilityTest {

    Triangility sut;

    @Before
    public void setup() {
        sut = new Triangility();
    }

    @Test
    @Parameters({
            "3,4,5",  // zwykły trókąt
            "6,6,6",  // róbnoboczny
            "6,6,10", // równoramienny
            "10,6,6", // równoramienny
            "6,10,6", // równoramienny
            "2147483647,2147483647,2147483647" // max zakresu
    })
    public void properTriangle(int a, int b, int c) {
        assertTrue(sut.isTriangle(a, b, c));
    }

    @Test
    @Parameters({
            "3,4,10",  // suma 2 boków mniejsza od 3.
            "3,10,4",  // suma 2 boków mniejsza od 3.
            "10,3,4",  // suma 2 boków mniejsza od 3.
            "0,1,1",   // jeden bok zerowy
            "1,0,1",   // jeden bok zerowy
            "1,1,0",   // jeden bok zerowy
            "-1,1,2",  // jeden bok ujemny
            "2,-1,2",  // jeden bok ujemny
            "1,2,-1",  // jeden bok ujemny
            "5,5,10",  // suma 2 boków równa 3.
            "10,5,5",  // suma 2 boków równa 3.
            "5,10,5",  // suma 2 boków równa 3.
            "0,0,0",   // niepoprawny równoboczny
            "-1,-1,-1", // niepoprawny równoboczny
    })
    public void invalidTriangle(int a, int b, int c) {
        assertFalse(sut.isTriangle(a, b, c));
    }
}

//package pl.sda.java4.triangles;
//
//import junitparams.JUnitParamsRunner;
//import junitparams.Parameters;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static java.lang.Integer.MAX_VALUE;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//@RunWith(JUnitParamsRunner.class)
//public class TriangilityTest {
//
//    Triangility sut;
//
//    @Before
//    public void setup() {
//        sut = new Triangility();
//    }
//
//    @Test
//    @Parameters({"3,4,5",
//            "6,6,6"})
//    public void properTriangle(int a, int b, int c) {
//        assertTrue(sut.isTriangle(a, b, c));
//    }
//
//    public void invalidTriangle(int a, int b, int c) {
//        assertFalse(sut.isTriangle(a, b, c));
//    }
//
//    @Test
//    public void toJestTrójkat() {
//        assertTrue(sut.isTriangle(3, 4, 5));
//    }
//
//    @Test
//    public void toNieJestTrójkąt() {
//        assertFalse(sut.isTriangle(3, 4, 10));
//    }
//
//    @Test
//    public void takKiedyWszystkieBokiRówne() {
//        assertTrue(sut.isTriangle(6, 6, 6));
//    }
//
//    @Test
//    public void takKiedyWszystkieBokiRówneMaxInt() {
//        assertTrue(sut.isTriangle(MAX_VALUE, MAX_VALUE, MAX_VALUE));
//    }
//
//    @Test
//    public void takKiedyPierwszyIDrugiBokiRówne() {
//        assertTrue(sut.isTriangle(6, 6, 10));
//    }
//
//    @Test
//    public void takKiedyDrugiITrzeciBokiRówne() {
//        assertTrue(sut.isTriangle(10, 6, 6));
//    }
//
//    @Test
//    public void takKiedyPierwszyITrzeciBokiRówne() {
//        assertTrue(sut.isTriangle(6, 10, 6));
//    }
//
//    @Test
//    public void nieKiedyPierwszyBokRównyZero() {
//        assertFalse(sut.isTriangle(0, 1, 1));
//    }
//
//    @Test
//    public void nieKiedyDrugiBokRównyZero() {
//        assertFalse(sut.isTriangle(1, 0, 1));
//    }
//
//    @Test
//    public void nieKiedyTrzeciBokRównyZero() {
//        assertFalse(sut.isTriangle(1, 1, 0));
//    }
//
//    @Test
//    public void nieKiedyPierwszyBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(-1, 1, 2));
//    }
//
//    @Test
//    public void nieKiedyDrugiBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(1, -1, 2));
//    }
//
//    @Test
//    public void nieKiedyTrzeciBokMniejszyOdZera() {
//        assertFalse(sut.isTriangle(1, 2, -1));
//    }
//
//    @Test
//    public void nieKiedyWszystkieBokiRówneZero() {
//        assertFalse(sut.isTriangle(0, 0, 0));
//    }
//
//    @Test
//    public void nieKiedyPierwszyIDrugiBokSąRówneTrzeciemu() {
//        assertFalse(sut.isTriangle(5, 5, 10));
//    }
//
//    @Test
//    public void nieKiedyDrugiITrzeciSąBokRównePierwszemu() {
//        assertFalse(sut.isTriangle(10, 5, 5));
//    }
//
//    @Test
//    public void nieKiedyPierwszyITrzeciBokSąRówneDrugiemu() {
//        assertFalse(sut.isTriangle(5, 10, 5));
//    }
//
//    @Test
//    public void nieKiedyWszystkieBokiMniejszeOdZeraISobieRówne() {
//        assertFalse(sut.isTriangle(-1, -1, -1));
//    }
//}