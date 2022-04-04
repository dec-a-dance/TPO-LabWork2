package tpo.lab2;

import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class CsvPrinter {
    @Setter
    @Getter
    private String path = "src/main/resources/";
    private final char SEPARATOR = ';';

    public void write(String file, AbstractFunction function, double from, double to, double step){
        String fullPath = path + file;
        double y;
        try (PrintStream printStream = new PrintStream(new FileOutputStream(fullPath, true))) {
            for (double x = from; x <= to; x = x + step) {
                try {
                    y = function.calculate(x);
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.err.println(e.getMessage() + ", x=" + x);
                    continue;
                }
                printStream.printf(Locale.US, "%f%c %f\n", x, SEPARATOR, y);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Can't write to file: " + e.getMessage());
        }
    }

}
