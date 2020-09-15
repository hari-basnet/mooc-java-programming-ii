
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class HashMapy<K, V> {
    
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMapy(List<Pair<K, V>>[] values, int firstFreeIndex) {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    
    
}
