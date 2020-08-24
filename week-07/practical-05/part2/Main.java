//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        // Relative path
        String fileName = "./students.txt";
        Student[] sts = readData(fileName);
        Student s = new Student();
        sts = s.sortStudents(sts);
        System.out.println("After sorting: ");
        printStudents(sts);

    }

    // Printing the sorted students
    public static void printStudents(Student[] students) {
        // Setting alignment format
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Student", "AverageScore", "Physic", "Chemistry", "Maths");
        for (Student s: students){
            System.out.printf("%-10s %-12d %-10d %-10d %-10d\n",s.getName(),s.getAverage(),s.getPhysic(),s.getChemistry(),s.getMath());
        }
    }

    // Reading data from file
    private static Student[] readData(String filename) throws Exception {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int count = 0;
        // Check whether has content and get lines number
        while ((st = br.readLine()) != null){
            if(!st.trim().equals("")){
                count++;
            }
        }
        // Create new BufferedReader object to add student object
        br = new BufferedReader(new FileReader(file));
        Student[] studentArr = new Student[count];
        int i = 0;
        String st2;
        while ((st2 = br.readLine()) != null){
            if(!st2.trim().equals("")){
                // Change String to array through spacing and set value to student's attributes
                String [] information = st2.split("\\s+");
                studentArr[i] = new Student(information[0],Integer.parseInt(information[1]),Integer.parseInt(information[2]),Integer.parseInt(information[3]));
                i++;
            }

        }
        return studentArr;

    }
}
