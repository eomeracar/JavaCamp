package eCommerceSystem.dataAccess.concretes.inMemory;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import eCommerceSystem.dataAccess.abstracts.UserActivationDao;
import eCommerceSystem.entities.concretes.UserActivation;

public class InMemoryUserActivationDao implements UserActivationDao {

	private List<UserActivation> list;
	
	@Override
	public void add(UserActivation userActivation) {
		this.list.add(userActivation);
	}

	@Override
	public void update(UserActivation userActivation) {
		System.out.println("updated");
	}

	@Override
	public void delete(UserActivation userActivation) {
		System.out.println("deleted");
	}
	@Override
	public List<UserActivation> getAll() {
		return this.list;
	}
	@Override
	public List<UserActivation> getAll(Predicate<UserActivation> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}

}
