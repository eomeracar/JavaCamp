package oopIntro;
public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setUnitPrice(15000);
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		Product product2=new Product();
		
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("24 GB Ram");
		product2.setDiscount(15);
		System.out.println(product2.getUnitPriceAfterDiscount()); 
		
		Product product3=new Product();
		
		product3.setId(3);
		product3.setName("Hp 5");
		product3.setUnitPrice(10000);
		product3.setDetail("8 GB Ram");
		
		Product product4=new Product(4,"Hp 6",12500,"32 GB Ram",10,11250);
		
		Product[] products = {
				product1,
				product2,
				product3,
				product4
				};
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println(products.length);
		System.out.println(product4.getUnitPriceAfterDiscount());
		
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		ProductService productService=new ProductService();
		productService.addToCart(product1);
		
		productService.addToCart(product2);
		
		productService.addToCart(product3);
		
	}
}
