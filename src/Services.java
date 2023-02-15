
public class Services extends Customer{
	private double numberOfHours;
	private double ratePerHour;
	
	public Services() {
		super();
		this.numberOfHours = 2.5;
		this.ratePerHour = 24;
	}

	public Services(double numberOfHours, double ratePerHour) {
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}
	
	//getters and setters
	public double getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	//function
	public double calculateTotalSale() {
		return (numberOfHours * ratePerHour);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Services Information: \n\t(Number of hours worked: " + numberOfHours + ", Rates per hour = $" + ratePerHour + ", Cost accrued: $" + String.format("%.2f",calculateTotalSale()) + "]\n";
	}
	
	
	

}
