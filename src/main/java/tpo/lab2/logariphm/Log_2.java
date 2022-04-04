package tpo.lab2.logariphm;

import tpo.lab2.AbstractFunction;

public class Log_2 extends AbstractFunction {
    private Ln ln;

    public Log_2(double accuracy) {
        super(accuracy);
        this.ln = new Ln(accuracy);
    }

    @Override
    public double calculate(double x) {
        return ln.calculate(x)/ln.calculate(2);
    }
}
