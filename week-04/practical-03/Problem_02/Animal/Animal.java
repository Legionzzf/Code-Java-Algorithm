public class Animal {
    private String name;
	private int age;
	private double weight;
	private String favoriteFood;
	// Basic Constructor
    public Animal() {
        
    }
    //Implement Parametric Constructor;
    public Animal(String name, int age, double weight, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood; 
    }     
	// Accessors
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public String getFavoriteFood(){
		return this.favoriteFood;
	}
	// Mutators
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setFavoriteFood(String favoriteFood){
		this.favoriteFood = favoriteFood;
	}

	public void printInformation(){
		System.out.println("Animal:: name: " + this.name
						  + " age: " + this.age
						  + " weight: " + this.weight
						  + " food: " + this.favoriteFood);
	}
    public void makeSound() {
        System.out.println("Not implemented yet");
    }
}


