//Student name: Zhuofan Zhang
//Student id: a1806522
package com.company;

public class Referee{
    void start(){
        Player humanChoice=new Human();
        Player computerChoice=new Computer();

        String human = humanChoice.performMove();
        String computer = computerChoice.performMove();

        if(human.equals("Rock")&&computer.equals("Scissors")||human.equals("Scissors")&&computer.equals("Paper")||human.equals("Paper")&&computer.equals("Rock")){
            System.out.println("The human win!");
        }else if(computer.equals("Rock")&&human.equals("Scissors")||computer.equals("Scissors")&&human.equals("Paper")||computer.equals("Paper")&&human.equals("Rock")){
            System.out.println("The computer win!");
        }else{
            System.out.println("The result is a draw!");
        }
    }


}
