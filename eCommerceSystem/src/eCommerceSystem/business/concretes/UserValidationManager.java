package eCommerceSystem.business.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserValidationService;
import eCommerceSystem.entities.concretes.User;

public  class UserValidationManager implements UserValidationService {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public UserValidationManager() {
		
	}
	@Override
	public boolean minLengthPassword(User user) {
		if(user.getPassword().length()>6)
		{
			return true;
		}
		return false;
	}
	public boolean isEmailValid(User user) {
		 	Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
	        return matcher.find();
	}
	public boolean minLengthFirstName(User user)
	{
		if(user.getFirstName().length()>2)
		{
			return true;
		}
		return false;
	}
	public boolean minLengthLastName(User user)
	{
		if(user.getLastName().length()>2)
		{
			return true;
		}
		return false;
	}
}