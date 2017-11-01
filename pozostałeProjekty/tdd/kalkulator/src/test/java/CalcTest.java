import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalcTest {

    Calc sut;

    @Before
    public void setup() {
        sut = new Calc();
    }

    @Test
    public void dodawanieProste() {
        assertTrue("12".equals(sut.licz("7+5")));
    }

    @Test
    public void odejmowanieProste() {
        assertTrue("2".equals(sut.licz("7-5")));
    }

    @Test
    public void mnozenieProste() {
        assertTrue("35".equals(sut.licz("7*5")));
    }

    @Test
    public void dzielenieProste() {
        assertTrue("3".equals(sut.licz("300/100")));
    }
    @Test
    public void dodawanieUjemneZLewej() {
        assertTrue("-2".equals(sut.licz("-7+5")));
    }

    @Test
    public void odejmowanieUjemneZLewej() {
        assertTrue("-12".equals(sut.licz("-7-5")));
    }

    @Test
    public void mnozenieUjemneZLewej() {
        assertTrue("-35".equals(sut.licz("-7*5")));
    }

    @Test
    public void dzielenieUjemneZLewej() {
        assertTrue("-3".equals(sut.licz("-300/100")));
    }
    @Test
    public void dodawanieUjemneZPrawej() {
        assertTrue("2".equals(sut.licz("7+-5")));
    }

    @Test
    public void odejmowanieUjemneZPrawej() {
        assertTrue("12".equals(sut.licz("7--5")));
    }

    @Test
    public void mnozenieUjemneZPrawej() {
        assertTrue("-35".equals(sut.licz("7*-5")));
    }
    @Test
    public void dzielenieUjemneZPrawej() {
        assertTrue("-3".equals(sut.licz("300/-100")));
    }
    @Test
    public void kolejnoscDzialanMnozenieDodawnie() {
        assertTrue("6".equals(sut.licz("2+2*2")));
    }
    @Test
    public void kolejnoscDzialanDzielenieOdejmowanie() {
        assertTrue("9".equals(sut.licz("10-10/10")));
    }
    @Test
    public void dziwneZnakiPrzyWpisywaniuZZachowaniemLogiki() {
        assertTrue("9".equals(sut.licz("c 10dsddsads-wdadsad10sdasdd/sdadw10dsdaw  ")));
    }

    @Test
    public void pojedynczaLiczba() {
        assertTrue("11".equals(sut.licz("11")));
    }
    @Test
    public void pojedynczaLiczbaPrzerywana() {
        assertTrue("11".equals(sut.licz("fdsssd1sdsd1dsdads")));
    }  @Test
    public void pojedynczaLiczbaUjemna() {
        assertTrue("-1".equals(sut.licz("-1")));
    }
    @Test
    public void pojedynczaLiczbaUjemnaPrzerywana() {
        assertTrue("-1".equals(sut.licz("fdsssd-sdsd1dsdads")));
    }
    @Test(expected = RuntimeException.class)
    public void dzielenieprzez0() {
        sut.licz("4/0");
    }
    @Test(expected = RuntimeException.class)
    public void dzielenieprzez0LiczbyUjemnej() {
        sut.licz("-4/0");
    }
    @Test(expected = RuntimeException.class)
    public void dzielenieprzez0zMinusem() {
        sut.licz("4/-0");
    }
    @Test(expected = RuntimeException.class)
    public void dzieleniePrzezZeroZDziwnymiZnakami() {
        sut.licz("aa40ddd*dd50d-0+85*9-dsfds25jjj/nnnn  0   ");
    }
    @Test(expected = RuntimeException.class)
    public void nullowatość() {
        sut.licz(null);
    }

    @Test(expected = RuntimeException.class)
    public void pustyString() {
        sut.licz("");
    }

    @Test(expected = RuntimeException.class)
    public void dziwneZnakiBezLogiki() {
        sut.licz(",,,,dssddsdsddfdsdsdsdsd$$");
    }


    @Test(expected = RuntimeException.class)
    public void zaDuzoDzialanNaRaz1() {
        sut.licz("2-+2");
    }

    @Test(expected = RuntimeException.class)
    public void zaDuzoDzialanNaRaz2() {
        sut.licz("2+*2");
    }
    @Test(expected = RuntimeException.class)
    public void pustyOperator() {
        sut.licz("-");
    }
    @Test(expected = RuntimeException.class)
    public void bezLiczb() {
        sut.licz("++");
    }

    @Test(expected = RuntimeException.class)
    public void zaMaloArgumentow() {
        sut.licz("++2");
    }

    @Test(expected = RuntimeException.class)
    public void zaMaloArgumentow2() {
        sut.licz("2++");
    }
    @Test(expected = RuntimeException.class)
    public void zaMaloArgumentow3() {
        sut.licz("2+3*3+");
    }
    @Test
    public void mnożenieOgromne() {
        assertTrue("99999999999999999999999999999999999999980000000000000000000000000000000000000001".equals(sut.licz("9999999999999999999999999999999999999999*9999999999999999999999999999999999999999")));
    }


}
