package javamarkt.markt;

public class Promotion implements MugPromo{

	public boolean CanCalculate(Cart cart){
		double cartBrutto = cart.totalPriceOfProducts();
		if(cartBrutto >=200)
			return true;
		else
			return false;
	}
	boolean mugAdded(Cart cart){
		boolean itIs= false;
		for(CartItem it : cart.getItems()){
			if(it.getProduct().getName().equals("Kubek promocyjny"))
				itIs = true;
		}
		return itIs;
	}
	public void CalculateOffer(Cart cart){
		if(this.CanCalculate(cart)&& !this.mugAdded(cart))
			cart.addProduct(new Product("Kubek promocyjny", 0.01));
		
	}
}
