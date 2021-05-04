package concretes;

import abstracts.BaseCustomerValidationService;
import adapters.MernisServiceAdapter;
import entities.Customer;

public class StarbucksCustomerValidationService extends BaseCustomerValidationService{

	private MernisServiceAdapter _mernisServiceAdapter;
	public StarbucksCustomerValidationService(MernisServiceAdapter mernisServiceAdapter) {
		this._mernisServiceAdapter=mernisServiceAdapter;
	}
	@Override
	public boolean validateRealPerson(Customer customer) {
				if(_mernisServiceAdapter.validateRealPerson(customer)){
					System.out.println("Validation is success");
					return true;
				}
					System.out.println("Validation is failed");
					return false;
	}
}
