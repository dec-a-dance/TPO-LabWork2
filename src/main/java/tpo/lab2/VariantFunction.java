package tpo.lab2;

import tpo.lab2.trig.*;
import tpo.lab2.logariphm.*;

public class VariantFunction extends AbstractFunction{
    private Sin sin;
    private Cos cos;
    private Tan tan;
    private Csc csc;
    private Sec sec;
    private Ln ln;
    private Log_10 log_10;
    private Log_5 log_5;
    private Log_2 log_2;

    public VariantFunction(double accuracy) {
        super(accuracy);
    }


    @Override
    public double calculate(double x) {
        if(x<=0){
            return Math.pow(((((((csc.calculate(x)+cos.calculate(x))*tan.calculate(x)*tan.calculate(x)*tan.calculate(x))+sin.calculate(x)-csc.calculate(x))/(cos.calculate(x)*sec.calculate(x)))*csc.calculate(x))/csc.calculate(x)), 3);
        }
        return (Math.pow((ln.calculate(x)+log_10.calculate(x)), 3)+ln.calculate(x) - Math.pow(log_5.calculate(x), 3) - log_2.calculate(x));
    }
}
