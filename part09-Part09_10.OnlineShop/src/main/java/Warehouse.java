
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    
    private Map<String, Integer> productAndPrice;
    private Map<String, Integer> productAndBalance;
    

    public Warehouse() {
        this.productAndPrice = new HashMap<>();
        this.productAndBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productAndPrice.put(product, price);
        this.productAndBalance.put(product, stock);
    }
    
    public int price(String product) {
        if(productAndPrice.containsKey(product)) {
            return productAndPrice.get(product);
        }
        
        return -99;
    }
    
    // returns amount of items in the Warehouse
    public int stock(String product) {
        if(productAndBalance.containsKey(product)){
            return productAndBalance.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        if(productAndBalance.containsKey(product)) {
            if(productAndBalance.get(product) > 0) {
                productAndBalance.put(product, productAndBalance.get(product) -1);
                return true;
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        return productAndPrice.keySet();
    }
}
