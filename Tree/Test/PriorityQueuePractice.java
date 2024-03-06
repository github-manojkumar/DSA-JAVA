package DSA_Java.Tree.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();

        queue.offer(10);
        queue.offer(20);
        System.out.println("Queue => "+queue);
        System.out.println("Peek  => "+queue.peek());
        System.out.println("Poll  => "+queue.poll());


        queue.offer(50);
        queue.offer(30);
        System.out.println("Queue => "+queue);
        System.out.println("Peek  => "+queue.peek());
        System.out.println("Poll  => "+queue.poll());

        queue.offer(10);
        queue.offer(5);
        System.out.println("Queue => "+queue);
        System.out.println("Peek  => "+queue.peek());
        System.out.println("Poll  => "+queue.poll());



    }
}
