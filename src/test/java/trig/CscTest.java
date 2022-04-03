package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.trig.Csc;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CscTest {
    private static final double ACC = 0.0001;
    private Csc csc;

    @BeforeEach
    public void init() {
        csc = new Csc(ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-3 * PI/2, -4 * PI/3, -PI/2, -PI/3, -PI/6, 0, PI/6, PI/3, PI/2, 4 * PI/3, 3 * PI/2})
    public void someTests(double x){
        assertEquals(1/Math.sin(x), csc.calculate(x), ACC);
    }
}
