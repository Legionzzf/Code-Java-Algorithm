public class AnimalTest {
    public static void main(String[] args){
    //input the information of different animals, print information
		Lion lion1 = new Lion();
		lion1.setWeight(100.05d);
		lion1.setName("Tom");
		lion1.setAge(20);
		lion1.setFavoriteFood("Apple");
		lion1.printInformation();
        lion1.makeSound();

		Turtle turtle1 = new Turtle();		
		turtle1.setName("Jerry");
		turtle1.setAge(21);
		turtle1.setFavoriteFood("potato");
		turtle1.setWeight(0.5d);
		turtle1.printInformation();
        turtle1.makeSound();
        
		Chameleon chameleon1 = new Chameleon();
		chameleon1.setWeight(0.4d);
		chameleon1.setName("Apple");
		chameleon1.setAge(22);
		chameleon1.setFavoriteFood("Mosquito");
		chameleon1.printInformation();
        chameleon1.makeSound();
	}
}
