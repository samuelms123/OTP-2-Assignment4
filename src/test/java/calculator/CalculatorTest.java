package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0));
    }

    @Test
    void divide() {
        assertEquals(1.0, Calculator.divide(3.0, 3.0));
    }

    @Test
    void add() {
        assertEquals(10.0, Calculator.add(8.0, 2.0));
    }

    @Test
    void subtract() {
        assertEquals(0.0, Calculator.subtract(8.0, 8.0));
    }
}