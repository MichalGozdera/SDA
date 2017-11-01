package pl.sda.java4.triangles;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParserTest {

    private Parser sut;

    @Before
    public void setup() {
        sut = new Parser();
    }

    @Test
    @Parameters
    public void properInput(String input, int[] expectedOutput) {
        Assert.assertArrayEquals(expectedOutput, sut.parseTriple(input));
    }

    private Object parametersForProperInput() {
        return new Object[]{
                new Object[]{"3 4 5", new int[]{3, 4, 5}},
                new Object[]{"  3         4       \t\t           5  ", new int[]{3, 4, 5}},
                new Object[]{"100 100000 100", new int[]{100, 100000, 100}},
                new Object[]{"-1 -1 -1", new int[]{-1, -1, -1}}
        };
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters
    public void parsingError(String input) {
        sut.parseTriple(input);
    }

    private Object parametersForParsingError() {
        return new Object[]{
                "1 2",
                "1 2 3 4",
                "1 2 z",
                "1 @ 3",
                "",
                "1 2 2147483648",
                null
        };
    }
}

//package pl.sda.java4.triangles;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class ParserTest {
//
//    private Parser sut;
//
//    @Before
//    public void setup() {
//        sut = new Parser();
//    }
//
//    @Test
//    public void regularTriangle() {
//        Assert.assertArrayEquals(new int[]{3, 4, 5},
//                sut.parseTriple("3 4 5"));
//    }
//
//    @Test
//    public void spaceIsGood() {
//        Assert.assertArrayEquals(new int[]{3, 4, 5},
//                sut.parseTriple("  3         4       \t\t           5  "));
//    }
//
//    @Test
//    public void allowLongerNumbers() {
//        Assert.assertArrayEquals(new int[]{100, 100000, 100},
//                sut.parseTriple("100 100000 100"));
//    }
//
//    @Test
//    public void allowNegativeNumbers() {
//        Assert.assertArrayEquals(new int[]{-1, -1, -1},
//                sut.parseTriple("-1 -1 -1"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void notEnoughNumbers() {
//        sut.parseTriple("1 2");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void tooManyNumbers() {
//        sut.parseTriple("1 2 3 4");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void onlyNumbersAllowed1() {
//        sut.parseTriple("1 2 z");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void onlyNumbersAllowed2() {
//        sut.parseTriple("1 @ 3");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void emptyString() {
//        sut.parseTriple("");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void numberTooLarge() {
//        sut.parseTriple("1 2 2147483648");
//    }
//
//}