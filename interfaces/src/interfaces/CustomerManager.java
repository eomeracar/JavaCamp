package interfaces;


public class CustomerManager {
	
	private Logger []loggers;
	public CustomerManager(Logger []logger) {
		
		this.loggers = logger;
	}
	
	
	//loosely coupled->Geniş bağımlılık - tightly coupled ->Sıkı sıkıya(Katı) bağlılık
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi "+customer.getFirstName());	
		Utils.runLoggers(loggers, customer.getFirstName());
		/*for (Logger logger2 : loggers) {
			logger2.log(message);
		}*/

	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi "+customer.getFirstName());	
	}
	
}
