package javamarkt.markt;

public class Main{
	
	public static void main(String[]args){
		Cart cart = new Cart();
		cart.addProduct(new Product("Something",42.5));
		cart.addProduct(new Product("Else",452.1));
		
		System.out.println(cart);
	
		cart.addPromotion(new Promotion());
		cart.applyPromotions();
		
		System.out.println(cart);
		
		cart.addPromotion(new Promotion2());
		cart.applyPromotions();
		
		System.out.println(cart);
	}
	
}