
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
public class Warehouse {
    
    private Map<String, Integer> products;

    public Warehouse() {
        this.products = new HashMap<>();
    }
    
    
    
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
    }
}
