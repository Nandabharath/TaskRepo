package CollectionFramework_Feb03;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab196 {
    public static void main(String[] args) {
        Queue intergerqueue = new PriorityQueue();
        intergerqueue.offer("A");
        intergerqueue.offer("B");
        intergerqueue.offer("C");
        System.out.println(intergerqueue);
        intergerqueue.poll();
        System.out.println(intergerqueue);
        intergerqueue.peek();
        System.out.println(intergerqueue);

        Iterator i = intergerqueue.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
