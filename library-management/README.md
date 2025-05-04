# Library Management System

This project is a simple Java application designed to manage a collection of books in a library. It utilizes Java 8 features such as Lambda expressions, Method References, and Default methods in interfaces.

## Project Structure

```
library-management
├── src
│   ├── main
│   │   └── java
│   │       ├── Book.java
│   │       ├── BookManager.java
│   │       ├── Library.java
│   │       └── Main.java
│   └── test
│       └── java
│           └── LibraryTest.java
├── pom.xml
└── README.md
```

## Features

- **Book Management**: Add, find, and sort books by title or author.
- **Lambda Expressions**: Used for filtering and sorting books.
- **Method References**: Utilized for printing book details.
- **Default Methods**: Provides a default implementation for printing all books in the `BookManager` interface.

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd library-management
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="Main"
   ```

## Usage

- The application allows users to add new books, find books by author, and sort books by title.
- The main functionality is demonstrated in the `Main` class.

## Testing

Unit tests for the `Library` class can be found in the `LibraryTest.java` file. To run the tests, use:
```
mvn test
```

## Conclusion

This project serves as a practical example of using Java 8's functional programming features in a real-world application. It provides a solid foundation for understanding how to manage collections of objects effectively.