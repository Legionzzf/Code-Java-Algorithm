//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class DebuggingDemo {

    public void bugMethod() {
    	// There are 4 elements in the array, which means max index is 4.
    	// So, only can print num[0], num[1], num[2], num[3], num[4].
        int num[] = {1, 2, 3, 4};
        System.out.println(num[3]);
     }

    public double bugMethod2() {
        //It should be float ans = 0.0f;
        float ans = 0.0f;
        System.out.println("This method had a bug!");
        return ans;
     }


}