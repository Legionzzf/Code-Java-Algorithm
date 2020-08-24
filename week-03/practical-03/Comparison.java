//Student name: Zhuofan ZHang
//Student ID: a1806522
import java.util.Scanner;
public class Comparison {
    //initialization the int
    public static void main(String[] args) {
        int num1 = 0 ;
        int num2 = 0;
        Scanner input = new Scanner(System.in);
        //try catch and scanner number1
        System.out.print("Please, insert a number (1): ");
        while(input.hasNext()){
            try{
                num1=input.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Please, insert a number (1): ");
                input.next();
            }
        }
        System.out.print("Please, insert a number (2): ");
        //try catch and scanner number2
        while(input.hasNext()){
            try{
                num2 = input.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Please, insert a number (2): ");
                input.next();
            }
        }
        //use if else loop to find which number is bigger
        if (num1 > num2) {
            System.out.println(" The bigger number is " + num1);
        } else if (num1 < num2) {
            System.out.println(" The bigger number is " + num2);
        } else {
            System.out.println(" The number are equal ");
        }
    }
}