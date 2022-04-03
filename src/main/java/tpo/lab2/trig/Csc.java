package tpo.lab2.trig;

import tpo.lab2.AbstractFunction;

public class Csc extends AbstractFunction {
    private Sin sin;

    public Csc(double accuracy) {
        super(accuracy);
        this.sin = new Sin(accuracy);
    }

    @Override
    public double calculate(double x) {
        return 1.0/sin.calculate(x);
    }
}
