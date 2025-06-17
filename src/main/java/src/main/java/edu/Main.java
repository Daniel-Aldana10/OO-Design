package src.main.java.edu;

import java.nio.file.Path;
import java.util.List;
import src.main.java.edu.*;

/**
 * Main class that serves as the entry point for the application.
 * This class demonstrates the usage of FileReader and Calculator classes
 * to process data from a file and perform statistical calculations.
 */
public class Main {

    /**
     * Main method that executes the program.
     * Reads data from a file, performs statistical calculations,
     * and displays the results for two columns of data.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            Path filePath = Path.of("src/main/resources/data.txt");

            List<Double> column1 = FileReader.readColumn(filePath, 0);
            List<Double> column2 = FileReader.readColumn(filePath, 1);

            Calculator calculator = new Calculator();

            double mean1 = calculator.calculateMean(column1);
            double stdDev1 = calculator.calculateStandardDeviation(column1);

            double mean2 = calculator.calculateMean(column2);
            double stdDev2 = calculator.calculateStandardDeviation(column2);

            System.out.printf("Column 1 -> Mean: %.2f, StdDev: %.2f%n", mean1, stdDev1);
            System.out.printf("Column 2 -> Mean: %.2f, StdDev: %.2f%n", mean2, stdDev2);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}