package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("It is added using hibernate "+ product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("It is updated using hibernate "+ product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("It is deleted using hibernate "+ product.getName());
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
