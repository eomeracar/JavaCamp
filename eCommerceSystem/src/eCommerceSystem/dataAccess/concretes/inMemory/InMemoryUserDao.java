package eCommerceSystem.dataAccess.concretes.inMemory;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;


public class InMemoryUserDao implements UserDao{

	private List<User> list;
	
	public InMemoryUserDao() {
	this.list=new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		this.list.add(user);	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("updated"+user.getFirstName());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("updated"+user.getFirstName());
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.list;
	}
	@Override
	public List<User> getAll(Predicate<User> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}

}
