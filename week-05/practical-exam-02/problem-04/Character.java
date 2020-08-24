//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class Character{
	private String name; //this attribute storage the character name;
 	private int age; // this attribute storage the character age;
 	private String gender; // this attribute storage the character gender
 	private String occupation; // this attribute storage the character occupation
 	private String familyRole; // this attribute storage the family role
 	private float rate;  // this attribute storage the character overall rate by fans;
 	
 	public Character(){

 	}
 	
 	public Character(String name, int age, String gender, String occupation, String familyRole, float rate){
 		this.name = name;
 		this.age = age;
 		this.gender = gender;
 		this.occupation = occupation;
 		this.familyRole = familyRole;
 		this.rate = rate;
 	}
 	
 	public String getName(){
 		return this.name;
 	}
 	public int getAge(){
 		return this.age;
 	}
 	public String getGender(){
 		return this.gender;
 	}
 	public String getOccupation(){
 		return this.occupation;
 	}
 	public String getFamilyRole(){
 		return this.familyRole;
 	}
 	public float getRate(){
 		return this.rate;
 	}
 	
 	public void setName(String name){
 		this.name = name;
 	}
 	public void setAge(int age){
 		this.age = age;
 	}
  	public void setGender(String gender){
 		this.gender = gender;
 	} 
 	public void setOccupation(String occupation){
 		this.occupation = occupation;
 	}
	public void setFamilyRole(String familyRole){
 		this.familyRole = familyRole;
 	}
	public void setRate(float rate){
 		this.rate = rate;
 	}
}