/*==================================
Foundations of Computer Science
Student: Zhuofan Zhang
id: a1806522
Semester:1
Year:2020
Practical Exam Number:5
===================================*/
class Node {
    //properties
    public Student info;
    public Node next;

    //Basic constructor
    public Node(){

    }
    public Node(Student tmpStudent){
        this.info = tmpStudent;
    }
    //Set accessors and mutator for all properties
    public Student getInfo() {
        return info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
