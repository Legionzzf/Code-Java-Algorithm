public class MyQueue {
    private Node front, rear;

    public MyQueue(){
        front = null;
        rear = null;
    }

    public void enqueue(Node node){
        if(rear == null){
            rear = node;
            front = node;
        }
        else{
            rear.setNext(node);
            rear = node;
        }
    }

    public Node dequeue(){
        if(front == null)
            return null;

        Node frontnode = front;
        front = front.getNext();

        if(front == null)
            rear = null;

        return frontnode;
    }

    public boolean isEmpty(){
        if(front == null)
            return true;
        else
            return false;
    }

    public void displayQueue(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }

        Node start = front;

        while(start != null){
            start.printNode();
            start = start.getNext();
        }
    }
}