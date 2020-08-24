//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
public class HanoiTower {
    int disk;
    HanoiTower(int disk){
        disk= this.disk;
    }
    static void solve(int n, String a, String b,String c){
        if (n==1){
            System.out.println("Move the disk 1 from "+ a + " to " + c);
        }else{
            solve(n-1, a , c , b);
            System.out.println("Move the disk "+ n + " from "+ a + " to "+ c);
            solve(n-1, b, a, c);
        }
    }
}
