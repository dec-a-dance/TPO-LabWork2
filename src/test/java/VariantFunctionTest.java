import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import tpo.lab2.VariantFunction;
import tpo.lab2.trig.*;
import tpo.lab2.logariphm.*;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class VariantFunctionTest {
    private final double ACC = 0.01;
    @Mock
    private Sin sin = new Sin(ACC);
    @Mock
    private Cos cos = new Cos(ACC);
    @Mock
    private Tan tan = new Tan(ACC);
    @Mock
    private Sec sec = new Sec(ACC);
    @Mock
    private Csc csc = new Csc(ACC);
    @Mock
    private Ln ln;
    @Mock
    private Log_10 log_10;
    @Mock
    private Log_5 log_5;
    @Mock
    private Log_2 log_2;

    @InjectMocks
    private VariantFunction func;


    @ParameterizedTest
    @ValueSource(doubles = {-2.5, -5.635, -11.92})
    public void testTrigZeros(double x){
        /* when(sin.calculate(eq(x))).thenReturn(Math.sin(x));
        when(cos.calculate(eq(x))).thenReturn(Math.cos(x));
        when(cos.calculate(eq(x))).thenReturn(Math.cos(x));
        when(tan.calculate(eq(x))).thenReturn(Math.tan(x));
        when(sec.calculate(eq(x))).thenReturn(1.0/Math.cos(x));
        when(csc.calculate(eq(x))).thenReturn(1.0/Math.sin(x));
        assertEquals(0.0, func.calculate(x), ACC); */
    }

}
