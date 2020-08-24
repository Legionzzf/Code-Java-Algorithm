import java.util.Scanner;
public class main
//student name: Zhuofan Zhang
//student ID: a1806522
{
    public static void main(String[]args)
   	{   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of cash input: ");
        Integer amount_m = input.nextInt();
        //input and test to withdraw
        if((amount_m % 50)%20 ==0) 
        {
        int size = 2;
        int[] run = new int[size];
        run[0] = amount_m / 50;
        run[1] = (amount_m - (run[0] * 50)) / 20;
        System.out.printf(" If the input is " + amount_m);
        System.out.printf(", then the output should be \"Here is %d $20 notes and %d $50 notes.\" %n ", run[1],run[0]);
        }
        //print out
        else 
        {
        System.out.println("Sorry, the value you input cannot be withdrew.");
        }
    }
}