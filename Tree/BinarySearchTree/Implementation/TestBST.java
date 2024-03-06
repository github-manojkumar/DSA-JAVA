package DSA_Java.Tree.BinarySearchTree.Implementation;

public class TestBST {

    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(20);
        bst.insert(5);
        bst.insert(1);
        bst.insert(15);
        bst.insert(9);
        bst.insert(7);
        bst.insert(12);
        bst.insert(30);
        bst.insert(25);
        bst.insert(40);
        bst.insert(45);
        bst.insert(42);

        bst.delete(1);
        bst.delete(2);


        System.out.println("==============================");

        System.out.print("Preorder : ");
        bst.preorder();
        System.out.println();

        System.out.print("Inorder : ");
        bst.inorder();
        System.out.println();

        System.out.print("Postorder : ");
        bst.postorder();
        System.out.println();

        System.out.print("BST : ");
        bst.binarySearchBST();
        System.out.println();

        System.out.println("==============================");
        System.out.println("Search 25 => "+bst.search(25));
        System.out.println("Search 100 => "+bst.search(100));
        System.out.println("==============================");
        System.out.println("Height => "+bst.height());
        System.out.println("==============================");

    }
}
