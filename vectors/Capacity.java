import java.util.*;

class Capacity {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5); // Initial capacity of 5
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Capacity before adding another element: " + vector.capacity());
        vector.add(6); // Adding an element will increase the capacity
        System.out.println("Capacity after adding another element: " + vector.capacity());
    }
}
