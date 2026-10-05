package hu.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
 
class CalculatorTest {
 
    private Calculator calculator;
 
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Tests starting...");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("2 + 3 eredménye 5")
    void addTwoNumbers() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("5 - 3 eredménye 2")
    void sub1TwoNumbers() {
        int result = calculator.sub(5, 3);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("2 - 3 eredménye -1")
    void sub2TwoNumbers() {
        int result = calculator.sub(2, 3);
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("2 * 4 eredménye 8")
    void mult1TwoNumbers() {
        int result = calculator.mult(2, 4);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("-2 * 4 eredménye -8")
    void mult2TwoNumbers() {
        int result = calculator.mult(-2, 4);
        assertEquals(-8, result);
    }

    @Test
    @DisplayName("6 / 3 eredménye 2")
    void div1TwoNumbers() {
        float result = calculator.div(6, 3);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("6 / 4 eredménye 1.5")
    void div2TwoNumbers() {
        float result = calculator.div(6, 4);
        assertEquals(1.5, result);
    }

    @Test
    @DisplayName("10 / 0 eredménye Division by zero")
    void divisionByZeroThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(10, 0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Tests finished.");
    }
}
