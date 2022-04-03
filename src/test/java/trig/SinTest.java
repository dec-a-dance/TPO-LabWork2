package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.trig.Sin;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTest {
    private static final double ACC = 0.0001;
    private Sin sin;

    @BeforeEach
    public void init() {
        sin = new Sin(ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-3 * PI/2, -4 * PI/3, -PI, -PI/2, -PI/3, -PI/6, 0, PI/6, PI/3, PI/2, PI, 4 * PI/3, 3 * PI/2})
    public void someTests(double x){
        assertEquals(Math.sin(x), sin.calculate(x), ACC);
    }

}
