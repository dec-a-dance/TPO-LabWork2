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
        if (val<=2){
            return 1;
        }
        long result = 1;
        for (int i = 2; i<=val; i++){
            result*=i;
        }
        return result;
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
