public class ElectricBike extends Bicycle{
	int battery;
	
	public ElectricBike(int battery) {   //constructor
		super();
		this.battery = battery;
	}

	public void chargeBike() {
		System.out.println("Sorry, your electric bike is still in charging. ");
	}
}
