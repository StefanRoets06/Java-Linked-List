# Java Linked List

This project provides a basic implementation of a singly linked list in Java. It includes functionalities for appending, prepending, inserting, deleting, retrieving values, searching, and getting the size of the list.

You can explore and test the functionality of this linked list implementation using the provided `Test.java` file. Alternatively, a pre-built `linkedlist-utils.jar` file is available in the [GitHub Releases](https://github.com/StefanRoets06/Java-Linked-List/releases) for easy integration into your Java projects.

## Overview

The linked list is implemented using two classes:

-   `ListItem`: Represents a single node in the linked list. Each node contains:
    -   `data`: An `Object` to store the actual data.
    -   `link`: A reference to the next `ListItem` in the list.
    -   `index`: An integer representing the index of the item in the list.
-   `List`: Represents the linked list itself. It maintains a `headNode` which is a dummy node to simplify list operations.

## Features

The `List` class provides the following methods:

-   `appendToList(Object data)`: Adds a new element with the given `data` to the end of the list.
-   `prependToList(Object data)`: Adds a new element with the given `data` to the beginning of the list.
-   `insertInList(int index, Object data)`: Inserts a new element with the given `data` at the specified `index`.
-   `delete(int index)`: Removes the element at the specified `index` from the list.
-   `value(int index)`: Retrieves the data of the element at the specified `index`. Returns `null` if the index is out of bounds.
-   `searchList(Object data)`: Searches for the first occurrence of the given `data` and returns its index. Throws a `NoSuchElementException` if the data is not found.
-   `size()`: Returns the total number of elements in the list.

## Getting Started

**Option 1: Using the JAR file**

1.  **Download `linkedlist-utils.jar`** from the [GitHub Releases](https://github.com/StefanRoets06/Java-Linked-List/releases).
2.  **Include the JAR file** in your Java project's dependencies. This process varies depending on your build tool (e.g., Maven, Gradle) or IDE.

    * **For manual inclusion in an IDE (like IntelliJ IDEA or Eclipse):** Add the JAR file to your project's classpath.

3.  **Import the `List` class** in your Java code:

    ```java
    import utils.linkedlist.List;
    ```

4.  **Create an instance of the `List` class**:

    ```java
    List myList = new List();
    ```

5.  **Use the available methods** to manipulate the linked list as shown in the next section.

**Option 2: Using the source code**

1.  **Clone the repository** or simply copy the `utils.linkedlist` package.

2.  **Ensure the `utils.linkedlist` package** is in your project's source directory.

3.  **Import the `List` class**:

    ```java
    import utils.linkedlist.List;
    ```

4.  **Create an instance of the `List` class**:

    ```java
    List myList = new List();
    ```

5.  **Use the available methods** to manipulate the linked list:

    ```java
    myList.appendToList("Apple");
    myList.appendToList("Banana");
    myList.prependToList("Mango");
    myList.insertInList(1, "Orange");

    System.out.println("Size of the list: " + myList.size()); // Output: 4
    System.out.println("Value at index 2: " + myList.value(2)); // Output: Banana
    System.out.println("Index of 'Orange': " + myList.searchList("Orange")); // Output: 1

    myList.delete(0);
    System.out.println("Size after deletion: " + myList.size()); // Output: 3
    ```

6.  **Testing (Optional):** If you chose Option 2, you can compile and run `Test.java` to see examples of how to use the `List` class and verify its functionality.

    ```bash
    javac Test.java
    java Test
    ```

## Contributing

Contributions to this project are welcome. Feel free to submit issues or pull requests for bug fixes or enhancements.

## License

MIT License

Copyright (c) 2025 Stefan Roets