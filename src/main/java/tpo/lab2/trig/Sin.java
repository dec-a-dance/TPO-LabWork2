package tpo.lab2.trig;
import tpo.lab2.AbstractFunction;

import java.math.BigDecimal;

public class Sin extends AbstractFunction{

    public Sin(double accuracy) {
        super(accuracy);
    }

    private double sinTailor(double val, long n) {
        return Math.pow(-1, n) * Math.pow(val, 2 * n + 1) / factorial(2 * n + 1);
    }

    private long factorial(long val) {
        if (val <= 1)
            return 1;
        else
            return val * (factorial(val - 1));
    }

    @Override
    public double calculate(double x){
        double result = 0.0;
        double curr = 10.0;
        double prev = 0.0;
        long n = 0;

        while (Math.abs(prev - curr) >= accuracy) {
            prev = curr;
            curr = sinTailor(x, n);
            result += curr;
            n++;
        }
        return result;
    }
}
