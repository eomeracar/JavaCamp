package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String surName;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String surName) {
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	

}
