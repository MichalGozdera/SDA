/**
 * Znajdź najdłuższy ciąg identycznych znaków - jakiej jest długości?
 wydziel logikę poszukiwania do osobnej metody i przetestują ją jednostkowo - jakie są nietrywialne wariacje danych wejściowych? - wymyśl i zapisz przypadki testowe, zanim napiszesz implementację

 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LongestTest {

    Longest sut;
    @Before
    public void setup() {
        sut = new Longest("",0);
    }

    @Test
    public void simpleCase() {
        assertEquals(new Longest("aaaa",4),sut.dlugi("aaaabbbcc"));
    }

    @Test
    public void emptyCase() {
        assertEquals(new Longest("",0),sut.dlugi(""));
    }

    @Test(expected = NullPointerException.class)
    public void nullCase() {
        sut.dlugi(null);
    }
    @Test
    public void equalCase() {
        assertEquals(new Longest("bb",2),sut.dlugi("ad3bb2  3231fesdwebcb"));
    }
    @Test
    public void enterCase() {
        assertEquals(new Longest("\n\n\n",3),sut.dlugi("ad32 32\n\n\n31fesdwebb"));
    }
    @Test
    public void enterCase2() {
        assertEquals(new Longest("\r\r\r",3),sut.dlugi("ad\r\r\r32 32\n\n\n31fesdwebb"));
    }
    @Test
    public void polskieZnaki() {
        assertEquals(new Longest("śśśśś",5),sut.dlugi("adśśśś\r\r\r32 32\n\n\n31fesdśśśśśwebb"));
    }
    @Test
    public void escape() {
        StringBuilder sb=new StringBuilder();
        sb.append((char)27).append((char)27).append((char)27);
        assertEquals(new Longest(sb.toString(),3),sut.dlugi("ddd".replace('d',(char)27)));
    }
    @Test
    public void najdluzszyKonczySieNaPrzedostatnimZnaku() {
        assertEquals(new Longest("XXXX",4),sut.dlugi("ad\r\r\r32 32\n\n\n31fesdwebXXXXb"));
    }
}
