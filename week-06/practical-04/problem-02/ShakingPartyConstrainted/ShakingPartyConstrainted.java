//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
import java.util.Random;

public class ShakingPartyConstrainted {
    private int nCouples;

    public int getNCouples() {
        return this.nCouples;
    }

    public ShakingPartyConstrainted() {
        Random rand = new Random();
        this.nCouples = rand.nextInt(100)+1;
        System.out.println("Couples at the Party: " + this.nCouples);
    }

    public ShakingPartyConstrainted(int nTmp) {
        this.nCouples = nTmp;
        System.out.println("Couples at the party: " + this.nCouples);
    }

    public int countHandShakes(int n) {
        if (n>1 & n==2) {
            return 3;
        } else {
            return 3 * (n - 1) + countHandShakes(n - 1);
        }
    }
}