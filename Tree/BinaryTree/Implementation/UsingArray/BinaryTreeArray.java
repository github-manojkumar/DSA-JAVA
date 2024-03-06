package DSA_Java.Tree.BinaryTree.Implementation.UsingArray;

import DSA_Java.Tree.BinaryTree.Implementation.UsingNode.Node;

import java.util.ArrayList;

public class BinaryTreeArray {
    ArrayList<Integer> tree;
    int parentIdx=-1;
    public BinaryTreeArray(int data){
        this.tree=new ArrayList<>();
        this.tree.add(data);
        this.parentIdx=0;
    }

    public void insert(int leftData,int rightData){
        int leftChildIdx=(2*parentIdx)+1;
        int rightChildIdx=(2*parentIdx)+2;
        this.tree.add(leftChildIdx,leftData);
        this.tree.add(rightChildIdx,rightData);
    }
    public void insertLeft(int left){

    }
    public void insertRight(int right){

    }

    public boolean search(Node root,int val){
        return false;
    }

    public void preorder(Node root){

    }

    public void inorder(Node root){

    }

    public void postorder(Node root){

    }

    public void BFS(Node root){

    }
}
