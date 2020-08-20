
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Box implements Packable {
    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable packable) {
    
        if(currentWeight() + packable.weight() < capacity) {
            this.items.add(packable);
        }
    }
    
    @Override
    public double weight() {
        return currentWeight();
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + currentWeight() + " kg";
    }
    
    private double currentWeight() {
        double currWeight = 0.0;
        for(Packable p : items) {
            currWeight += p.weight();
        }
        
        return currWeight;
    }
    
    

   
    
}
