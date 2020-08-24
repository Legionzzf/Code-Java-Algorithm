public class WaitingList {
    protected Node head;
    protected int numNodes;
    private int id;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //TODO: Implement this method
        if(this.head == null){
            return null;
        }else{
            Node tmp = head;
            head = (head.getNext());
            tmp.setNext(null);

            return tmp.getPatient();
        }
    }
    public Patient popPatient(int id) {
        //TODO: Implement this method
        if (this.head == null) {
            System.out.println("Can't find this person");
            return null;
        } else if (this.head.getPatient().getId() == id) {
            return popPatient();

        } else {
            Node pre = null;
            Node tmp = head;
            while (tmp != null) {
                pre = tmp;
                tmp = tmp.getNext();

                if (tmp == null) {
                    break;
                }
                if (tmp.getPatient().getId() == id) {
                    pre.setNext(tmp.getNext());
                    return tmp.getPatient();
                }
            }

            return null;
        }
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        Node insert = new Node(patient);
        if(this.head ==null){
            this.head = insert;
            insert.setNext(null);
            this.numNodes++;
        }else{
            Node tmp = head;
            if(patient.getTriageLevel() > tmp.getPatient().getTriageLevel()){
                insert.setNext(head);
                this.head = insert;
                this.numNodes++;
            }else{
                Node pre = null;

                while(patient.getTriageLevel() <= tmp.getPatient().getTriageLevel()){
                    pre = tmp;
                    tmp = tmp.getNext();
                    if(tmp == null){
                        break;
                    }
                }
                pre.setNext(insert);
                insert.setNext(tmp);
                this.numNodes++;
            }
        }
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        //TODO: Implement this method
        if(this.head == null){
            System.out.println("There is not list");

        }else{
            Node tmp =head;
            while(tmp != null){
                System.out.println("ID: " + tmp.getPatient().getId() + ": name " + tmp.getPatient().getName() + "; triage level: " + tmp.getPatient().getTriageLevel());
                tmp=tmp.getNext();
            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int checkPositionById(int id){
        this.id = id;
        int pos = 0;
        Node tmp = this.head;

        if(head != null){
            while(id != tmp.getPatient().getId()){
                tmp = tmp.getNext();
                pos++;

                if(tmp == null){
                    return -1;
                }
            }
            return pos;
        }else{
            return -2;
        }
    }

}
