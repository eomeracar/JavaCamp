package interfaceAbstractDemo;


import java.util.GregorianCalendar;
import abstracts.BaseCustomerService;
import abstracts.BaseCustomerValidationService;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerService;
import concretes.StarbucksCustomerService;
import concretes.StarbucksCustomerValidationService;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		//Date date=new Date(1995,10,18);
		//date.setTime(new  Calender( 1995, 10, 18).getTime());
		/*After I control the Date Class I see that the Date Class' constructor which takes 3 parameters for 'YYYY','mm','dd' is deprecated.
		 * Therefore, I have to use GregorianCalender which is concrete subclass of Calender and can be instantiated to get date of year.  
		 */
		//System.out.println(customer2.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		
		
		GregorianCalendar gregorianCalendar=new GregorianCalendar(1881, 10, 18);

		
		Customer customer1=new Customer(1,"Ömer","Acar",gregorianCalendar.getTime(),"123456789");
		
		
		BaseCustomerValidationService customerValidationService =new StarbucksCustomerValidationService(new MernisServiceAdapter());
		BaseCustomerService starbucksCustomerService=new StarbucksCustomerService(customerValidationService);
		starbucksCustomerService.save(customer1);
		System.out.println("Nero Customer!");
		BaseCustomerService customerService1=new NeroCustomerService();
		customerService1.save(customer1);
	}

}
