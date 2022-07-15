import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        calculator.setFirstNum(7.0);
        calculator.setSecondNum(5.0);
    }

    @Test
    void firstNum() {
        assertEquals(7.0, calculator.getFirstNum());
    }

    @Test
    void secondNum() {
        assertEquals(5.0, calculator.getSecondNum());
    }

    @Test
    void add() {
        assertEquals(12.0, calculator.add());
    }

    @Test
    void subtract() {
        assertEquals(2.0, calculator.subtract());
    }

    @Test
    void multiply() {
        assertEquals(35.0, calculator.multiply());
    }

    @Test
    void divide() {
        assertEquals(7.0/5.0, calculator.divide());
    }

    @Test
    void divideByZero() {
        calculator.setSecondNum(0);
        assertEquals(calculator.getFirstNum()/0, calculator.divide());
    }

    @Test
    void powerOf() {
        assertEquals(16807.0, calculator.powerOf());
    }
}