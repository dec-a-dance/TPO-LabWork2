package tpo.lab2.trig;

import tpo.lab2.AbstractFunction;

public class Sec extends AbstractFunction {
    private Cos cos;

    public Sec(double accuracy) {
        super(accuracy);
        this.cos = new Cos(accuracy);
    }

    @Override
    public double calculate(double x) {
        return 1.0/cos.calculate(x);
    }
}
