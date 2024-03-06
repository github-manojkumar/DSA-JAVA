package DSA_Java.Tree.BinaryTree.Implementation.UsingNode;

import java.util.ArrayDeque;
import java.util.Stack;

public class BinaryTree {
    Node root;

    public void insert(int data){
        Node newNode=new Node(data);
        if(this.root==null){
            root=newNode;
        }

    }

    public int height(Node root){
        if(root==null){
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public boolean search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val) return true;
        boolean leftAns=search(root.left,val);
        boolean rightAns=search(root.right,val);
        return (leftAns||rightAns);
    }

    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void preorderIterative(Node root){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr=stack.pop();
            System.out.println(curr.data);
            if(curr.right!=null){stack.push(curr.right);}
            if(curr.left!=null){stack.push(curr.left);}
        }
    }

    public void BFS(Node root){
        ArrayDeque<Node> queue=new ArrayDeque<>();

        if(root!=null){ queue.add(root);}

        while(!queue.isEmpty()){
            Node curr=queue.remove();

            if(curr.left!=null) { queue.add(curr.left);}
            if(curr.right!=null){ queue.add(curr.right);}

            System.out.print(curr.data+" ");
        }
    }

}
