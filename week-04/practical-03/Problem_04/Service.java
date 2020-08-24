import java.util.Scanner;
public class Service { 
 
    public static void main (String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.println("please input you vehicl type");
		System.out.println("1) Electric Bike.");
		System.out.println("2) Mountain Bike.");
		System.out.println("3) Road Bike.");
		System.out.println("4) Hibrid.");    

		char choice = input.next().charAt(0);
		chooseType(choice);
    }  

	public static void chooseType(char choice) {
		Scanner input = new Scanner(System.in);
		double Xgear = 0;
		double Xbreak = 0;

        switch(choice) {
			case '1':{
				ElectricBike elec = new ElectricBike(120);
				elec.setFeature();
				System.out.println("Would you like to change the Gear: 1-Yes  2-No");
				char input2 = input.next().charAt(0);
				if(input2 == '1') {
					System.out.println("Please enter the gear you want to change (1/2/3/4)");
					Xgear = input.nextDouble();
				}
				else Xgear = 0;
				
				System.out.println("Would you like to change the break: 1-Yes  2-No");
				char input3 = input.next().charAt(0);
				if(input3 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xbreak = input.nextDouble();
				}
				else Xbreak = 0;
				
				elec.chargeBike();
				elec.checkoutService();
				
				System.out.println("Your bicycle is in repairing.");
				elec.printfeatures();
				if(Xgear != 0) {
					elec.changeGear(Xgear);
				}
				if(Xbreak != 0) {
					elec.checkBreak(Xbreak);
				}
				System.out.println("The battery is " + elec.battery + "% now.");
				elec.printCheckOut();
				break;
			}
            case '2':{
				MountainBike moun = new MountainBike();
				moun.setFeature();
				System.out.println("Please input the suspension of your mountain bike.");
				moun.suspension = input.next();
				System.out.println("Please input forks of your mountain bike.");
				moun.forks = input.next();
				System.out.println("Would you like to change the Gear: 1-Yes  2-No");
				char input2 = input.next().charAt(0);
				if(input2 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xgear = input.nextDouble();
				}
				else Xgear = 0;
				
				System.out.println("Would you like to change the break: 1-Yes  2-No");
				char input3 = input.next().charAt(0);
				if(input3 == '1') {
					System.out.println("Please enter the number of break you want to check (1/2/3/4)");
					Xbreak = input.nextDouble();
				}
				else Xbreak = 0;
				moun.checkoutService();
				
				System.out.println("Your bicycle is in repairing.");
				moun.printfeatures();
				if(Xgear != 0) {
					moun.changeGear(Xgear);
				}
				if(Xbreak != 0) {
					moun.checkBreak(Xbreak);
				}
				moun.printMoun();
				moun.printCheckOut();
				break;
			}  
            case '3':{
				System.out.println("What is the type of tyres of your road bike?");
				String tyretype = input.next();
				RoadBike road = new RoadBike(tyretype);
				road.setFeature();
				System.out.println("Would you like to change the Gear: 1-Yes  2-No");
				char input2 = input.next().charAt(0);
				if(input2 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xgear = input.nextDouble();
				}
				else Xgear = 0;	

				System.out.println("Would you like to change the break: 1-Yes  2-No");
				char input3 = input.next().charAt(0);
				if(input3 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xbreak = input.nextDouble();
				}
				else Xbreak = 0;
				road.checkoutService();
				
				System.out.println("Your bicycle is in repairing.");
				road.printfeatures();
				if(Xgear != 0) {
					road.changeGear(Xgear);
				}
				if(Xbreak != 0) {
					road.checkBreak(Xbreak);
				}
				System.out.println("The tyre of your road bike is " + road.tyres);
				road.printCheckOut();
				break;	
			}	
            case '4':{
				Hibrid hib = new Hibrid();
				hib.setFeature();
				System.out.println("Please input the suspension of your mountain bike.");
				hib.suspension = input.next();
				
				System.out.println("Would you like to change the Gear: 1-Yes  2-No");
				char input2 = input.next().charAt(0);
				if(input2 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xgear = input.nextDouble();
				}
				else Xgear = 0;
				
				System.out.println("Would you like to change the break: 1-Yes  2-No");
				char input3 = input.next().charAt(0);
				if(input3 == '1') {
					System.out.println("pleas input the number of gears needed to be changed");
					Xbreak = input.nextDouble();
				}
				else Xbreak = 0;
				hib.checkoutService();
				System.out.println("Your bicycle is in repairing.");
				hib.printfeatures();
				if(Xgear != 0) {
					hib.changeGear(Xgear);
				}
				if(Xbreak != 0) {
					hib.checkBreak(Xbreak);
				}				
				hib.printHibrid();
				hib.printCheckOut();
				break;
			}	
			default:{
				break;
			}										  
        } 
    }
}
