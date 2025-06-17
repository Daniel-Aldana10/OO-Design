package src.main.java.edu;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utility class for reading and processing data from files.
 * Provides functionality to extract specific columns of numerical data from text files.
 */
public class FileReader {

    /**
     * Reads a specific column of numerical data from a text file.
     * The file should contain space-separated values.
     *
     * @param path The path to the file to be read
     * @param columnIndex The index of the column to extract (0-based)
     * @return List of Double values from the specified column
     * @throws IOException If there is an error reading the file
     */
    public static List<Double> readColumn(Path path, int columnIndex) throws IOException {
        return Files.lines(path)
                .map(line -> line.trim().split("\\s+")) // separa por espacios
                .filter(parts -> parts.length > columnIndex)
                .map(parts -> {
                    try {
                        return Double.parseDouble(parts[columnIndex]);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                })
                .filter(d -> d != null)
                .collect(Collectors.toList());
    }
}
