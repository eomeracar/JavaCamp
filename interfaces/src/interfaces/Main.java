package interfaces;


public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers=new Logger[] { new EmailLogger(),new DatabaseLogger(),new SmsLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer customer=new Customer(1,"Ömer","Acar");
		
		customerManager.add(customer);
	}
}
