
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit, new ArrayList<String>());
    }
    
    public void remove(String storageUnit, String item){
        // alternative solution 
        // check if the map has key (storageUnit) 
        // if not return
        int sizeU = this.storage.get(storageUnit).size();
        int count = 0;
        while(count < sizeU){
            if(this.storage.get(storageUnit).contains(item)){
                this.storage.get(storageUnit).remove(item);
                if(this.storage.get(storageUnit).isEmpty()){
                    this.storage.remove(storageUnit);
                }
                break;
            }
            count++;
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnitWithItems = new ArrayList<>();
        
        for(Map.Entry<String, ArrayList<String>> entry : this.storage.entrySet()){
            
            if(!entry.getValue().isEmpty()){
                storageUnitWithItems.add(entry.getKey());
            }
        }
        
        return storageUnitWithItems;
    }
}
