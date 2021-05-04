package abstracts;

import entities.Customer;

public interface CustomerValidationService {
	boolean validateRealPerson(Customer customer);
}
