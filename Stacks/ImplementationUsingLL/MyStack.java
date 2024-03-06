package DSA_Java.Stacks.ImplementationUsingLL;
import DSA_Java.Stacks.Resources.IMyStack;

public class MyStack implements IMyStack{
    class Node{
        int data;
        Node next;
        Node(){
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    int countSize;
    private boolean isUnderflow(){
        return (head==null);
    }
    @Override
    public void push(int data){
        Node newNode=new Node(data);
        if(this.head!=null){
            newNode.next=head;
        }
        head=newNode;
        this.countSize++;
    }
    @Override
    public int pop(){
        if(isUnderflow()){
            System.out.println("Underflow condition, stack is empty");
            return -1;
        }
        this.countSize--;
        int elem=head.data;
        head=head.next;
        return elem;
    }
    @Override
    public void display(){
        if(isUnderflow()){
            System.out.println("Underflow condition, stack is empty");
            return;
        }
        Node curr=head;
        System.out.print("Top : ");
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null){System.out.print(" <-- ");}
            curr=curr.next;
        }
        System.out.println();
    }
    @Override
    public int size(){
        return this.countSize;
    }
    @Override
    public boolean isEmpty(){
        return (head==null);
    }

    @Override
    public int peek(){
        if(isUnderflow()){
            System.out.println("Stack is empty!!");
            return -1;
        }
        return head.data;
    }
}
