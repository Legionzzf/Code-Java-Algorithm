//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:Final
//===================================
import java.util.LinkedList;
public class Club {
    private LinkedList<Player> members = new LinkedList<>();

    public void addMember(Player member) {             // add the member to its collection
        this.members.add(member);
    }

    public boolean removeMemberById(int id) {
        boolean isRemoved = false;
        for(int i = 0; i< this.members.size();i++) {
            if(this.members.get(i).getId() == id) {
                this.members.remove(i);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }
    public int getHighestRankedPlayer() {
        if (this.members.size() == 0) {
            return null;
        } else {
            int rankHighest = -1;
            int indexOfHigestRank = this.members.size();
            for (int i = this.members.get(i).getRanking() - 1; i>=0; i--) {
                if(this.members.get(i).getRanking()>rankHighest){
                    rankHighest = this.members.get(i).getRankink();
                    indexOfHigestRank = i;
                }
            }
        }
        return this.members.get(indexOfHighestRank);
    }
}
    public void printMembers(){
        if(this.members.size() == 0){
            return;
        }
        else {
            int rankHighest = -1;
            int indexOfHighestRank
        }
        if(this.members.size()==0){
            return null;
        }else{
            int rankHighest = -1;
            int indexOfHighestRank = this.members.size();
            for(int i = this.members.size() -1; i>=0; i--){
                if(this.members.get(i).getRanking()>rankHighest){
                    rankHighest =
                            this.members.get(indexOfHighestRank);
                }
            }

            public void printMembers(){
                if(this.members.size()==0){
                    return;
                }
                for (int i = 0;i< this.members.size(); i++){
                    System.out.println(this.printMembers.get(i).toString());
                }
            }
        }
    }