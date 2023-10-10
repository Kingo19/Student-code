package pkg;

import Items.CandyStoreItems;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CandyStoreItems> cartItems = new ArrayList<>();

    public void addToCart(CandyStoreItems candyToAdd) {
        cartItems.add(candyToAdd);
    }

    public double getTotal() {
        double total = 0;

        for (CandyStoreItems currentCandy : cartItems) {
            double itemTotal = currentCandy.getPrice() * currentCandy.getQuantity();
            total = total + itemTotal;
        }
        return total;
    }
    public List<CandyStoreItems> getCartItems() {
        return cartItems;
    }

}



