public class BookTest {
    public static void main(String[] args){
    
		EBook eBook1 = new EBook("https://www.kengnidaye.com.");
		eBook1.setTitle("Old man");
		eBook1.setYear(1999);
		eBook1.setPages(300);
		eBook1.setPublish("Jhon");
		eBook1.printInformation();
        System.out.println("the url of this book is " + eBook1.url);

		PhysicalBook physicalBook1 = new PhysicalBook(2, 3, 5);
		physicalBook1.setTitle("harry portter");
		physicalBook1.setYear(2000);
		physicalBook1.setPages(600);
		physicalBook1.setPublish("English");
		physicalBook1.printInformation();
		physicalBook1.displayBookLocation();
	}
}
