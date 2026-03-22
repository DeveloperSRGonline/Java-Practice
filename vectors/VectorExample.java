
import java.util.*;

public class VectorExample {

    public static void main(String[] args) {
// Creating a Vector
        Vector<String> v = new Vector<>();
// Adding elements to the Vector
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
// Display the elements of the vector
        System.out.println("Vector: " + v);
// Accessing elements by index
        System.out.println("Element at index 1: " + v.get(1));
// Inserting an element at a specific index
        v.add(1, "Mango");
        System.out.println("After insertion at index 1: " + v);

// Removing an element from a specific index
        v.remove(2); // Removes the element at index 2

        System.out.println("After removal at index 2: " + v);
// Checking the size of the Vector
        System.out.println("Size of the Vector: " + v.size());
// Checking if the Vector is empty
        System.out.println("Is the Vector empty? " + v.isEmpty());
// Clearing all elements
        v.clear();
        System.out.println("Vector after clearing: " + v);
    }
}
