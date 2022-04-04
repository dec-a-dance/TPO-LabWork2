package logariphm;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.logariphm.Ln;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LnTest {
    private static final double ACC = 0.00001;
    private Ln ln;

    @BeforeEach
    public void init() {
        ln = new Ln(ACC);
    }

    @Test
    public void testOfZeroValue() {
        assertThrows(ArithmeticException.class, () -> ln.calculate(0));
    }

    @Test
    public void testOfOnValue() {
        assertEquals(0, ln.calculate(1));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -111, -11111})
    public void negativeTest(double x) {
        assertThrows(ArithmeticException.class, () -> ln.calculate(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, 5.5, 10, 150, 300, 1000})
    public void positiveTest(double x) {
        assertEquals(Math.log(x), ln.calculate(x), ACC*10);
    }
}