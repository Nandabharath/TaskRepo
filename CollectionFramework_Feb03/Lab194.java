package CollectionFramework_Feb03;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab194 {
    public static void main(String[] args) {
        Queue pq1 =new PriorityQueue();
        // FIFO -> 1 -> BOARD THE PLANE, Train
        // A, B, C -> A, B, c

        // Offer - Add
        // PQ  -> Sorted
        pq1.offer(20);
        pq1.offer(12);
        pq1.offer(90);
        pq1.offer(20);
        pq1.offer(99);
       // pq1.offer(null);
        // Offer - Add
        // PQ  -> Sorted

        //pq1.add("bharath");

        System.out.println(pq1);
//        System.out.println(pq1.poll());
//        System.out.println(pq1);
//        System.out.println(pq1.peek());

    }
}
