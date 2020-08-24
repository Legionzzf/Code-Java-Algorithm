//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
public class Test {
    public static void main(String args[]) {
        // Testing with default constructor
        ShakingParty party1 = new ShakingParty();
        System.out.println("Total Handshakes: " + party1.countHandShakes());
        System.out.println("");
        System.out.println("!!!Warning!!! Banned Handshake during COV19");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("!!!Warning!!! Banned Handshake during COV19");
        System.out.println("");
        // Testing with parameterized constructor
        ShakingParty party2 = new ShakingParty(5);
        System.out.println("Total Handshakes: " + party2.countHandShakes());
    }
}
