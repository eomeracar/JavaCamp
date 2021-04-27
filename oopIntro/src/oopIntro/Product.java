package oopIntro;

public class Product {
	public  Product(int id,String name,double unitPrice,String detail) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	public Product() {
		System.out.println("It worked!");
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
