public class Book {
    private String title;
	private int year;
	private int pages;
	private String publish;

    public Book(){
    	//basic constructor
    }
    //Implement Parametric Constructor
    public Book(String title, int year, int pages, String publish) {
    	this.title = title;
        this.year = year;
        this.pages = pages;
        this.publish = publish; 
    }    
	// Accessors
	public String getTitle(){
		return this.title;
	}
	public int getYear(){
		return this.year;
	}
	public int getPages(){
		return this.pages;
	}
	public String getPublish(){
		return this.publish;
	}

	// Mutators
	public void setTitle(String title){
		this.title = title;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setPages(int pages){
		this.pages= pages;
	}
	public void setPublish(String publish){
		this.publish = publish;
	}

	public void printInformation(){
		System.out.println("Book:: title: " + this.title
						  + "  year: " + this.year
						  + "  pages: " + this.pages
						  + "  publish: " + this.publish);
	}
}


	
