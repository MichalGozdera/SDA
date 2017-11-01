/**
 * Podaj liczbę całkowitą - czy jest to liczba pierwsza? (zapoznaj się z podpunktami, zanim coś zakodujesz 😊)
 wyciągnij logikę sprawdzania, czy dana liczba jest pierwsza do osobnej klasy
 klasę sprawdzającą przetestować jednostkowo - wymyśl i zapisz przypadki testowe, zanim napiszesz implementację
 klasę sprawdzającą przekazywać do klasy odpowiadającej za całą aplikację przez parametr (czyli wczytywanie, parsowanie, sprawdzenie i wyświetlenie)
 sprawdzić za pomocą mocków, jak zachowuje się klasa aplikacji, kiedy klasa sprawdzająca - zwróci true, false lub rzuci wyjątek
 sprawdzić z użyciem mocków albo bez, jak zachowa się klasa aplikacji, kiedy na wejściu otrzyma np. pusty ciąg znaków albo coś, co nie jest liczbą - wymyśl i zapisz przypadki testowe, zanim napiszesz implementację

 */

import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class Main {
    private final Sieve sieve;
    private final IntSupplier reader;
    private final IntConsumer success;
    private final IntConsumer failure;

    public static void main(String args[]) throws AppError {
        try (Scanner scanner = new Scanner(System.in)) {
            new Main(new Sieve(),
                    scanner::nextInt,
                    inputNumber -> System.out.println(inputNumber + " is prime"),
                    inputNumber -> System.out.println(inputNumber + " is NOT prime")
            ).run();
        }
    }

    public Main(Sieve sieve, IntSupplier reader, IntConsumer success, IntConsumer failure) {
        this.sieve = sieve;
        this.reader = reader;
        this.success = success;
        this.failure = failure;
    }

    void run() throws AppError {
        int input = reader.getAsInt();

        boolean isPrime;
        try {
            isPrime = sieve.isPrime(input);
        } catch (IllegalArgumentException e) {
            throw new AppError(e);
        }

        if (isPrime) {
            success.accept(input);
        } else {
            failure.accept(input);
        }
    }
}