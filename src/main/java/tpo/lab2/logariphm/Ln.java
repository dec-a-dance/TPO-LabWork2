package tpo.lab2.logariphm;

import tpo.lab2.AbstractFunction;

public class Ln extends AbstractFunction {

    public Ln(double accuracy) {
        super(accuracy);
    }

    private double lnTailor (double x, int n){
        return Math.pow(-1, n-1) * Math.pow(x - 1, n) / n;
    }

    @Override
    public double calculate(double x) {
        if(x <= 0)
            throw new ArithmeticException("X is not valid for ln function");
        if(x == 1)
            return 0;
        if(x > 2) return calculate(x / 2.0) + calculate(2.0);

        double previous = 0.0;
        double result = 0.0;
        double current = 5;
        int i = 1;

        while (Math.abs(previous - current) >= accuracy) {
            previous = current;
            current = lnTailor(x, i);
            result += current;
            i++;
        }

        return result;
    }
}
