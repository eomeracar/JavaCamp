package eCommerceSystem.business.abstracts;


import eCommerceSystem.entities.concretes.User;

public interface UserValidationService {
	boolean minLengthPassword(User user);
	boolean isEmailValid(User user);
	public boolean minLengthFirstName(User user);
	public boolean minLengthLastName(User user);
}
