package oopIntro;
public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";
		Product product2=new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="24 GB Ram";
		
		Product product3=new Product();
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		Product product4=new Product(4,"Hp 6",12500,"32 GB Ram");
		
		Product[] products = {
				product1,
				product2,
				product3,
				product4
				};
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		
		Category category1= new Category();
		category1.id=1;
		category1.name="Computer";
		
		Category category2= new Category();
		category2.id=2;
		category2.name="Home/Garden";
		
		
		ProductService productService=new ProductService();
		productService.addToCart(product1);
		
		productService.addToCart(product2);
		
		productService.addToCart(product3);
		
	}
}
