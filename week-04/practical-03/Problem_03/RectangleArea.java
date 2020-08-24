import java.util.*;
import java.lang.Integer;

class RectangleArea extends Rectangle{

	void read_input() {
		System.out.println("Input:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		if(inputArray.length == 2){
			try{
				this.width = Integer.parseInt(inputArray[0]);
				this.height = Integer.parseInt(inputArray[1]);
				display();
			}catch(java.lang.NumberFormatException nfe){
				System.out.println("Please input the numbers..");
			}
		}else{
			System.out.println("Please input 2 numbers");
		}		
	}

	@Override
	void display(){
		System.out.println("Output:");
		super.display();
		System.out.println(this.width * this.height);
	}

}