package inheritance2;

public class Main {

	public static void main(String[] args) {
		Logger emailLogger=new EmailLogger();
		Logger fileLogger=new FileLogger();
		fileLogger.log();
		
		CustomerService customerService=new CustomerService();
		customerService.add(new FileLogger());
		
	}

}
