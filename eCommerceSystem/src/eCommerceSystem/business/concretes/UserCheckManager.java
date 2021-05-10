package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.UserCheckService;
import eCommerceSystem.dataAccess.abstracts.UserDao;

public class UserCheckManager implements UserCheckService{
	private UserDao userDao;
	public UserCheckManager(UserDao userDao) {
		this.userDao=userDao;
	}
	public boolean checkDuplicate(String email) {
		if(this.userDao.getAll(i->i.getEmail()==email) ==null) {
			return false;
		}
		return true;
	}
}
