
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MainTest {

    private Sieve mock;

    @Before
    public void setUp() throws Exception {
        mock = mock(Sieve.class);
    }

    @Test
    public void runSuccessfulAction() throws Throwable {
        final boolean[] methodWasRun = {false};

        Main sut = new Main(mock,
                () -> 7,
                x -> {
                    methodWasRun[0] = true;
                },
                x -> {
                    Assert.fail("Nie bangla.");
                }
        );

        when(mock.isPrime(7)).thenReturn(true);
        sut.run();

        Assert.assertTrue(methodWasRun[0]);
    }

    @Test
    public void runFailureAction() throws Throwable {
        final boolean[] methodWasRun = {false};

        Main sut = new Main(mock,
                () -> 66,
                x -> {
                    Assert.fail("Nie bangla.");
                },
                x -> {
                    methodWasRun[0] = true;
                }
        );

        when(mock.isPrime(66)).thenReturn(false);
        sut.run();

        Assert.assertTrue(methodWasRun[0]);
    }

    @Test(expected = AppError.class)
    public void repackageExceptions() throws Throwable {
        Main sut = new Main(mock, () -> -1, null, null);

        when(mock.isPrime(-1))
                .thenThrow(new IllegalArgumentException());
        sut.run();
    }

}