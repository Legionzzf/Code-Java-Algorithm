import java.util.Scanner;
public class Bicycle extends VehicleAbstract implements Vehicle{        
    private boolean is_serviced; 
    private String inDate; 
    private String outDate; 
    private String serviceResponsible; 

    Bicycle() {
        this.is_serviced = false;
    }
        
	public void checkoutService() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the inDate of this bicycle: ");
		this.inDate = input.next();
		
		System.out.println("Please input the outDate of this bicycle: ");
		this.outDate = input.next();
		
		System.out.println("Please input the person's name who responsible for this bicycle: ");
		this.serviceResponsible = input.next();
	}

	
	public void changeGear(double Xgear) {		
		System.out.println("the " + Xgear + " has/have been changed.");		
	}

    
	public void checkBreak(double Xbreak) {		
		System.out.println("the " + Xbreak + " has/have been changed.");		
	}	

	
	public void printCheckOut() {
		System.out.println("Indate: " + inDate);
		System.out.println("Outdate: " + outDate);
		System.out.println("The person who responsible for this service: " + serviceResponsible);		
	}
}     