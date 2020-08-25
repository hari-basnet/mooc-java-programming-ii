
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
public class Herd implements Movable {

    private ArrayList<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }
    
    @Override
    public String toString() {
        String returnValue = "";
        
        for(Movable m : this.movables) {
            returnValue += m + "\n";
        }
        return returnValue;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.movables) {
            m.move(dx, dy);
            
        }
    }
    
    
}
