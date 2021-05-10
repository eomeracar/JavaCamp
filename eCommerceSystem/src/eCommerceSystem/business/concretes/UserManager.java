package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.abstracts.UserValidationService;
import eCommerceSystem.entities.abstracts.Entity;
import eCommerceSystem.entities.concretes.User;
public class UserManager implements UserService {
	private User user;
	private UserActivationCheckManager userActivationCheckManager;
	private UserValidationService userValidationService;
	private UserCheckService userCheckService;
	public UserManager(Entity entity,UserActivationCheckManager userActivationCheckManager,
			UserCheckManager userCheckManager,UserValidationManager userValidationManager) {
		this.user=user;
		this.userActivationCheckManager=userActivationCheckManager;
		this.userCheckService=userCheckManager;
		this.userValidationService=userValidationManager;
	}
	public String ActivationCode(String code) {
		if(this.userActivationCheckManager.checkActivationCode(code)) {
			user.setActive(true);
			return "Success";
		}
		return "Fail";
	}
	@Override
	public boolean register(User user) {
		//userCheckService.checkDuplicate(user.getEmail());
		return false;
	}
}
