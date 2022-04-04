package tpo.lab2;

import tpo.lab2.trig.*;
import static java.lang.Math.PI;

import tpo.lab2.logariphm.*;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        final double TEST_ACCURACY = 0.0001;
        CsvPrinter csvPrinter = new CsvPrinter();
        csvPrinter.setPath("src/main/resources/");

        Sin sin = new Sin(TEST_ACCURACY);
        csvPrinter.write("sin.csv", sin, 0, PI, PI/8);

        Cos cos = new Cos(TEST_ACCURACY);
        csvPrinter.write("cos.csv", cos, 0, PI, PI/8);

        Tan tan = new Tan(TEST_ACCURACY);
        csvPrinter.write("tan.csv", tan, 0, PI, PI/8);

        Sec sec = new Sec(TEST_ACCURACY);
        csvPrinter.write("sec.csv", sec, 0, PI, PI/8);

        Csc csc = new Csc(TEST_ACCURACY);
        csvPrinter.write("csc.csv", csc, 0, PI, PI/8);

        Ln ln = new Ln(TEST_ACCURACY);
        csvPrinter.write("ln.csv", ln, 0, 4, 0.1);

        Log_2 log2 = new Log_2(TEST_ACCURACY);
        csvPrinter.write("log2.csv", ln, 0, 4, 0.1);

        Log_5 log5 = new Log_5(TEST_ACCURACY);
        csvPrinter.write("log5.csv", ln, 0, 10, 0.2);

        Log_10 log10 = new Log_10(TEST_ACCURACY);
        csvPrinter.write("log10.csv", ln, 0, 15, 0.3);

        VariantFunction function = new VariantFunction(TEST_ACCURACY);
        csvPrinter.write("function.csv", function, -3, 3, 0.5);
    }
}
