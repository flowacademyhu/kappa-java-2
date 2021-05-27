package hu.flowacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 7;

        // when
        int sum = Calculator.add(a, b);

        // then
        assertEquals(sum, 12);
    }
}
