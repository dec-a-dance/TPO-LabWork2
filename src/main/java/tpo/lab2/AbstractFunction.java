package tpo.lab2;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractFunction {
    @Getter
    public final double accuracy;
    public static BigDecimal TRIGONOMETRIC_CALC_ACCURACY = BigDecimal.valueOf(10E-300);
    public static BigDecimal LOGARITHMIC_CALC_ACCURACY = BigDecimal.valueOf(10E-50);

    public AbstractFunction(double accuracy) {
        Objects.requireNonNull(accuracy, "Accuracy should not be NULL");
        if (accuracy <= 0)
            throw new IllegalArgumentException("Accuracy should be greater than zero");
        if (accuracy >= 1)
            throw new IllegalArgumentException("Accuracy should be less than one");
        this.accuracy = accuracy;
    }

    abstract public double calculate(double x);
}
