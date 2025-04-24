# Java Linked List

This project provides a basic implementation of a singly linked list in Java. It is designed to support generic types, making it flexible and versatile for different use cases. The linked list includes functionalities such as appending, prepending, inserting, deleting, retrieving values, searching, and determining the size of the list.

## Features

- **Generic Support**: The linked list can store any data type, such as strings, integers, doubles, or custom objects.
- **Full CRUD Operations**: Easily add, insert, delete, and retrieve elements in the list.
- **Robust Error Handling**: Handles invalid indices and other edge cases gracefully.
- **Lightweight and Extensible**: The implementation is compact, easy to understand, and can be extended for additional functionalities.

## How to Use the Source Code

1. Clone the repository to your local machine:
   - Use the `git clone` command with the repository URL to download the project.

2. Compile the source code:
   - Navigate to the `src` directory and compile the Java files using a Java compiler (e.g., `javac`).

3. Run the test class:
   - The `Test` class demonstrates the linked list's functionalities. You can execute it to observe example operations such as adding, deleting, and searching elements.

4. Modify as needed:
   - You can create your own Java classes to utilize the `List` class. Import it into your project and use its methods to manage your data.

## How to Use the Precompiled JAR Package

If you prefer not to work with the source code directly, you can use the precompiled JAR package available in the releases section of this repository.

1. **Download the JAR**:
   - Visit the [Releases](https://github.com/StefanRoets06/Java-Linked-List/releases) page of this repository and download the latest JAR file.

2. **Add the JAR to Your Project**:
   - In your Java project, include the JAR file in your build path or classpath. This can be done through your IDE (e.g., IntelliJ IDEA, Eclipse) or by using a build tool like Maven or Gradle.

3. **Import the Linked List Class**:
   - Import the `List` class from the package `utils.linkedlist` into your Java code. Once imported, you can create and manipulate linked lists with the provided methods.

4. **Using the Linked List**:
   - Create an instance of the `List` class for your desired data type (e.g., `List<String>`, `List<Integer>`, or custom objects). Use methods like `appendToList`, `prependToList`, `insertInList`, and `delete` to manage your data.

5. **Run Your Application**:
   - After integrating the JAR and using the linked list in your application, compile and run your program as usual. The linked list functionality will be seamlessly available.

## Example Use Cases

The linked list can be used in various scenarios, such as:

- Storing and processing user input in a dynamic list.
- Managing a queue or stack-like structure where elements are frequently added or removed.
- Keeping track of custom objects (e.g., tasks, contacts) in an application.

## Contributing

Contributions are welcome! If you would like to enhance the linked list or fix any issues, feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License. For more details, refer to the `LICENSE` file in the repository.

© 2025 Stefan Roets. All rights reserved.
