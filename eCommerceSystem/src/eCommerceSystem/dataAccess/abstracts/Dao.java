package eCommerceSystem.dataAccess.abstracts;


import java.util.List;
import java.util.function.Predicate;

public interface Dao<T extends eCommerceSystem.entities.abstracts.Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	List<T> getAll();
	List<T> getAll(Predicate<T> predicate);
}
