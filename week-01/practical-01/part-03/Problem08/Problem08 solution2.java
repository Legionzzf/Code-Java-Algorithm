import java.util.Scanner;

/*student ID: a1806522
student name: Zhuofan Zhang*/

class input 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Getting String input enter and print name
    	System.out.print("Enter your Name: ");
    	String name = input.nextLine();
    	System.out.println("Name:" + name);

    	// Getting String input enter and print favorite food
    	System.out.print("Enter your Favorite food: ");
    	String food = input.nextLine();
    	System.out.println("Favorite food:" + food);

    	//Getting int input enter and print age
    	System.out.print("Enter your age: ");
    	int age = input.nextInt();
    	System.out.println("Age:" + age);

    	//Getting double input enter and print grade
    	System.out.print("Enter your grade (in maths and english): ");
    	double grade = input.nextDouble();
    	System.out.println("Grade:" + grade);

    	//Getting long input enter and print height
    	System.out.print("Enter your height(cm): ");
    	long height = input.nextLong();
    	System.out.println("Height:" + height);

    	//Getting double input enter and print weight
    	System.out.print("Enter your weight(kg): ");
    	double weight = input.nextDouble();
    	System.out.println("Weight:" + weight);

    	//Getting int input enter and print subject
    	System.out.print("Enter your number of subject: ");
    	int subject = input.nextInt();
    	System.out.println("Number of subject:" + subject);
	}
}