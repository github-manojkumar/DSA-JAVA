package DSA_Java.Tree.BinaryTree.Implementation.UsingNode;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        tree.root.right.right=new Node(70);

        System.out.println("Height : "+tree.height(tree.root));
        System.out.println("Search 60 -> "+tree.search(tree.root,60));
        System.out.println("Search 60 -> "+tree.search(tree.root,90));
        System.out.println("Preorder : ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Inorder : ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Postorder : ");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("BFS : ");
        tree.BFS(tree.root);

    }
}
