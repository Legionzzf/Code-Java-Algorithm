public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        Patient patient = this.awl.popPatient();
        if (patient == null) {
            System.out.println("Error! The waiting list is empty.");
        } else {
            System.out.println("Assigned an ambulance for patient: " + patient.getName());

        }
        return patient;
    }
    public Patient assignAmbulanceForPatient(int id) {
        // TODO: The tester report that the system will crash when waiting list is empty
        Patient patient = this.awl.popPatient(id);
        if(patient == null){
            System.out.println("Can't find this patient");
        }else{
            System.out.println("Success ! An ambulance has assigned for patient " + patient.getId());
        }
        return patient;
    }

    public void checkPositionById(int id) {
        int result = this.awl.checkPositionById(id);
        if (result == -1){
            System.out.println("This patient are not in waiting list");
        }else if (result == -2){
            System.out.println("Error! The waiting list is empty. ");
        } else {
            System.out.println("There are "+ result + " before patient " + id);
        }
    }


    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}
