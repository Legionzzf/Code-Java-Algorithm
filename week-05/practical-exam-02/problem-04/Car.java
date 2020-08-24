//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class Car{
	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;
	public Car(){

	}
	public Car(String model, int numGears, float literTank, int yearManufacture){
		this.model = model;
		this.numGears = numGears;
		this.literTank = literTank;
		this.yearManufacture = yearManufacture;
	}
	// acessors
	public String getModel(){
		return this.model;
	}
	// acessors
	public int getNumGears(){
		return this.numGears;
	}
	// acessors
	public float getLiterTank(){
		return this.literTank;
	}
	// acessors
	public int getYearManufacture(){
		return this.yearManufacture;
	}
	// motator
	public void setModel(String model){
		this.model = model;
	}
	// motator
	public void setNemGears(int numGears){
		this.numGears = numGears;
	}
	// motator
	public void setLiterTank(float literTank){
		this.literTank = literTank;
	}
	// motator
	public void setYearManufacture(int yearManufacture){
		this.yearManufacture = yearManufacture;
	}
}