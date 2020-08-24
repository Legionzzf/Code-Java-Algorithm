class Node {
    private String data;
    private Node next;

    //getters
    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    //setters
    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //constructor
    Node() {
        this.data = null;
        this.next = null;
    }

    //constructor with parameters
    Node(String data) {
        this.data = data;
        this.next = null;
    }

    //print the data on the node
    public void printNode() {
        System.out.println("Node data: " + this.data);
    }

}
