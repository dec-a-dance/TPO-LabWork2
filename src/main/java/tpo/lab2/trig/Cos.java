package tpo.lab2.trig;

import tpo.lab2.AbstractFunction;

public class Cos extends AbstractFunction {
    private Sin sin;

    public Cos(double accuracy) {
        super(accuracy);
        this.sin = new Sin(accuracy);
    }

    @Override
    public double calculate(double x){
        return Math.sqrt(1.0 - Math.pow(sin.calculate(x), 2));
    }
}
