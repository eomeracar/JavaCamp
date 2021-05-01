package service;
import java.util.ArrayList;


import entity.User;

public class UserManager {
	ArrayList<User> _user;
	public UserManager() {
		this._user=new ArrayList<User>();
	}
	public void add(User user) {
		System.out.println("User -> "+user.getName()+" is added!");
		this._user.add(user);
	}
	public void multipleAdd(ArrayList<User> user) {
		for (User user2 : user) {
			add(user2);
		}
		System.out.println("Users are added!");
	}
	public void remove(User user) {
		System.out.println("User -> "+user.getName()+" is removed!");
		this._user.remove(user);
	}
	public void update(User user) {
		System.out.println("User -> "+user.getName()+" is updated!");
		int indexUser=_user.indexOf(user);
		this._user.set(indexUser,user);
	}
}
