import java.util.Arrays;

class Lecturer extends Person {

	public double salary;
	public String[] disciplines;
        
	public Lecturer() {

	}
	public Lecturer(double salary) {
        super();
        this.salary = salary;
	}

	public void annualSalary() {
		double annual = salary * 12;
		System.out.println("the annual salary of " + this.getGivenName() + " is " + annual);
	}
	public void displayDisciplines() {
		System.out.println("the disciplines for lecturer includes " + Arrays.toString(disciplines));
	}
}
