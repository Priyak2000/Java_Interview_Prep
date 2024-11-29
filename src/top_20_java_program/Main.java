package top_20_java_program;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Enqueue elements
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);

        // Dequeue elements
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
