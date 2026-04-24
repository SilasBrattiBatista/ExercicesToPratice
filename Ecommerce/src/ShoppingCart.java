import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CartItem> items = new ArrayList<CartItem>();

    public void addItem(CartItem cartItem) {
        this.items.add(cartItem);
    }
}