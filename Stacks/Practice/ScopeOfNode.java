package DSA_Java.Stacks.Practice;
/*
class Test{
//    Node head;//can't resolve a symbol
    ScopeOfNode.Node head;//this is working
    public void addNode(int data){
//        ScopeOfNode.Node nn=new Node();
        //not working
    }
}
*/
public class ScopeOfNode {
    class Node{
        int data;
        Node next;
        Node(){
        }
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
//        Node n=new Node();
//       we can't access from static context
    }

}
