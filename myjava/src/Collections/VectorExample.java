package Collections;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        System.out.println("Vector elements: " + animals);

        animals.remove("Cat");
        System.out.println("After removal: " + animals);

        System.out.println("Element at index 1: " + animals.get(1));
    }
}

