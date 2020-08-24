//Student name: Zhuofan ZHang
//Student ID: a1806522
import java.util.Scanner;
public class MatrixDeterminant {
    public static void main(String[] args) {
        System.out.println("Welcome to Matrix Determinant Calculator!\n" +
                "Would you like to calculate the determinant of a new matrix?\n");
        System.out.println("1. Yes, 2. No");
        //initialization the int for 2 matrix
        int matrix1;
        int matrix2;
        int[][] array;
        //Close the scanner object（use try）
        try (Scanner scanner = new Scanner(System.in)) {
            //Determining user input
            int option = scanner.nextInt();
            if (option != 1) {
                return;
            }
            System.out.println("What is the dimension of the matrix?");
            //3x3 for matrix
            String str = scanner.next();
            // Define "x" as a separator
            String[] strings = str.split("x");
            matrix1 = Integer.parseInt(strings[0]);
            matrix2 = Integer.parseInt(strings[1]);
            array = new int[matrix1][matrix2];
            System.out.println("Great! Let's calculate this determinant then.\n" +
                    "Please insert all the values for your matrix.\n");
            //use for loop nested detection the matrix size
            for (int row = 0; row < matrix1; row++) {
                for (int col = 0; col < matrix2; col++) {
                    System.out.println("New matrix [" + (row + 1) + "][" + (col + 1) + "]:");
                    array[row][col] = scanner.nextInt();
                }
            }
        }
        System.out.println("The determinant of your matrix is:");
        //use for loop nested to print the row and col
        for (int row = 0; row < matrix1; row++) {
            String strLine = "";
            strLine += "| ";
            for (int col = 0; col < matrix2; col++) {
                strLine += array[row][col] + ", ";
            }
            strLine = strLine.substring(0, strLine.length() - 2);
            strLine += "| ";
            System.out.println(strLine);
        }
        //use if else loop to choose the different formula
        if (matrix1 == 2 && matrix2 == 2) {
            System.out.println("Determinant:" + (array[0][0] * array[1][1] - array[0][1] * array[1][0]));
        } else if (matrix1 == 3 && matrix2 == 3) {
            System.out.println("Determinant:" + (array[0][0] * array[1][1] * array[2][2]+
                    array[0][1]*array[1][2]*array[2][0]+array[0][2]*array[1][0]*array[2][1]-
                    array[0][2]*array[1][1]*array[2][0] - array[0][1]*array[1][0]*array[2][2]-
                    array[0][0]*array[1][2]*array[2][1]));
        }
    }
}
