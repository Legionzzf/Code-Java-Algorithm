//Student ID: a1806522
//Student Name: Zhuofan Zhang
import java.util.Random;
public class MyBST {
    // The reference to the root node in this tree
    private Node root;
    // You should initialise an empty tree in the constructor.
    public MyBST() {
        root = null;
    }

    // Insert a new value into the tree. This method calls insertRec()
    public void insert(int value)
    {
        root = insertRec(root,value);
    }
    // This is a recursive function to insert a new value in the tree.
    private Node insertRec(Node current, int value) {
        if(current == null) {
            current = new Node(value);
            return current;
        }

        if(value < current.getData()) {
            current.setLeft(insertRec(current.getLeft(),value));
        }
        else if(value > current.getData()) {
            current.setRight(insertRec(current.getRight(),value));
        }
        else {
            System.out.println("\nNode: "+value+" is in the tree");
        }
        return current;
    }

    // Search a node in the tree. This method calls searchRec()
    public boolean search(int value) {
        return searchRec(root,value);
    }

    // This is a recursive function to search a node in the tree.
    private boolean searchRec(Node current, int value) {
        if(current == null) {
            return false;
        }
        else if(current.getData() == value) {
            return true;
        }

        if(value < current.getData()) {
            return searchRec(current.getLeft(),value);
        }
        else if(value > current.getData()) {
            return searchRec(current.getRight(),value);
        }
        return false;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    public void inorderRec(Node current) {
        if(current != null) {
            inorderRec(current.getLeft());
            System.out.print(current.getData()+" ");
            inorderRec(current.getRight());
        }
    }
    public static void main(String[] args) {
        MyBST bst = new MyBST();
        Random random = new Random();
        int val = 0;
        for(int i = 0;i<10;i++) {
            val = random.nextInt(10);
            System.out.println("Inserting val: "+val);
            bst.insert(val);
        }
        System.out.println("\nInorder traversal of bst");
        bst.inorder();

        System.out.println("Is "+val+" in BST: "+bst.search(val));

        System.out.println("Is 12 in BST: "+bst.search(12));
    }
}
