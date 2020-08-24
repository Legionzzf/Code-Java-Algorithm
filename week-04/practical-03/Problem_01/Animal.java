class Animal{
	//Attributes
	private String name;
	private double weight;
	private String favouriteFood;
	private int age;

	//Accessors;
	String getName(){
		return this.name;
	}
	String getFavouriteFood(){
		return this.favouriteFood;
	}
	int getAge(){
		return this.age;
	}
	double getWeight(){
		return this.weight;
	}
	//Mutators;
	void setName(String name){
		this.name = name;
	}
	void setWeigth(double weight){
		this.weight = weight;
	}
	void setFavouriteFood(String favouriteFood){
		this.favouriteFood = favouriteFood;
	}
	void setAge(int age){
		this.age = age;
	}

	//Implement Basic Constructor;
	Animal(){
		
	}
	//Implement Parametric Constructor;
	Animal(String name, double weight ,String favouriteFood, int age){
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		this.age = age;
	}
	public void printInformation(){
		System.out.println("Animal:: name: " + this.name
						  + " age: " + this.age
						  + " weight: " + this.weight
						  + " food: " + this.favouriteFood);
	}

}