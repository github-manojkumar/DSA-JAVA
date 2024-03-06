package DSA_Java.LinkedList.CircularLinkedList;


public class CircularSinglyLL {
    Node head;
    Node tail;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void display(){
        System.out.println("------------------------------------------------------");
        Node temp=head;
        do{
            if(temp!=null) {
                System.out.print(temp.data);
                System.out.print(" -> ");
                temp = temp.next;
            }
        }while(temp!=head && temp!=null);
        System.out.print("Head");
        System.out.println();
        System.out.println("------------------------------------------------------");
    }
    public int getSize(){
        return this.size;
    }
    public void insertAtStart(int data){
        Node newNode= new Node(data);
        if(head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            newNode.next=this.head;
            this.head=newNode;
            this.tail.next=this.head;
        }
        updateSize(true);
    }
    public void updateSize(boolean flag){
        if(flag) {this.size+=1;}
        else{this.size-=1;}
    }
    public void insertAtEnd(int data){
        Node newNode= new Node(data);
        if(this.head==null){
            insertAtStart(data);
        }else{
            tail.next=newNode;
            this.tail=newNode;
            this.tail.next=head;
            updateSize(true);
        }
    }
    public void insertAtMiddle(int data,int idx){

        if(idx<0){return;}
        if(idx==0){insertAtStart(data);}
        else{
             Node newNode=new  Node(data);
             Node temp=this.head;
            //moving in linked list
            for(int i=1;i<idx;i++){
                if(temp==null || (temp==tail && (i+1)<idx)){
                    System.out.println("Insertion Failed, Invalid Position");
                    return;
                }else{
                    temp=temp.next;
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
            if(temp==this.tail){
                tail=newNode;
            }
            updateSize(true);
        }
    }
    public boolean isUnderflow(){
        return head == null;
    }
    public int deleteFromStart(){
        if(isUnderflow()){
            return -1;
        }
        int removedData=head.data;
        head=head.next;
        tail.next=head;
        updateSize(false);
        return removedData;
    }
    public int deleteFromEnd(){
        if(isUnderflow()){
            System.out.println("Underflow condition, ");
            return -1;
        }
        Node temp=head;
        int removedData;
        updateSize(false);
        if(temp.next==null){return deleteFromStart();}
        while(temp.next!=this.tail){
            temp=temp.next;
        }
        removedData=temp.next.data;
        temp.next=null;
        tail=temp;
        tail.next=head;
        return removedData;
    }
    public int deleteFromMiddle(int idx){

        if(idx<0){return -1;}
        if(idx==0){return deleteFromStart();}
        else{
            Node temp=this.head;
            //moving in linked list
            for(int i=1;i<idx;i++){
                if(temp.next==null || (temp.next==tail && (i+1)<idx)){
                    System.out.println("Deletion Failed, Invalid Position, Overflow condition");
                    return -1;
                }else{
                    temp=temp.next;
                }
            }

            int removedData=temp.next.data;
            if(temp.next==this.tail){
                this.tail=temp;
            }
            temp.next=temp.next.next;
            updateSize(false);
            return removedData;
        }
    }


    public static void main(String[] args) {
        CircularSinglyLL ll=new CircularSinglyLL();

        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);
        ll.insertAtMiddle(25,4);
        ll.display();

        System.out.println("Deleting...");
        System.out.println(ll.deleteFromStart());
        System.out.println(ll.deleteFromEnd());
        ll.display();
        System.out.println(ll.deleteFromEnd());
        ll.display();
        System.out.println(ll.deleteFromMiddle(1));
        ll.display();
        System.out.println("Size -> "+ll.getSize());

    }
}
