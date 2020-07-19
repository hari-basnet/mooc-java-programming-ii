
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
        
        return 0;
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    
}
