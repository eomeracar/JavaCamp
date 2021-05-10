package eCommerceSystem.business.concretes;

import eCommerceSystem.dataAccess.abstracts.UserActivationDao;
import eCommerceSystem.dataAccess.concretes.inMemory.InMemoryUserActivationDao;

public class UserActivationCheckManager {
	private UserActivationDao userActivationDao;
	public UserActivationCheckManager(UserActivationDao inMemoryUserActivationDao) {
		userActivationDao=inMemoryUserActivationDao;
	}
	public boolean checkActivationCode(String code) {
		if(userActivationDao.getAll().stream().filter(i->i.getActivationNumber().toString()==code).findFirst().get().getActivationNumber().toString() != null)
		{
			return true;
		}
		return false;
	}
	
}
