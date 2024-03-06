package DSA_Java.LinkedList.CircularLinkedList;

public class CircularDoublyLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node() {
        }

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.next = next;
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        newNode.prev = this.tail;
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            this.head = newNode;
        }
        updateSize(true);
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            insertAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
            updateSize(true);
        }
    }

    public void insertAtPos(int data, int pos) {
        String invalidPos = "Invalid Position";
        if (pos < 0 || (head == null && pos > 1)) {
            System.out.println(invalidPos);
            return;
        }
        if (pos == 0 || head == null) {
            insertAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            int count = 0;
            Node curr = new Node(-1);
            curr.next = head;
            while (count < pos && curr != null) {
                count++;
                curr = curr.next;
            }
            if (curr != null) {
                newNode.next = curr.next;
                newNode.prev = curr;
                curr.next = newNode;
                updateSize(true);
            } else {
                System.out.println(invalidPos);
            }
        }
    }

    public int deleteFromBeginning() {
        int elem = -1;
        if (head != null) {
            elem=this.head.data;
            if(this.head.next==null){
                this.head=null;
                this.tail=null;
            }else{
                Node tmp=this.head.next;
                this.head.prev=null;
                this.head.next=null;
                this.head=tmp;
                this.head.prev=this.tail;
                this.tail.next=this.head;
            }
            updateSize(false);
        }
        return elem;
    }

    public int deleteFromPos(int pos) {
        int elem = -1;
        if (head == null || pos < 0) {
            System.out.println("Invalid position");
        } else if (pos == 0) {
            elem = deleteFromBeginning();
        } else {
            int count = 0;
            Node curr = new Node(-1);
            curr.next = head;
            while (count < pos && curr.next != null) {
                count++;
                curr = curr.next;
            }

            elem = (curr.next != null) ? curr.next.data : -1;
            curr.next = (curr.next != null) ? curr.next.next : null;
            curr.next.prev = curr;

            if (elem != -1) {
                updateSize(false);
            }
        }
        return elem;
    }

    public int deleteFromEnd() {
        int elem = -1;
        if (head != null) {
            elem = this.tail.data;
            if (head.next == null) {
                this.head = null;
                this.tail=null;
            } else {
                Node tmp=this.tail;
                this.tail=tail.prev;
                tmp.next=null;
                tmp.prev=null;
                this.tail.next=head;
                head.prev=tail;
            }
            updateSize(false);
        }
        return elem;
    }

    public void display() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        Node curr = head;
        do{
            if(curr!=null) {
                System.out.print(curr.data);
                System.out.print(" -> ");
                curr = curr.next;
            }
        }while(curr!=head && curr!=null);
        System.out.print("head");
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

    public void updateSize(boolean flag) {
        if (flag) {
            this.size += 1;
        } else {
            this.size -= 1;
        }
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        CircularDoublyLL ll = new CircularDoublyLL();
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(5);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);
        ll.display();
        System.out.println("Size -> " + ll.getSize());
        System.out.println(ll.deleteFromBeginning());
        ll.display();
        System.out.println(ll.deleteFromEnd());
        ll.display();
        System.out.println("Size -> " + ll.getSize());

    }
}
