package eCommerceSystem.core.register.googleRegister;

import eCommerceSystem.core.register.RegisterService;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleRegister.GoogleRegister;

public class GoogleRegisterManagerAdapter implements RegisterService {
	
	GoogleRegister googleRegister=new GoogleRegister();
	@Override
	public boolean register(User user) {
		return googleRegister.register(user.getEmail(),user.getPassword());
	}
}
