package concretes;

import abstracts.BaseCustomerService;
import abstracts.BaseCustomerValidationService;
import entities.Customer;


public class StarbucksCustomerService extends BaseCustomerService {
	private BaseCustomerValidationService _customerValidationService;
	
	public StarbucksCustomerService(BaseCustomerValidationService customerValidationService) {
		this._customerValidationService=customerValidationService;
	}
	
	@Override
	public void save(Customer customer) {
		if(_customerValidationService.validateRealPerson(customer)){
		super.save(customer);
		}
	}
}
