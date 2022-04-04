import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tpo.lab2.VariantFunction;
import tpo.lab2.trig.*;
import tpo.lab2.logariphm.*;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
    private Ln ln = new Ln(ACC);
    @Mock
    private Log_10 log_10 = new Log_10(ACC);
    @Mock
    private Log_5 log_5 = new Log_5(ACC);
    @Mock
    private Log_2 log_2 = new Log_2(ACC);

    @InjectMocks
    private VariantFunction func = new VariantFunction(ACC);


    @ParameterizedTest
    @ValueSource(doubles = {-2.5, -5.635, -11.92})
    public void testTrigZeros(double x){
        when(sin.calculate(eq(x))).thenReturn(Math.sin(x));
        when(cos.calculate(eq(x))).thenReturn(Math.cos(x));
        when(tan.calculate(eq(x))).thenReturn(Math.tan(x));
        when(sec.calculate(eq(x))).thenReturn(1.0/Math.cos(x));
        when(csc.calculate(eq(x))).thenReturn(1.0/Math.sin(x));
        assertEquals(0.0, func.calculate(x), ACC);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, 0.667, 1.49})
    public void testLogZeros(double x){
        when(ln.calculate(eq(x))).thenReturn(Math.log(x));
        when(log_10.calculate(x)).thenReturn(Math.log(x)/Math.log(10));
        when(log_5.calculate(x)).thenReturn(Math.log(x)/Math.log(5));
        when(log_2.calculate(x)).thenReturn(Math.log(x)/Math.log(2));
        assertEquals(0.0, func.calculate(x), ACC);
    }

    @ParameterizedTest
    @CsvSource({
            "2.62, 2.0",
            "4.3594, 8.0",
            "37.694, 128.0",
            "1389.1, 1024.0"})
    public void checkLogValues(double x, double y){
        when(ln.calculate(eq(x))).thenReturn(Math.log(x));
        when(log_10.calculate(x)).thenReturn(Math.log(x)/Math.log(10));
        when(log_5.calculate(x)).thenReturn(Math.log(x)/Math.log(5));
        when(log_2.calculate(x)).thenReturn(Math.log(x)/Math.log(2));
        assertEquals(y, func.calculate(x), ACC*10);
    }

    @ParameterizedTest
    @CsvSource({
            "-8.65178, -2.0",
            "-8.59718, -8.0",
            "-8.45782, -128.0",
            "-8.34756, -1024.0"})
    public void checkTrigValues(double x, double y){
        when(sin.calculate(eq(x))).thenReturn(Math.sin(x));
        when(cos.calculate(eq(x))).thenReturn(Math.cos(x));
        when(tan.calculate(eq(x))).thenReturn(Math.tan(x));
        when(sec.calculate(eq(x))).thenReturn(1.0/Math.cos(x));
        when(csc.calculate(eq(x))).thenReturn(1.0/Math.sin(x));
        assertEquals(y, func.calculate(x), ACC*100);
    }

    @ParameterizedTest
    @ValueSource(doubles={0.0})
    public void nanTest(double x){
        when(sin.calculate(eq(x))).thenReturn(Math.sin(x));
        when(cos.calculate(eq(x))).thenReturn(Math.cos(x));
        when(tan.calculate(eq(x))).thenReturn(Math.tan(x));
        when(sec.calculate(eq(x))).thenReturn(1.0/Math.cos(x));
        when(csc.calculate(eq(x))).thenReturn(1.0/Math.sin(x));
        assertEquals(NaN, func.calculate(0));
    }

}
