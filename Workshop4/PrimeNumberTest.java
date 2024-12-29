package Workshop4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

    private PrimeNumber primeNumber;

    @BeforeEach
    public void setUp() {
        primeNumber = new PrimeNumber(); 
    }

    @Test
    public void testPrimeNumberTrue() {
        assertTrue(primeNumber.isPrime(5));
    }

    @Test
    public void testPrimeNumberFalse() {
        assertFalse(primeNumber.isPrime(4)); 
    }

    @Test
    public void testPrimeNumberEdgeCase() {
        assertFalse(primeNumber.isPrime(1));
    }
}
