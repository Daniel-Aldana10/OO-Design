package edu;

import org.junit.Test;
import src.main.java.edu.Calculator;
import src.main.java.edu.LinkedList;

import static junit.framework.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testMeanAndStdDevColumn1() {
        LinkedList<Double> data = new LinkedList<>();
        double[] values = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        for (double v : values) {
            data.add(v);
        }
        Calculator calculator = new Calculator();
        double mean = calculator.calculateMean(data);
        double stdDev = calculator.calculateStandardDeviation(data);

        assertEquals(550.6, mean, 0.1);
        assertEquals(572.03, stdDev, 0.1);
    }
    @Test
    public void TestMeanAndStdDevEmpty(){
        LinkedList<Double> data = new LinkedList<>();
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.calculateMean(data));
        assertEquals(0.0, calculator.calculateStandardDeviation(data));
    }
}
