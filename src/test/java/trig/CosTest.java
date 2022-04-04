package trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tpo.lab2.trig.Cos;
import tpo.lab2.trig.Sin;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CosTest {
    private static final double ACC = 0.0001;


    private Cos cos = new Cos(ACC);


    @ParameterizedTest
    @ValueSource(doubles = {-3 * PI/2, -4 * PI/3, -PI, -PI/2, -PI/3, -PI/6, 0, PI/6, PI/3, PI/2, PI, 4 * PI/3, 3 * PI/2})
    public void someTests(double x){
        assertEquals(Math.cos(x), cos.calculate(x), ACC);
    }
}
