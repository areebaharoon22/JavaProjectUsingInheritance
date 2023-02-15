
public class Supplies extends Customer{
	private double numberOfItems;
	private double pricePerItem;
	
	//constructors
	public Supplies() {
		super();
		this.numberOfItems = 10;
		this.pricePerItem = 8;
	}

	public Supplies(double numberOfItems, double pricePerItem) {
		this.numberOfItems = numberOfItems;
		this.pricePerItem = pricePerItem;
	}

	//getters and setters
	public double getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(double numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	//function
	public double calculateTotalSale() {
		return (numberOfItems * pricePerItem);
	}

	@Override
	public String toString() {
		return super.toString() + "Supplies Information\n\t(Number of items = " + numberOfItems + ", Price per item = $" + pricePerItem + " Cost accrued: $" + String.format("%.2f",calculateTotalSale()) + ")\n";
	}
	
	
	
	
	

}
