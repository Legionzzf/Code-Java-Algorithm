//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class ParkingPlace {
	private String owner;
	private String address;
	private String type;
	private String vehicle;
	private String vhicleType;
	private int price;

	//constructor
	ParkingPlace(String owner, String address, String type, String vehicle){
		this.owner = owner;
		this.address = address;
		this.type = type;
		this.vehicle = vehicle;
	}   
	// sets the owner's name of a parking place
	public void setOwner(String tmpOwner) {
		this.owner = tmpOwner;
	}
	// returns the owner's name of a parking place   
	public String getOwner() {
		return this.owner;
	}
	// set the address
	public void setAddress(String tmpAddress){
		this.address = address;
	}
	// returns the address of a parking place
	public String getAddress(){
		return this.address;
	}
	// returns the type of a parking place
	public String getType(){
		return this.type;
	}
	// returns the vehicle's type that a parking place may accommodate
	public String getVehicleType() {
		return vhicleType;
	}
	// sets the price of a packing place;
	// price is to be non-negative integer value;
	public void setPrice(int tmpPrice){
		if(tmpPrice < 0){
			System.out.println("price can't be non-negative integer value");
		}else{
			this.price = tmpPrice;
		}
	}
	// returns the price of a packing place
	public int getPrice(){
		return this.price;
	}
}