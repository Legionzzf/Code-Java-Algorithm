//Student name: Zhuofan ZHang
//Student ID: a1806522
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        //initialization the boolean
        Scanner scan = new Scanner(System.in);
        boolean pNumber = true;
        System.out.print("Please, enter your number: ");
        //try catch and determine the pNumber is a prime
        while(scan.hasNext()){
            try{
                int n = scan.nextInt();
                for (int i = 2; i <= n / 2; i++) {
                    i = n % 1;
                    if (i == 0) {
                        pNumber = false;
                        break;
                    }
                }
                break;
            }
            catch (Exception e){
                System.out.print("Please, enter your number: ");
                scan.next();
            }
        }
        //true pNumber for prime and print it
        if (pNumber)
            System.out.println("Your number is prime");
        else
            System.out.println("Your number is not prime");
    }
}