package DSA_Java.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    Node head;
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
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){System.out.print(" -> ");}
            temp=temp.next;
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
    }
    public int getSize(){
        return this.size;
    }
    public void insertAtStart(int data){
        /*
            - Insert element at the starting of the node
            - step 1: create a new node with data, initially it is pointing to null
            - Step 2: make new node point to the start of the linked list i.e. by pointing to head
            - Step 3: now update head by pointing it to newNode
         */
        Node node= new Node(data);
        node.next=this.head;
        this.head=node;
        updateSize(true);
    }
    public void updateSize(boolean flag){
        if(flag) {this.size+=1;}
        else{this.size-=1;}
    }
    public void insertAtEnd(int data){

        /*
            - Inserting at the end of the linked list
            - Step 1: If list is empty means insert it at start, insert the node and head starts pointing to this node
                    : when head is null, means linked list is empty
            - Step 2: If list is not empty, firstly create a temp node pointing to head,
            - Step 3: Now move head node to the last of the element, when node.next==null means we reach the last
            - Step 4: Now make temp node.next point to the new node, to link the new node with created linked list
         */
        Node node= new Node(data);
        node.data=data;
        if(head!=null){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }else{
            head=node;
        }

        updateSize(true);

    }
    public void insertAtMiddle(int data,int idx){

        /*
            - If the idx is 1, that means we want to insert at first position, call insertAtStart method
            - Otherwise do the following
            - Step 1: Create a temp node pointing to head
            - Step 2: Move temp node to start pointing to the node before which we want to insert
                    : if we want to insert at idx 2, means at second idx, then our temp should be at first idx
                    : and it's next is pointing to element at second idx
            - Step 3: Now make new node also points to the second element i.e. node.next = temp.next
            - Step 4: Now make temp node points to the new node i.e. temp.next=node;
         */
        if(idx<0){return;}
        if(idx==0){insertAtStart(data);}
        else{
            Node node=new Node(data);
            Node temp=this.head;
            //moving in linked list
            for(int i=1;i<idx;i++){
                if(temp==null){
                    System.out.println("Insertion Failed, Invalid Position");
                    return;
                }else{
                    temp=temp.next;
                }
            }
            node.next=temp.next;
            temp.next=node;
            updateSize(true);
        }
    }
    public boolean isUnderflow(){
        return head == null;
    }
    public int deleteFromStart(){
        /*
            - To delete element from the start do the following :
            - Step 1: check if linked list is empty or not, underflow condition, how? by checking if head == null or not
            - Step 2: Now make head points to the next element, it will remove the link of first element means deleted
         */
        if(isUnderflow()){
            return -1;
        }
        int removedData=head.data;
        head=head.next;
        updateSize(false);
        return removedData;
    }
    public int deleteFromEnd(){
        /*
            - To delete element from the end do the following :
            - Step 1: check if linked list is empty or not, underflow condition, how? by checking if head == null or not
            - Step 2: declare a temp node which is pointing to head
            - Step 3: Move temp node to the second last element, how
                    : At last element, temp.next=null
                    : At second last element, temp.next.next=null, means from second last element
                      we are checking in last element whether it is pointing to null or not
                - One corner case, it will work fine for elements more than 2, so to check if we have only one elements
                  we will use if head->next or temp->next => null means we have only one element
            - Step 4: Make temp node to point to null
         */
        if(isUnderflow()){
            System.out.println("Underflow condition, ");
            return -1;
        }
        Node temp=head;
        int removedData;
        updateSize(false);
        if(temp.next==null){
            removedData=head.data;
            head=null;
            return removedData;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        removedData=temp.next.data;
        temp.next=null;
        return removedData;
    }
    public int deleteFromMiddle(int idx){

        /*
            - If the pos is 0, that means we want to delete from first position, call insertAtStart method
            - Otherwise do the following
            - Step 1: Create a temp node pointing to head
            - Step 2: Move temp node to start pointing to the node before which we want to insert
                    : if we want to insert at pos 2, means at second idx, then our temp should be at first idx
                    : and it's next is pointing to element at second idx
            - Step 3: Now make new node also points to the second element i.e. node.next = temp.next
            - Step 4: Now make temp node points to the new node i.e. temp.next=node;
         */
        if(idx<0){return -1;}
        if(idx==0){return deleteFromStart();}
        else{
            Node temp=this.head;
            //moving in linked list
            for(int i=1;i<idx;i++){
                if(temp==null){
                    System.out.println("Deletion Failed, Invalid Position, Overflow condition");
                    return -1;
                }else{
                    temp=temp.next;
                }
            }
            int removedData=temp.next.data;
            temp.next=temp.next.next;
            updateSize(false);
            return removedData;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList();
//        ll.insertAtMiddle(100,1);
        ll.insertAtEnd(5);
        ll.insertAtStart(10);
        ll.insertAtEnd(20);
        ll.insertAtStart(30);
//        ll.insertAtEnd(40);
//        ll.insertAtStart(50);
//        ll.insertAtEnd(60);
//        ll.insertAtStart(70);
//        ll.insertAtMiddle(555,5);
//        ll.insertAtMiddle(666,5);
        ll.display();
        System.out.println("Size -> "+ll.getSize());
        System.out.println("Deleting ...");
        System.out.println(ll.deleteFromMiddle(2));
        ll.insertAtStart(5);
        System.out.println( ll.deleteFromMiddle(1));
        ll.insertAtMiddle(30,3);
//        ll.deleteFromEnd();
//        ll.deleteFromStart();
        ll.display();
        System.out.println( ll.deleteFromMiddle(3));

        ll.display();
        System.out.println("Size -> "+ll.getSize());
    }
}
