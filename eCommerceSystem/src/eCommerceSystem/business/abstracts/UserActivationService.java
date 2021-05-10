package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.UserActivation;

public interface UserActivationService {
	String sendActivationMail(UserActivation user);
	
}
