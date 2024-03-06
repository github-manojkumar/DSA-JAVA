package DSA_Java.Queues.Resources;

public interface IQueue {
    public void enqueue(int data);
    public int dequeue();
    public int size();
    public boolean isEmpty();
    public void display();

    public int peek();
}
