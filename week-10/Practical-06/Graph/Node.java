//Student ID: a1806522
//Student Name: Zhuofan Zhang
public class Node {
    private int index;

    public Node(int index) {
        super();
        this.index = index;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void printNode() {
        System.out.print("Node: "+index);
    }
}