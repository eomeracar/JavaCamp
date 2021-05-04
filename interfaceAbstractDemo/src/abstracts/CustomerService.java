package abstracts;

import entities.Customer;

public interface CustomerService {
	void save(Customer customer);
}
/*Starbucks and Nero wants to add their customers to database. 
 * Also, Starbucks wants to have mernis validation for the database implementation, Nero does not.
 */
