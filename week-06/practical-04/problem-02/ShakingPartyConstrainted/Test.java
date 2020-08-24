//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
public class Test {

    public static void main(String[] args) {
        int numberOfCouples;
        int numberOfHandshakes;

        // testing with default constructor
        ShakingPartyConstrainted party1 = new ShakingPartyConstrainted();
        numberOfCouples = party1.getNCouples();
        numberOfHandshakes = party1.countHandShakes(numberOfCouples);
        System.out.println("Number of handshakes: " + numberOfHandshakes);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

        // testing with parameterized constructor
        ShakingPartyConstrainted party2 = new ShakingPartyConstrainted(3);
        numberOfCouples = party2.getNCouples();
        numberOfHandshakes = party2.countHandShakes(numberOfCouples);
        System.out.println("Number of handshakes: " + numberOfHandshakes);

    }

}