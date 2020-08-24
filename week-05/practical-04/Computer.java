//Student name: Zhuofan Zhang
//Student id: a1806522
package com.company;
import java.util.*;

public class Computer extends Player {
    public void create_choice() {

        Random ran = new Random();
        String choice ="Choice";

        int choiceOfcomputer = ran.nextInt(3);
        if (choiceOfcomputer == 0) {
            choice = "Rock";
        } else if (choiceOfcomputer == 1) {
            choice = "Paper";
        } else {
            choice = "Scissors";
        }
        this.choice=choice;
    }
        @Override
        public String performMove() {
            create_choice();
            System.out.printf("The choice of computer is %s:\n", choice);
            return choice;
        }


}

