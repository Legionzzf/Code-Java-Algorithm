import java.util.Random;
//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:4
//===================================
public class ShakingParty {

    private int nPeople;
    public ShakingParty() {
        Random rand = new Random();
        this.nPeople = rand.nextInt(100);
        System.out.println("People at the Party: " + this.nPeople);
    }
    public ShakingParty(int nTmp){
        this.nPeople = nTmp;
        System.out.println("People at the party: " + this.nPeople);
    }

    private int count(int n) {
        if(n == 1) {
            return 0;
        }else
        return (n-1)+count(n-1);
    }

    public int countHandShakes() {
        return count(this.nPeople);
    }

}