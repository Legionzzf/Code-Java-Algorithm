//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class Cake{
	private String name;
	private float qtSugar;
 	private float qtFlour;
 	private float qtYeast;
 	private double timePrepare;
 	//create (1) default constructor
 	public Cake(){
 	}
 	// and (2) a Constructor with all parameters;
 	public Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare){
 		this.name = name;
 		this.qtSugar = qtSugar;
 		this.qtFlour = qtFlour;
 		this.timePrepare = timePrepare;
 	}

 	public Cake(String name, double timePrepare){
 		this.name = name;
 		this.timePrepare = timePrepare;
 	}

 	// accessors
 	public String getName(){
 		return this.name;l
 	}

 	public float getSugar(){
 		return this.qtSuger;
 	}
 	public float getFlour(){
 		return this.qtFlour;
 	}
 	public float getYeast(){
 		return this.qtYeast;
 	}
 	public double timePrepare(){
 		return this.timePrepare;
 	}
 	// motator
 	public void setName(Sring name){
 		this.name = name;
 	}
  	public void setQtSugar(float qtSuger){
 		this.qtSuger = qtSuger;
 	}
  	public void setQtFlour(float qtFlour){
 		this.qtFlour = qtFlour;
 	}
  	public void setQtyeast(float qtYeast){
 		this.qtYeast = qtYeast;
 	}
 	public void setTimePrepare(double timePrepare){
 		this.timePrepare = timePrepare;
 	}
}