import java.util.Scanner;

/*student ID: a1806522
student name: Zhuofan Zhang*/

class MyClass 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    //enter your information
    System.out.println("Enter name , food , age , grade (in maths and english), height, weight and number of subject:");


    //Getting String double int long input
    String name = input.nextLine();
    String food = input.nextLine();
    int age = input.nextInt();
    double grade = input.nextDouble();
    long heigh = input.nextLong();
    double weight = input.nextDouble();
    int subject = input.nextInt();


    //Print your information on Scanner
    System.out.println("Name: " + name);
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Maths grade:" + grade);
    System.out.println("Heigh:" + heigh);
    System.out.println("Weight:" + weight);
    System.out.println("Number of subject:" + subject);
  }
}