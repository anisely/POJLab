package javamarkt.markt;
import java.util.ArrayList;
public class Cart {
	ArrayList<CartItem> items = new ArrayList<>();
	ArrayList<MugPromo> promotions = new ArrayList<>();
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getProduct().getPrice();
return sum;
	}
	public ArrayList<CartItem> getItems() {
		return items;
	}
	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		return this;
	}
	
	@Override
	public String toString() {
		return "Cart [\nitems=" + items + "]";
}
	public Cart addPromotion(MugPromo p){
		promotions.add(p);
		return this;
	}
	
	public Cart applyPromotions(){
		for(MugPromo p : promotions){
			p.CalculateOffer(this);
		}
		return this;
	}
}
