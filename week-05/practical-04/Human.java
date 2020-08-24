//Student name: Zhuofan Zhang
//Student id: a1806522
import java.util.Scanner;
public class Human extends Player {
    public void read_input() {

        Scanner input = new Scanner(System.in);
        String choice = "Choice";
        
        while (!choice.equals("Rock") && !choice.equals("Paper") && !choice.equals("Scissors")) {
            System.out.println("Please input your choices(the first charactor is capital):");
            choice = input.next();
        }
        this.choice=choice;
    }
        @Override
        public String performMove() {
           read_input();
           System.out.printf("The choices of human is %s\n",  choice);
           return choice;
        }
}