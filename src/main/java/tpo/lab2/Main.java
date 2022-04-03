package tpo.lab2;

import tpo.lab2.trig.*;
import static java.lang.Math.PI;

import tpo.lab2.logariphm.*;

public class Main {
    public static void main(String[] args) {
        final double TEST_ACCURACY = 0.0001;
        CsvPrinter csvPrinter = new CsvPrinter();
        csvPrinter.setPath("src/main/resources/");

        Sin sin = new Sin(TEST_ACCURACY);
        csvPrinter.write("sin.csv", sin, 0, 2*PI, PI/8);

        Cos cos = new Cos(TEST_ACCURACY);
        csvPrinter.write("cos.csv", cos, 0, 2*PI, PI/8);

        Tan tan = new Tan(TEST_ACCURACY);
        csvPrinter.write("tan.csv", tan, 0, 2*PI, PI/8);

        Sec sec = new Sec(TEST_ACCURACY);
        csvPrinter.write("sec.csv", sec, 0, 2*PI, PI/8);

        Csc csc = new Csc(TEST_ACCURACY);
        csvPrinter.write("csc.csv", csc, 0, 2*PI, PI/8);

        //todo add logs

        VariantFunction function = new VariantFunction(TEST_ACCURACY);
        csvPrinter.write("variant.csv", function, 0, 2*PI, PI/8);
    }
}
