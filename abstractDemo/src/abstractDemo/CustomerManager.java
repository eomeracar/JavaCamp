package abstractDemo;

public class CustomerManager {
	
	 BaseDatabaseManager baseDatabaseManager;
	public CustomerManager()
	{
		
	}
	
	public void getCustomers() {
		baseDatabaseManager.getData();
	}
}
