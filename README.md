# Statistical Data Analysis Tool

A Java-based tool for analyzing statistical data from text files. This tool provides functionality for reading data, performing statistical calculations, and implementing custom data structures.

## Features

- File reading and data extraction
- Statistical calculations (mean, standard deviation)
- Custom LinkedList implementation
- Data processing utilities

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

### Prerequisites

Before you begin, ensure you have the following installed:

- Java 17 or higher
- Maven 3.6 or higher
- Git

To check your Java version:
```bash
java -version
```

To check your Maven version:
```bash
mvn -version
```

### Installing

1. Clone the repository:
```bash
git clone https://github.com/Daniel-Aldana10/OO-Design
cd OO-Design
```

2. Build the project:
```bash
mvn clean package
```

## Usage Examples

The main application processes data from a text file and performs statistical calculations:

```java
// Example usage in Main.java
Path filePath = Path.of("src/main/resources/data.txt");
List<Double> column1 = FileReader.readColumn(filePath, 0);
List<Double> column2 = FileReader.readColumn(filePath, 1);

Calculator calculator = new Calculator();
double mean1 = calculator.calculateMean(column1);
double stdDev1 = calculator.calculateStandardDeviation(column1);
```

## Project Structure

```
src/main/java/edu/
├── Main.java           # Main application class
├── FileReader.java     # File reading utilities
├── Calculator.java     # Statistical calculations
└── LinkedList.java     # Custom LinkedList implementation
```

## Components

### FileReader
- Utility class for reading and processing data from files
- Supports reading specific columns from space-separated text files
- Handles numerical data conversion

### Calculator
- Provides statistical calculation methods
- Implements mean and standard deviation calculations
- Handles edge cases (empty lists, null values)

### LinkedList
- Custom implementation of a singly linked list
- Implements the List interface
- Supports generic types
- Provides basic list operations

## Running the Tests

To run the tests:
```bash
mvn test
```

## Documentation

### Javadoc Documentation
To generate the documentation:
```bash
mvn javadoc:javadoc
```

The generated documentation will be available in:
```
target/site/apidocs/
```

## Design

The project follows object-oriented design principles:
- Separation of concerns
- Single responsibility principle
- Interface-based design
- Generic type support

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Versioning

We use SemVer for versioning. For the versions available, see the tags on this repository.

## Authors

* **Daniel Aldana** - [GitHub](https://github.com/Daniel-Aldana10)

## License

This project is licensed under the MIT License - see the LICENSE file for details.
