class MyStack {
    private Node top; //head node

    //getter
    public Node getTop() {
        return this.top;
    }

    //setter
    public void setTop(Node top) {
        this.top = top;
    }

    //basic constructor
    public MyStack() {
        this.top = null;
    }

    //constructor with parameters
    public MyStack(Node top) {
        this.top = top;
    }

    // Push a node into stack
    public void push(Node node) {
        if (this.top == null) {
            this.setTop(node);
        } else {
            node.setNext(this.top);
            this.setTop(node);
        }
    }

    // pop node from stack
    public Node pop() {
        if (this.top != null) {
            Node top = this.top;
            this.top = this.top.getNext();
            return top;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public Node peek() {
        if (top != null) {
            return this.top;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    //boolean method to chekc stack is empty orn ot
    public boolean isEmpty() {
        if (this.top != null) {
            return false;
        } else {
            System.out.println("Stack is empty");
            return true;
        }
    }

    //dusplay stack
    public void displayStack(MyStack stack){
        if(stack.getTop()==null){
            System.out.println("Stack is empty");
        } else{
            Node tempNode = stack.getTop();
            while(tempNode!=null){
                tempNode.printNode();
                tempNode=tempNode.getNext();
            }
        }
    }
}