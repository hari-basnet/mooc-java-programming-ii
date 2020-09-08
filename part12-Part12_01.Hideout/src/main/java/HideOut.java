

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class HideOut<T> {
    
    private T inHiding;
    
    public void putIntoHideout(T toHide) {
      this.inHiding = toHide;
    }
    
    public T takeFromHideout(T toTake) {
        T previouslyInHiding = this.inHiding;
        this.inHiding = null;
        return previouslyInHiding;
    }
    
    public boolean isInHideout(T item) {
       return this.inHiding != null;
    } 
}
