//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int n=0;
        try{
            System.out.printf("please input the number of disk:");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
        }catch (Exception e) {
            System.out.println("Please input correct number");
        }
        HanoiTower ob =new HanoiTower(n);
        HanoiTower.solve(n ,"PoleA" ,"PoleB" ,"PoleC");
    }
}
