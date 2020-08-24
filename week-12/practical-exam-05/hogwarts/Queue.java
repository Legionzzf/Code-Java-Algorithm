/*==================================
Foundations of Computer Science
Student: Zhuofan Zhang
id: a1806522
Semester:1
Year:2020
Practical Exam Number:05
===================================*/
class Queue {
//private Node front; // points to the first element in queue
private Node back; // or rear, points to the last element in queue

public Queue() {
    this.back = null;
    }   
public Node getBack() { //getters and setters
    return back;
    }
public void setBack(Node back) {
    this.back = back;
    }
// Add element to the back
public void enqueue(Student tmpStudent) {
        Node newNode = new Node(tmpStudent);
        newNode.setNext(this.back);
        this.back = newNode;
    }
// Remove element from the front
public void dequeue() {
// Check if it's empty
if (this.back == null) {
        System.out.println("Can't remove, queue is empty");
    } else if (this.back.getNext() == null) { // if have only one element in queue
        this.back = null;
    } else {
    Node tmp = this.back;
// Traverse queue until we reach the second element
    while (tmp.getNext().getNext() != null) {
        tmp = tmp.getNext();
        }
// Remove first element
    tmp.setNext(null);
    }
}
public void displayQueue() {
// Check if it's empty
    int index = 0;
    if (this.back == null) {
    System.out.println("");
    } else {
        Node tmp = this.back;
        while(tmp != null) {
        index++;
    if(tmp.getInfo().getPeriod()==1) {
        System.out.printf("#%d %s, %d years old, %dst year in Hogwarts;\n", index, tmp.getInfo().getName(), tmp.getInfo().getAge(), tmp.getInfo().getPeriod());
        tmp = tmp.getNext();
    }else if(tmp.getInfo().getPeriod()==2) {
        System.out.printf("#%d %s, %d years old, %dnd year in Hogwarts;\n", index, tmp.getInfo().getName(), tmp.getInfo().getAge(), tmp.getInfo().getPeriod());
        tmp = tmp.getNext();
    }else {
        System.out.printf("#%d %s, %d years old, %drd year in Hogwarts;\n", index, tmp.getInfo().getName(), tmp.getInfo().getAge(), tmp.getInfo().getPeriod());
        tmp = tmp.getNext();
        }
    }
    System.out.println();
        }
    }
}