public class MountainBike extends Bicycle {      
    public String suspension;   
    public String forks;   

    public MountainBike() {

    }     
    //print the 2 attributes above
    public void printMoun() {
		System.out.println("The suspension of the mountain bike is " + this.suspension);
		System.out.println("The forks of the mountain bike is " + this.forks);
	}
} 