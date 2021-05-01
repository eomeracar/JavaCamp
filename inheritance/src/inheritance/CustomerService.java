package inheritance;

public class CustomerService {
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber()+" kaydedildi");
	}
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers)
		{
			add(customer);
		}
	}
	
	
	
	
	
	/*public void add(IndividualCustomer customer) {
		System.out.println(customer.getFirstName()+" kaydedildi");
	}
	public void add(CorporateCustomer customer) {
		System.out.println(customer.getCompanyName()+" kaydedildi");
	}*/
}
