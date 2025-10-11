package Collections;

import java.util.*;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Anirudh");
        names.add("Ravi");
        names.add("Anirudh"); // duplicate ignored
        names.add("Kiran");
        names.add(null);

        System.out.println("HashSet elements: " + names);
    }
}
