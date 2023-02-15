
public class Customer {
	protected String fullName;
	protected String DOB;
	protected Integer customerNum;
	
	//Constructors
	public Customer() {
		super();
		this.fullName = "Areeba Haroon";
		this.DOB = "03/22/2000";
		this.customerNum = 1;
		
	}

	public Customer(String fullName, String dOB, Integer customerNum) {
		super();
		this.fullName = fullName;
		DOB = dOB;
		this.customerNum = customerNum;
	}
	
	//getters and setters
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Integer getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(Integer customerNum) {
		this.customerNum = customerNum;
	}

	@Override
	public String toString() {
		return "(Name: " + fullName + ", Date of Birth: " + DOB + ", customer #: " + customerNum + ") \n";
	}
	
	
	
	

}
