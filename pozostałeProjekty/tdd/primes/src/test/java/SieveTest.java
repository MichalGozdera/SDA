import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SieveTest {
    Sieve sut;

    @Before
    public void setUp() throws Exception {
        sut = new Sieve();
    }

    @Test
    public void pierwsza() {
        Assert.assertTrue(sut.isPrime(1993));
    }

    @Test
    public void zlozona() {
        Assert.assertFalse(sut.isPrime(34));
    }

    @Test
    public void najmniejsza() {
        Assert.assertTrue(sut.isPrime(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void jedyneczka() {
        sut.isPrime(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zero() {
        sut.isPrime(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ujemna() {
        sut.isPrime(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void pozazakresem() {
        sut.isPrime(Integer.MAX_VALUE+1);

    }


}