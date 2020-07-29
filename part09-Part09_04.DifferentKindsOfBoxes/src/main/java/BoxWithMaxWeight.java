
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
       
        if(item.getWeight() + getTotalWeight() <= capacity){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i : items){
            if(i.equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BoxWithMaxWeight{" + "capacity=" + capacity + ", items=" + items + '}';
    }
    
    
    
    private int getTotalWeight(){
        int totalWeight = 0;
        
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
}
