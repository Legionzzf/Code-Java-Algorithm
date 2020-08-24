public class Person {
    private String givenName;
    private String lastName;
	private int age;
	private String gender;
	private String citizenship;
	
    //Implement Parametric Constructor;
    public Person(String givenName, String lastName, int age, String gender, String citizenship) {
    	this.givenName = givenName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender; 
        this.citizenship = citizenship;
    }
	// Accessors 
	public String getGivenName(){
		return this.givenName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getAge(){
		return this.age;
	}
	public String getGender(){
		return this.gender;
	}
	public String getCitizenship(){
		return this.citizenship;
	}

	// Mutators
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setCitizenship(String citizenship){
		this.citizenship = citizenship;
	}
	
	//basic constructor
    public Person(){
    	
    }

	public void printInformation(){
		System.out.println("Person:: givenName: " + this.givenName
						  + " lastName: " + this.lastName
						  + " age: " + this.age
						  + " gender: " + this.gender
                          + " citizenship: " + this.citizenship);
	}
}