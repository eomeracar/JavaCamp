package inheritance;


public class Main {

	public static void main(String[] args) {
		//base class-->super Class
		IndividualCustomer omer =new IndividualCustomer("Ömer","Acar","11111");

		omer.setCustomerNumber("11111");
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.setCompanyName("Hepsiburada");
		hepsiBurada.setCustomerNumber("1357");
		CustomerService customerService=new CustomerService();
		SyndicateCustomer abc=new SyndicateCustomer(); 
	 	abc.setCustomerNumber("9999");
		 
		Customer[] customers= {omer,hepsiBurada,abc};
		customerService.addMultiple(customers);
	}
}
