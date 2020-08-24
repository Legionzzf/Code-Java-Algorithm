//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Finding the smallest happy number
        System.out.println(">>>>>>>>>>Question 15<<<<<<<<<<");
        Scanner input = new Scanner(System.in);
        int testNum = 0;
        do {
            System.out.println("Please input non-negative integer");
            testNum = checkInputType(input);
        }while (testNum < 0);

        int result = nextHappyNum(testNum+1);
        System.out.printf("Output: %d\n", result);
        System.out.println("");

        // DecodeString
        System.out.println(">>>>>>>>>>Question 16>>>>>>>>>>");
        System.out.print("Input: ");
        String inputStr = input.next();
        String outputStr = decodeString(inputStr);
        System.out.printf("Output: %s\n", outputStr);
        System.out.println("");

    }

    // ******* Happy Number *******

    // Getting the next smallest happy number
    private static int nextHappyNum(int num){
        if (isHappyNum(num)){
            return num;
        }else {
            num++;
            return nextHappyNum(num);
        }
    }

    // Check whether the number is happy number
    private static boolean isHappyNum(int num){
        if (num <= 0){
            return false;

        // If the number is equal 1, then this number is happy number
        }else if (num == 1){
            return true;

            //If a non-negative integer is not happy number, the sum will be 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
        }else if(num == 4 || num == 16 || num == 37 || num == 58
                || num == 89 || num == 145 || num == 42 || num == 20){

            return false;

        }else {

            // Getting the sum to check whether it is happy number
            int result = getSum(num);
            return isHappyNum(result);
        }
    }

    // Getting the sum
    private static int getSum(int num){
        int sum = 0;

        // If this number is smaller than 10, then sum is equal the square of this number
        if (num < 10){
            sum = (int) Math.pow(num, 2);

        }else {
            // If this number is greater and equal to 10, then get all of reminders to add
            while (num >= 10){
                sum += (int)Math.pow(num % 10, 2);
                num /=10;
            }
            // Add the last num after get other reminders
            sum += (int)Math.pow(num, 2);
        }
        return sum;
    }

    // Check inputs type method
    private static int checkInputType(Scanner input){

        int num = 0;
        System.out.print("Input: ");

        while (input.hasNext()){

            try{
                num = input.nextInt();
                break;

            }catch(Exception e){

                System.out.println("Please input non-negative integer");
                System.out.print("Input: ");
                input.next();
            }
        }
        return num;
    }

// ******* DecodeString *******

    private static String decodeString(String s){
        return getDecodeResult(s,0)[0];
    }

    private static String[] getDecodeResult(String s, int i) {

        // Creating StringBuilder object to append substring
        StringBuilder str = new StringBuilder();

        // Substring number
        int strNum = 0;

        // Checking different situation
        while(i < s.length()) {

            // Get the number of substring
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){

                // Get different digit number and sum
                strNum = strNum * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));

            } else if(s.charAt(i) == '[') {

                // If char is '[', then recursion
                String[] tmp = getDecodeResult(s, i + 1);
                // Get the last ']' position
                i = Integer.parseInt(tmp[0]);

                // Appending substring in [] according number
                while(strNum > 0) {
                    str.append(tmp[1]);
                    strNum--;
                }
            }
            // If char is ']', then return result including ']' position and substring in []
            else if(s.charAt(i) == ']'){

                return new String[] { String.valueOf(i), str.toString() };

            } else{
                // Appending substring
                str.append(String.valueOf(s.charAt(i)));
            }
            i++;
        }
        // Return the final string
        return new String[] { str.toString() };
    }

}
