package abstracts;

import entities.Customer;

public abstract class BaseCustomerService implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db "+customer.getFirstName());
	}
}
