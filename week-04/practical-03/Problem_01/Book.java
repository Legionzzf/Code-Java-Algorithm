class Book{
	//Attributes
	private String title;
	private int year;
	private String publish;
	private int pages;
	//Accessors
	public String getTitle(){
		return this.title;
	}
	public int getYear(){
		return this.year;
	}
	public String getPublish(){
		return this.publish;
	}
	public int getPages(){
		return this.pages;
	}
	//mutators
	public void setTitle(String title){
		this.title=title;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setPublish(String publish){
		this.publish=publish;
	}
	public void setPages(int pages){
		this.pages=pages;
	}
	//constructor
	Book(){
	
	}
	//parametrized constructor
	Book(String title, int year, String publish, int pages){
		this.title=title;
		this.year=year;
		this.publish=publish;
		this.pages=pages;
	}
	public void printInformation(){
		System.out.println("Book:: title: " + this.title
						  + "  year: " + this.year
						  + "  pages: " + this.pages
						  + "  publish: " + this.publish);
	}
}