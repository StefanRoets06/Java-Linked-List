import utils.linkedlist.List;

public class Test {
    public static void main(String[] args) {
        List<String> myList = new List<>();
        System.out.println("Created a new empty list.");
        System.out.println("Size of the list: " + myList.size());

        myList.appendToList("Apple");
        myList.appendToList("Banana");
        myList.appendToList("Cherry");
        System.out.println("\nAppended 'Apple', 'Banana', and 'Cherry'.");
        System.out.println("Size of the list: " + myList.size());

        System.out.println("Value at index 0: " + myList.value(0));
        System.out.println("Value at index 1: " + myList.value(1));
        System.out.println("Value at index 2: " + myList.value(2));

        myList.prependToList("Grape");
        System.out.println("\nPrepended 'Grape'.");
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Value at index 0: " + myList.value(0));
        System.out.println("Value at index 1: " + myList.value(1));
        System.out.println("Value at index 2: " + myList.value(2));
        System.out.println("Value at index 3: " + myList.value(3));

        myList.insertInList(2, "Orange");
        System.out.println("\nInserted 'Orange' at index 2.");
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Value at index 0: " + myList.value(0));
        System.out.println("Value at index 1: " + myList.value(1));
        System.out.println("Value at index 2: " + myList.value(2));
        System.out.println("Value at index 3: " + myList.value(3));
        System.out.println("Value at index 4: " + myList.value(4));

        System.out.println("\nIndex of 'Banana': " + myList.searchList("Banana"));

        try {
            System.out.println("Index of 'Mango': " + myList.searchList("Mango"));
        } catch (Exception e) {
            System.out.println(e);
        }

        myList.delete(1);
        System.out.println("\nDeleted element at index 1.");
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Value at index 0: " + myList.value(0));
        System.out.println("Value at index 1: " + myList.value(1));
        System.out.println("Value at index 2: " + myList.value(2));
        System.out.println("Value at index 3: " + myList.value(3));

        System.out.println("\nTesting edge cases:");
        try {
            myList.value(-1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            myList.delete(10);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}