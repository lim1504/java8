package java0829;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // 순서를 보장하는 queue
        Queue testQueue = new PriorityQueue<>();
        testQueue.offer(1);
        testQueue.offer(4);
        testQueue.offer(6);
        testQueue.offer(2);
        testQueue.offer(3);

        Object obj = null;
        while ((obj = testQueue.poll()) != null) {
            System.out.println(obj);
        }
    }
}
