/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class List<Type> {
    
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
    }
    
    public void add(Type value) {
        
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }
        
        System.out.println(firstFreeIndex);
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
        System.out.println(firstFreeIndex);
    }
    
    public boolean contains(Type value) {
        for(int i = 0; i < this.firstFreeIndex; i++) {
            if(this.values[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    private void grow() {
        
        int newSize = firstFreeIndex + firstFreeIndex / 2;
        
        Type[] newValues = (Type[]) new Object[newSize];
        
        for(int i = 0; i < this.firstFreeIndex; i++) {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
}
