package tpo.lab2.trig;

import tpo.lab2.AbstractFunction;

import static java.lang.Float.NaN;

public class Tan extends AbstractFunction {
    private Sin sin;
    private Cos cos;

    public Tan(double accuracy) {
        super(accuracy);
        this.sin = new Sin(accuracy);
        this.cos = new Cos(accuracy);
    }


    @Override
    public double calculate(double x) {
        if ((x - Math.PI / 2) % Math.PI == 0) {
            return NaN;
        }
        return sin.calculate(x)/cos.calculate(x);
    }
}
