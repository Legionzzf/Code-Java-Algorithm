import java.util.Scanner;
public class part1
//student name: Zhuofan Zhang
//student ID: a1806522
{
    public static void main(String[] args)
    {   
        //print out to user
        System.out.println("Welcome dear user!");
        System.out.println("Would you like to:");
        System.out.println("a) sum again");
        System.out.println("b) exit");
        System.out.println("Option:");
        //import input characters
        Scanner input = new Scanner(System.in);
        Character myChar = input.next().toCharArray()[0];
        //indentify different characters and responses
        while (myChar == 'a')
        {
            System.out.print("Please, insert the first number: ");
            Integer number_a = input.nextInt();
            System.out.print("Please, insert the second number: ");
            Integer number_b = input.nextInt();
            System.out.println("----");
            System.out.printf("Thank you for your enquiry, the sum between %d and %d is %d.%n", number_a,number_b,number_a+number_b);
            break;

        };

        System.out.println("Thank you! Have a good day.");
    }
}