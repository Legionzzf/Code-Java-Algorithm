//Student ID: a1806522
//Student Name: Zhuofan Zhang
public class Node {
    // the data saved in this node
    private int data;
    // the reference to its left child
    private Node left;
    // the reference to its right child
    private Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void printNode()
    {
        System.out.println("Node data: "+data);
    }
}