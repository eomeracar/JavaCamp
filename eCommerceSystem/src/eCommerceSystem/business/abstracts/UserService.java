package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.abstracts.Entity;
import eCommerceSystem.entities.concretes.User;

public interface UserService {

	boolean register(User user);
}
