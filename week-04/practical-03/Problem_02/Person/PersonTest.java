import java.util.Arrays;
public class PersonTest {
    public static void main(String[] args){
    	
		    Student student1 = new Student();
		    student1.setGivenName("Tom");
		    student1.setLastName("Hank");
		    student1.setAge(15);
		    student1.setGender("Male");
		    System.out.println();
		    System.out.println("Test of student");
		    student1.printInformation();
            student1.marks = new double[] {85.0d,90.0d,99.9d};
            student1.disciplines = new String[] {"Math", "English", "Chinese"};
            student1.displayDisciplines();
            System.out.println("the marks of each discipline is " + Arrays.toString(student1.marks));
            student1.aveMarks();

		    System.out.println();
		    System.out.println("Test of lecturer");
		    Lecturer lecturer1 = new Lecturer(2500.0d);		
		    lecturer1.setGivenName("Jerry");
		    lecturer1.disciplines = new String[] {"Math", "English", "Chinese", "Science"};
		    lecturer1.displayDisciplines();
		    lecturer1.annualSalary();

		    System.out.println();
		    System.out.println("Test of Doctor");
		    Doctor doctor1 = new Doctor("Medicine");
		    doctor1.setGivenName("Tim");
		    System.out.println("the speciality of the doctor (" + doctor1.getGivenName() + ") is " + doctor1.speciality);

		    System.out.println();
		    System.out.println("Test of Patient");
		    Patient patient1 = new Patient("cold", "6 March", "15 March");
		    patient1.setGivenName("Tom");
		    patient1.setLastName("Jerry");
		    patient1.setAge(18);
		    patient1.setGender("Male");
		    patient1.setCitizenship("USA");
		    patient1.printInformation();
		    System.out.println("the patient's diagnostic is: " + patient1.getDiagnostic());
		    System.out.println("the patient's intime is: " + patient1.getInTime());
		    System.out.println("the patient's prevtime is: " + patient1.getPrevTime());

	}
}