package logariphm;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.logariphm.Log_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Log2Test {
    private static final double ACC = 0.00001;
    private Log_2 log2;

    @BeforeEach
    public void init() {
        log2 = new Log_2(ACC);
    }

    @Test
    public void testOfZeroValue() {
        assertThrows(ArithmeticException.class, () -> log2.calculate(0));
    }

    @Test
    public void testOfOnValue() {
        assertEquals(0, log2.calculate(1));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -111, -11111})
    public void negativeTest(double x) {
        assertThrows(ArithmeticException.class, () -> log2.calculate(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, 5.5, 10, 150, 300, 1000})
    public void positiveTest(double x) {
        assertEquals(Math.log(x)/Math.log(2), log2.calculate(x), ACC);
    }
}