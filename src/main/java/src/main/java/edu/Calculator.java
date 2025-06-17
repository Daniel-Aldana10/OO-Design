package src.main.java.edu;

import java.util.List;

/**
 * Utility class for performing statistical calculations on numerical data.
 * Provides methods for calculating mean and standard deviation.
 */
public class Calculator {
    /**
     * Calculates the arithmetic mean (average) of a list of numbers.
     *
     * @param numbers List of Double values to calculate the mean from
     * @return The mean value of the numbers, or 0.0 if the list is empty or null
     */
    public double calculateMean(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0.0;

        double sum = numbers.stream()
                .reduce(0.0, Double::sum);
        return sum / numbers.size();
    }
    /**
     * Calculates the standard deviation of a list of numbers.
     * Uses the sample standard deviation formula (n-1 in denominator).
     *
     * @param numbers List of Double values to calculate the standard deviation from
     * @return The standard deviation value, or 0.0 if the list has less than 2 elements or is null
     */
    public double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.size() < 2) return 0.0;

        double mean = calculateMean(numbers);

        double squaredDiffSum = numbers.stream()
                .map(x -> Math.pow(x - mean, 2))
                .reduce(0.0, Double::sum);

        return Math.sqrt(squaredDiffSum / (numbers.size() - 1));
    }
}
