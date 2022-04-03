package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.trig.Tan;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TanTest {
    private static final double ACC = 0.0001;
    private Tan tan;

    @BeforeEach
    public void init() {
        tan = new Tan(ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-4 * PI/3, -PI, -PI/3, -PI/6, 0, PI/6, PI, 4 * PI/3})
    public void someTests(double x){
        assertEquals(Math.tan(x), tan.calculate(x), ACC);
    }
}
