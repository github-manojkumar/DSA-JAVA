package DSA_Java.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(){}
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.next=next;
            this.data=data;
        }
    }
    Node head;
    int size=0;

    public void insertAtBeginning(int data){
        Node newNode= new Node(data);
        newNode.next=this.head;
        newNode.prev=null;
        if(this.head!=null){
            this.head.prev=newNode;
        }
        this.head=newNode;
        updateSize(true);
    }
    public void insertAtEnd(int data){
        if(head==null){
            insertAtBeginning(data);
        }else{
            Node newNode= new Node(data);
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            newNode.prev=curr;
            curr.next=newNode;
            updateSize(true);
        }
    }
    public void insertAtPos(int data,int pos){
        String invalidPos="Invalid Position";
        if(pos<0 || (head==null && pos>1)){
            System.out.println(invalidPos);
            return;
        }
        if(pos==0 || head == null){insertAtBeginning(data);}
        else{
            Node newNode= new Node(data);
            int count=0;
            Node curr=new Node(-1);
            curr.next=head;
            while(count<pos && curr!=null){
                count++;
                curr=curr.next;
            }
            if(curr!=null){
                newNode.next=curr.next;
                newNode.prev= curr;
                curr.next=newNode;
                updateSize(true);
            }else{
                System.out.println(invalidPos);
            }
        }
    }
    public int deleteFromBeginning(){
        int elem=-1;
        if(head!=null){
            elem=head.data;
            head=head.next;
            head.prev=null;
            updateSize(false);
        }
        return elem;
    }
    public int deleteFromPos(int pos){
        int elem=-1;
        if(head==null || pos<0){
            System.out.println("Invalid position");
        }
        else if(pos==0){
            elem=deleteFromBeginning();
        }
        else{
            int count=0;
            Node curr=new Node(-1);
            curr.next=head;
            while(count<pos && curr.next!=null){
                count++;
                curr=curr.next;
            }

            elem=(curr.next!=null)?curr.next.data:-1;
            curr.next=(curr.next!=null)?curr.next.next:null;
            curr.next.prev=curr;

            if(elem!=-1){updateSize(false);}
        }
        return elem;
    }
    public int deleteFromEnd(){
        int elem=-1;
        if(head!=null){
            if(head.next==null){
                elem=head.data;
                head=null;
            }
            else{
                Node curr=head;
                while(curr.next.next!=null){
                    curr=curr.next;
                }
                elem=curr.next.data;
//                curr.next.prev=null;//no need to remove the link as it is not pointed by any pointer
                curr.next=null;
            }
            updateSize(false);
        }
        return elem;
    }
    public void display(){
        System.out.println("+++++++++++++++++++++++++++++++++");
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
    public void updateSize(boolean flag){
        if(flag) {this.size+=1;}
        else{this.size-=1;}
    }
    public int getSize(){
        return this.size;
    }

    public static void main(String[] args) {
        DoublyLinkedList ll=new DoublyLinkedList();
        ll.insertAtPos(10,0);
        ll.insertAtPos(20,1);
        ll.insertAtPos(5,0);
        ll.insertAtPos(15,2);
        ll.insertAtPos(25,4);
        ll.insertAtPos(30,5);
        ll.insertAtEnd(40);
        ll.insertAtBeginning(1);
        ll.insertAtPos(2,1);
        ll.display();
        System.out.println("Size -> "+ll.getSize());
        System.out.println(ll.deleteFromBeginning());
        System.out.println(ll.deleteFromEnd());
        System.out.println(ll.deleteFromPos(2));
        System.out.println(ll.deleteFromPos(4));
        ll.display();
        System.out.println("Size -> "+ll.getSize());
    }
}
