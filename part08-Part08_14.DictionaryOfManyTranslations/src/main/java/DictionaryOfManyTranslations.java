
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // an empty list has to be added for the new word
        // if it has not been added 
        
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        // add the translations 
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        if(this.dictionary.keySet().contains(word)){
            this.dictionary.remove(word);
        }else {
            System.out.println("Not found");
        }
    }
}
