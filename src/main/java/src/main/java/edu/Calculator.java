package src.main.java.edu;

import java.util.List;

public class Calculator {
    public double calculateMean(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0.0;

        double sum = numbers.stream()
                .reduce(0.0, Double::sum);
        return sum / numbers.size();
    }
    public double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.size() < 2) return 0.0;

        double mean = calculateMean(numbers);

        double squaredDiffSum = numbers.stream()
                .map(x -> Math.pow(x - mean, 2))
                .reduce(0.0, Double::sum);

        return Math.sqrt(squaredDiffSum / (numbers.size() - 1));
    }
}
