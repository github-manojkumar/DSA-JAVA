package DSA_Java.Queues.ImplementingUsingLL;

import DSA_Java.Queues.Resources.IQueue;

public class TestMyQueue {

    public static void main(String[] args) {
        IQueue queue=new MyQueue();
        System.out.println("Is Empty "+queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println("Size : "+queue.size());
        System.out.println("Is Empty "+queue.isEmpty());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        queue.display();
        System.out.println("Size : "+queue.size());

    }
}
