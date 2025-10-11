package Collections;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(10);
        pq.add(40);
        pq.add(5);

        System.out.println("PriorityQueue elements: " + pq);
        System.out.println("Head (smallest): " + pq.peek());

        pq.remove();
        System.out.println("After removing head: " + pq);
    }
}

