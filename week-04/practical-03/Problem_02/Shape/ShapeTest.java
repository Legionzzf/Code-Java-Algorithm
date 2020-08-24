public class ShapeTest {
    public static void main(String[] args){
    	
		Circle circle1 = new Circle();
		circle1.setRadius(5.5);
		circle1.printInformation();
		circle1.area();

		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(3.5);
		rectangle1.setLength(4.5);
		rectangle1.printInformation();
		rectangle1.area();
       
		Triangle triangle1 = new Triangle();
		triangle1.setWidth(2.8);
		triangle1.setHeight(4.4);
		triangle1.printInformation();
		triangle1.area(); 
	}
}