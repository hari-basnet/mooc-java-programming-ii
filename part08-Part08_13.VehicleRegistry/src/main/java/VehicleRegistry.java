
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        if(registry.get(licensePlate) == null){
            this.registry.put(licensePlate, owner);
            return true;
        }
       
        for(Map.Entry<LicensePlate, String> entry : registry.entrySet()){
            if(entry.getKey().equals(licensePlate)){
                return false;
            }
            
            if(entry.getValue().equals(owner)){
                return false;
            }
        }
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if(this.registry.keySet().contains(licensePlate)){
            return this.registry.get(licensePlate);
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(registry.keySet().contains(licensePlate)){
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l : registry.keySet()){
            System.out.println(l.toString());
        }
    }
    
    public void printOwners(){
        
        Set<String> owners = new HashSet<>(registry.values());
        // alternative solution 
        // registry.values().stream().distinct().forEach(System.out::println);
        for(String s : owners){
            System.out.println(s);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.registry);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        return Objects.equals(this.registry, other.registry);
    }
    
    
}
