package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tpo.lab2.trig.Sin;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinTests {
    private static final double ACC = 0.0001;
    private Sin sin;

    @BeforeEach
    public void init() {
        sin = new Sin(ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-PI, 0, PI})
    public void testOnZero(double x){
        assertEquals(0.0, sin.calculate(x), ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-3 * PI/2, PI/2})
    public void testOnOne(double x){
        assertEquals(1.0, sin.calculate(x), ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-PI/2, 3 * PI/2})
    public void testOnMinusOne(double x){
        assertEquals(-1.0, sin.calculate(x), ACC);
    }


}
