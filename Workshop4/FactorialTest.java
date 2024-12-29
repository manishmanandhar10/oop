package Workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, factorial.calculateFactorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, factorial.calculateFactorial(0)); 
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, factorial.calculateFactorial(1));
    }
}
