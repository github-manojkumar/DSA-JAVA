package DSA_Java.Tree.BinarySearchTree.Implementation;

public class Node {
    public Node left;
    public Node right;
    public int data;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
