
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class ShoppingCart {
    
    private Map<String, Item> shoppingCartItems;

    public ShoppingCart() {
        this.shoppingCartItems = new HashMap<>();
    }
    
    
    public void add(String product, int price) {
        if(shoppingCartItems.containsKey(product)){
            Item itemSearched = this.shoppingCartItems.get(product);
            itemSearched.increaseQuantity();
            
            this.shoppingCartItems.put(product, itemSearched);
        }else {
            this.shoppingCartItems.put(product, new Item(product, 1, price));

        }
        
        // this can be done in this way 
        // this.items.putIfAbsent(product, new Item(product, 0, price));
        // this.items.get(product).increaseQuantity();
        
    }
    
    public int price() {
        int totalPrice = 0;
        for(Item item : shoppingCartItems.values()) {
            totalPrice+= item.price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for(Item item : shoppingCartItems.values()) {
            System.out.println(item.toString());
        }
    }
    
}
