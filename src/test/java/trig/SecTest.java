package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.trig.Sec;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecTest {
    private static final double ACC = 0.00000000000001;
    private Sec sec;

    @BeforeEach
    public void init() {
        sec = new Sec(ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-4 * PI/3, -PI, -PI/3, -PI/6, 0, PI/6, PI/3, PI, 4 * PI/3})
    public void someTests(double x){
        assertEquals(1.0/Math.cos(x), sec.calculate(x), ACC);
    }
}
