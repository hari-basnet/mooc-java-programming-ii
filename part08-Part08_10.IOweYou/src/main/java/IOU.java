
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class IOU {
    private HashMap<String, Double> loanMap;
            
    public IOU() {
        this.loanMap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.loanMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.loanMap.getOrDefault(toWhom, 0.0);
    }
}
