package tpo.lab2.trig;

import tpo.lab2.AbstractFunction;

import static java.lang.Float.NaN;

public class Sec extends AbstractFunction {
    private Cos cos;

    public Sec(double accuracy) {
        super(accuracy);
        this.cos = new Cos(accuracy);
    }

    @Override
    public double calculate(double x) {
        if ((x - Math.PI / 2) % Math.PI == 0) {
            return NaN;
        }
        return 1.0/cos.calculate(x);
    }
}
