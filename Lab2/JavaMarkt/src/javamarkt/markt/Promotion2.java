package javamarkt.markt;

//import java.util.ArrayList;

public class Promotion2 implements MugPromo{

	public boolean CanCalculate(Cart cart){
		boolean itIs = false;
		for(CartItem it : cart.getItems()){
			if(it.getProduct().getName().equals("Something"))
				itIs = true;
		}
		return itIs;
	}
	public void CalculateOffer(Cart cart){
		for(CartItem it : cart.getItems()){
			if(it.getProduct().getName().equals("Something"))
				it.changePricePromo();
		}
	}
}
