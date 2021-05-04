package entities;

import java.util.Date;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, Date gregorianCalendar, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = gregorianCalendar;
		this.nationalityId = nationalityId;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
