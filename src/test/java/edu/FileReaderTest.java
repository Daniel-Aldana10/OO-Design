package edu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.edu.Calculator;
import src.main.java.edu.FileReader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

class FileReaderTest {
    @Test
    void testReadFirstColumn() throws IOException {
        Path path = Path.of("src/test/resources/test-data.txt");
        List<Double> column = FileReader.readColumn(path, 0);
        Assertions.assertEquals(10, column.size());
        Assertions.assertEquals(160.0, column.get(0));
        Assertions.assertEquals(591.0, column.get(1));
        Assertions.assertEquals(1503.0, column.get(9));
    }

    @Test
    void testReadSecondColumn() throws Exception {
        Path path = Path.of("src/test/resources/test-data.txt");
        List<Double> column = FileReader.readColumn(path, 1);
        Assertions.assertEquals(10, column.size());
        Assertions.assertEquals(15.0, column.get(0));
        Assertions.assertEquals(69.9, column.get(1));
        Assertions.assertEquals(138.2, column.get(9));
    }
    @Test
    void testNegativeValuesStatistics()throws IOException {
        Path path = Path.of("src/test/resources/Test-data-2.txt");
        List<Double> column1 = FileReader.readColumn(path, 0);
        List<Double> column2 = FileReader.readColumn(path, 1);
        Calculator calculator = new Calculator();
        double mean1 = calculator.calculateMean(column1);
        double std1 = calculator.calculateStandardDeviation(column1);
        double mean2 = calculator.calculateMean(column2);
        double std2 = calculator.calculateStandardDeviation(column2);
        Assertions.assertEquals(-3.2, mean1, 0.01);
        Assertions.assertEquals(7.22, std1, 0.01);
        Assertions.assertEquals(-3.6, mean2, 0.01);
        Assertions.assertEquals(11.08, std2, 0.01);
    }


}
