
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card.toString()));
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public void sortBySuit() {
         Collections.sort(this.hand, new SortBySuit());
    }

    @Override
    public int compareTo(Hand o) {
        return Integer.compare(this.sum(), o.sum());
    }
    
    private int sum() {
        int sum = 0;
        
        for(Card c : hand) {
            sum += c.getValue();
        }
        
        return sum;
    }
}
