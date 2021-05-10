package eCommerceSystem;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.dataAccess.concretes.inMemory.InMemoryUserDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User karco=new User(1,
				"Karcan",
				"Özbal",
				"karcanozbal@hotmail.com.tr",
				"123456");
		User omerUser= new User(2,
				"Ömer",
				"Acar",
				"acar.0mer@hotmail.com",
				"123456");
		UserDao userDao=new InMemoryUserDao();
		userDao.add(karco);
		userDao.add(omerUser);
		userDao.getAll(user -> user.getFirstName() == "Karcan").forEach(user -> {
			System.out.println(user.getFirstName());
			
			
			//TODO "Register and Login must be added!"
			
		});
	}
}	
