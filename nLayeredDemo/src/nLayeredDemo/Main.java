package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;


public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IOC ile çözülecek.
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter(new jLoggerManager()));
		Product product=new Product(1, 2, "Elma", 12,50);
		productService.add(product);
	}

}
