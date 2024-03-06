package DSA_Java.Queues.ImplementingUsingLL;

import DSA_Java.Queues.Resources.IQueue;
import DSA_Java.Queues.Resources.Node;

public class MyQueue implements IQueue {
    Node head;
    Node tail;
    int countSize=0;

    @Override
    public void enqueue(int data) {
        Node newNode=new Node(data);
        newNode.next=null;
        if(this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.next=newNode;
        }
        this.tail=newNode;
        countSize++;
    }

    @Override
    public int dequeue() {
        if(isUnderflow()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int elem=this.head.data;
        this.head=this.head.next;
        countSize--;
        return elem;
    }

    @Override
    public int size() {
        return countSize;
    }
    //to display
    @Override
    public void display(){
        if(isUnderflow()){
            System.out.println("Queue is empty");
            return;
        }
        Node curr=head;
        System.out.print("Front -> ");
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null){
                System.out.print(" -> ");
            }
            curr=curr.next;
        }
        System.out.println(" -> End");
    }

    @Override
    public boolean isEmpty() {
        return (head==null);
    }

    public boolean isUnderflow(){
        return (head==null);
    }

    @Override
    public int peek(){
        if(isUnderflow()){
            System.out.println("Queue is empty.");
            return -1;
        }
        return head.data;
    }
}
