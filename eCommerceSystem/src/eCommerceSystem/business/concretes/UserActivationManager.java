package eCommerceSystem.business.concretes;


import eCommerceSystem.business.abstracts.UserActivationService;
import eCommerceSystem.dataAccess.abstracts.UserActivationDao;
import eCommerceSystem.dataAccess.concretes.inMemory.InMemoryUserActivationDao;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.entities.concretes.UserActivation;

public class UserActivationManager implements UserActivationService{
	private UserActivationDao userActivationDao;
	private UserActivationCheckManager userActivationCheckManager;
	public UserActivationManager(UserActivationDao inMemoryUserActivationDao,UserActivationCheckManager userActivationCheckManager) {
		userActivationDao=new InMemoryUserActivationDao();
		userActivationCheckManager=new UserActivationCheckManager(inMemoryUserActivationDao);
	}
	@Override
	public String sendActivationMail(UserActivation userActivation) {
		userActivationDao.add(userActivation);
		return "Mail is sent";
	}
	public void Add(UserActivationDao userActivationDao,User user) {
		//userActivationDao.add(new UserActivation(1,user.getId(),userActivationDao.getAll().stream().
	}
	
}
