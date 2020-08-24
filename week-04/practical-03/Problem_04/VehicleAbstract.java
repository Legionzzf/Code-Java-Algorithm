import java.util.Scanner;
abstract class VehicleAbstract {
	
	protected String color;
	protected int year;
	protected int numberGears;
	
	public void setFeature() {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Please enter the color of the bike.");
		this.color = input.next();
		
		System.out.println("Please enter the year of the bike.");
		while(input.hasNext()) {
			try {
				this.year = input.nextInt();								
				break;
			}
			catch(Exception e) {
			
				System.out.println("Sorry, please insert an interger: ");		
				input.next(); 
			}	
		}
		
		System.out.println("Please enter the number of gears of the bike.");
		while(input.hasNext()) {
			try {
				this.numberGears = input.nextInt();							
				break;
			}
			catch(Exception e) {
				System.out.println("Sorry, please insert an interger: ");		
				input.next(); 
			}	
		}
	}
	
		
	public void printfeatures() {
		System.out.println("The color of the bike is: " + this.color);
		System.out.println("The year of the bike is: " + this.year);
		System.out.println("The bumber of gears of the bike is: " + this.numberGears);
	}
}