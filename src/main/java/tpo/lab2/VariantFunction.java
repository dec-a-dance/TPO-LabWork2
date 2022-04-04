package tpo.lab2;

import tpo.lab2.trig.*;
import tpo.lab2.logariphm.*;

public class VariantFunction extends AbstractFunction{
    private Sin sin = new Sin(accuracy);
    private Cos cos = new Cos(accuracy);
    private Tan tan = new Tan(accuracy);
    private Csc csc = new Csc(accuracy);
    private Sec sec = new Sec(accuracy);
    private Ln ln = new Ln(accuracy);
    private Log_10 log_10 = new Log_10(accuracy);
    private Log_5 log_5 = new Log_5(accuracy);
    private Log_2 log_2 = new Log_2(accuracy);

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
