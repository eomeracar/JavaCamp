package abstracts;

import entities.Customer;

public abstract class BaseCustomerValidationService implements CustomerValidationService{
	public abstract boolean validateRealPerson(Customer customer);
}
