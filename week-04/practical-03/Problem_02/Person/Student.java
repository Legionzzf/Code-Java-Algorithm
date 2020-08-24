import java.util.Arrays;

class Student extends Person {

	public double[] marks;
	public String[] disciplines;

	public Student() {

	}
	public void aveMarks() {
		double sum = 0.0;
		for(int i = 0; i < this.marks.length; i++){
			sum += this.marks[i];
		}
		double ave = sum / this.marks.length;
		System.out.println("the average mark of " + this.getGivenName() + " is " + ave);
	}
	public void displayDisciplines() {
		System.out.println("the disciplines includes " + Arrays.toString(disciplines));
	}
}
