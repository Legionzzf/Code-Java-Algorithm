public class Shape {
	public double width;	
	public double height;
	public double radius;
	public double length;
    public static final double PI=3.14;

    //Implement Parametric Constructor;
    public Shape(double width, double height, double radius, double length) {
    	this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length; 
    }   
	// Accessors
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public double getRadius(){
		return this.radius;
	}
	public double getLength(){
		return this.length;
	}

	// Mutators
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public void setLength(double length){
		this.length = length;
	}
	
	 //basic constructor
    public Shape(){
    	
    }

	public void printInformation(){
		System.out.println("Shape:: width: " + this.width
						  + " height: " + this.height
						  + " radius: " + this.radius
						  + " length: " + this.length);
	}
}