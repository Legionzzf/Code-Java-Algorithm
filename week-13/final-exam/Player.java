//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:Final
//===================================
public class Player extends Person {
protected int id = 0;
protected int numWins;
protected int numPlayed;
static int playerIndex = 0;

Player(String name, int age, int numWins, int numPlayed){
      super(name, age);
      this.numWins = numWins;
      this.numPlayed = numPlayed;
      playerIndex++;
      this.id = playerIndex;
  }

public void win() {
this.numWins++;
this.numPlayed++;
}

public void lose() {
this.numPlayed++;
}

public int getRanking(){
      int rankingScore = 0;
      if (this.numPlayed == 0){
      return rankingScore;
      }
      else {
          rankingScore = Math.round(this.numPlayed*(this.numWins/this.numPlayed));
          return rankingScore;
      }
}


public int getId() {
return id;
}

@Override
public String toString() {
return "Person: " + getName() + " is age: " + getAge() + " Id: " + getId() + " Ranking: " + getRanking();
  }
}





