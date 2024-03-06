package DSA_Java.Tree.BinarySearchTree.Implementation;


import java.util.ArrayDeque;

public class BST {
    
    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int key) {
        this.root = insertInBST(this.root, key);
    }

    private Node insertInBST(Node node,int data){
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.left=insertInBST(node.left,data);
        }
        else if(data>=node.data){
            node.right=insertInBST(node.right,data);
        }
        return node;
    }

    public void delete(int value){
        this.root=deleteFromTree(this.root,value);
    }

    private Node findMinimum(Node root){
        if(root==null) return null;
        if(root.left!=null){
            return findMinimum(root.left);
        }
        return root;
    }

    private Node deleteFromTree(Node node,int key){
        if(node==null) return null;

        /*
            Three cases :
            1. If node to be deleted is leaf node i.e. left and right child are null
            2. If node to be deleted has single child
            3. If node to be deleted has both the child
         */

        if(key<node.data){
            node.left=deleteFromTree(node.left,key);
        }else if(key>node.data){
            node.right=deleteFromTree(node.right,key);
        }else{
            //case 1 -> zero child
            if(node.left==null && node.right==null){
                return null;
            }
            //case 2 -> one child
            else if(node.left==null || node.right==null){
                Node temp;
                if(node.left==null){
                    temp=node.right;
                }else{
                    temp=node.left;
                }
                return temp;
            }
            //case 3 -> two child
            else{
                Node nextInorder=findMinimum(root.right);
                node.data=nextInorder.data;
                node.right=deleteFromTree(node.right,nextInorder.data);
            }
        }
        return node;
    }

    public int height(){
        return heightOfTree(this.root);
    }
    private int heightOfTree(Node root){
        if(root==null){
            return -1;
        }
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        return Math.max(lh,rh)+1;
    }

    public boolean search(int key){
        return searchInBST(this.root,key);
    }
    private boolean searchInBST(Node root, int key){
        if(root==null) return false;
        if(key==root.data) return true;

        boolean ans=false;
        if(key<root.data) {
            ans=searchInBST(root.left,key);
        }
        else if(key>root.data) {
            ans=searchInBST(root.right,key);
        }
        return ans;
    }

    public void preorder(){
        preorderTraversal(this.root);
    }
    private void preorderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void inorder(){
        inorderTraversal(this.root);
    }
    private void inorderTraversal(Node root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    public void postorder(){
        postorderTraversal(this.root);
    }
    private void postorderTraversal(Node root){
        if(root==null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public void binarySearchBST(){
        binarySearchBSTAlgo(this.root);
    }
    private void binarySearchBSTAlgo(Node root){
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
