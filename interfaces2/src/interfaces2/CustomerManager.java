package interfaces2;

public class CustomerManager {
	private CustomerDal _customerDal;
	public CustomerManager(CustomerDal customerDal) {
		this._customerDal=customerDal;
	}
	public void add() {
		_customerDal.add();
	}
	
}
