import java.util.Scanner;

/*student ID: a1806522
student name: Zhuofan Zhang*/

class input 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Getting String input enter and scanner name
    	System.out.print("Enter your Dog name: ");
    	String name = input.nextLine();
    	
        //Getting int input enter and scanner age
        System.out.print("Enter your Dog age: ");
        int age = input.nextInt();
        
    	// Getting String input enter and scanner favorite food
    	System.out.print("Enter your Dog favorite food: ");
    	String food = input.next();

    	//Getting long input enter and scanner height
    	System.out.print("Enter your Dog height(cm): ");
    	long height = input.nextLong();
    	
    	//Getting double input enter and scanner weight
    	System.out.print("Enter your Dog weight(kg): ");
    	double weight = input.nextDouble();

        //getting String inout enter and scanner favorite toy
        System.out.print("Enter your Dog favorite toy: ");
        String toy = input.next();

        //Getting String input enter and scanner owner name
        System.out.print("Enter owner's name: ");
        String owner = input.next();

        //Printing your information
        System.out.println("Dog name:" + name);
        System.out.println("Dog age:" + age);
        System.out.println("Dog favorite food:" + food);
        System.out.println("Height:" + height + "cm");
        System.out.println("Weight:" + weight + "kg");
        System.out.println("Dog favorite toy:" + toy);
        System.out.println("Owner's name:" + owner);
	}
}