class PhysicalBook extends Book {
	public int shelf;
	public int aisle;
	public int floor;
	PhysicalBook() {

	}
	public PhysicalBook (int shelf, int aisle, int floor) {
        super();
        this.shelf = shelf;
        this.aisle = aisle;
        this.floor = floor;
	}

	public int getShelf() {
		return shelf;
	}
	public int getAisle() {
		return aisle;
	}
	public int getFloor() {
		return floor;
	}
	public void setShelf() {
		this.shelf = shelf;
	}
	public void setAisle() {
		this.aisle = aisle;
	}
	public void setFloor() {
		this.floor = floor;
	}
	public void displayBookLocation() {
		System.out.println("The location of this book is:: shelf: " + this.getShelf() + "; aisle: " + this.getAisle() + "; floor: " + this.getFloor());
	}			
}