package Collections;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // duplicate ignored

        System.out.println("TreeSet elements (sorted): " + numbers);
    }
}
