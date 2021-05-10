package eCommerceSystem.entities.concretes;

import java.util.UUID;

import eCommerceSystem.entities.abstracts.Entity;

public class UserActivation implements Entity{
	
	private int id;
	private int userId;
	private UUID activationNumber;
	public UserActivation() {
		// TODO Auto-generated constructor stub
	}
	public UserActivation(int id, int userId) {
		super();
		this.id = id;
		this.userId = userId;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public UUID getActivationNumber() {
		activationNumber= UUID.randomUUID();
		return activationNumber;
	}
}
