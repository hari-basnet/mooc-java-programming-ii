
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
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.removeAll(history);
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        double largestValue = this.history.get(0);
        
        for(double d : history){
            if(d >= largestValue){
                largestValue = d;
            }
        }
        
        return largestValue;
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double smallestValue = this.history.get(0);
        
        for(double d : history){
            if(d <= smallestValue){
                smallestValue = d;
            }
        }
        
        return smallestValue;
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        double sum = 0;
        
        for(double d : this.history){
            sum += d;
        }
        
        return 1.0 * sum / this.history.size();
    }
    
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    
}
