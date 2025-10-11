package Collections;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Chennai"); // duplicate ignored

        System.out.println("LinkedHashSet elements: " + cities);
    }
}
