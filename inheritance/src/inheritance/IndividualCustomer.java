package inheritance;

public class IndividualCustomer extends Customer {
	 private String firstName;
	 private String lastName;
	 private String nationalIdentity;
	
	 
	public IndividualCustomer(String firstName, String lastName, String nationalIdentity) {
		super();
		
		this.setFirstName(firstName);
		this.setLastName(firstName);
		this.setNationalIdentity(nationalIdentity);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
