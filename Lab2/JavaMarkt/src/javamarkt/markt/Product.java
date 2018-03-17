package javamarkt.markt;

public class Product {
	
	private double price;
	private String prodname;
	
public Product(String prodname){
	this.prodname=prodname;
	}

public Product(double price){
	this.price=price;
	}

public String getName() {
	return prodname;
	}

public double getPrice() {
	return price;
	}
public Product(String prodname, double price){
	super();
	this.prodname = prodname;
	this.price = price;
	}

@Override
public String toString() {
	return "Product " + prodname ;
}

}
