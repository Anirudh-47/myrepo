package Collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Grapes"); // add at beginning
        fruits.addLast("Orange");  // add at end

        System.out.println("LinkedList elements: " + fruits);

        fruits.removeFirst();
        System.out.println("After removing first: " + fruits);
    }
}
