/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author habasnet
 */
public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }
    
    public boolean load() {
        
        try(Scanner fileScanner = new Scanner(Paths.get(this.file))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0].trim(), parts[1].trim());
            }
        }catch(Exception e ) {
            System.out.println("Error: " + e);
            return false;
        }
        
        return true;

    }
    
    public boolean save() {
        
        try{
            PrintWriter printWriter = new PrintWriter(this.file);
            for(Map.Entry<String, String> entry : dictionary.entrySet()) {
                printWriter.println(entry.getKey() + ":" + entry.getValue());
            }
            
            printWriter.close();
        }catch(Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        
        return true;
    }
    
    public void add(String words, String translation) {
        if(dictionary.containsKey(words)) {
            return;
        }else {
            this.dictionary.put(words, translation);
        }
    }
        

    public String translate(String word) {
        if(this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }else if(this.dictionary.containsValue(word)){
            return this.dictionary.keySet()
                    .stream()
                    .filter(key -> word.equals(dictionary.get(key)))
                    .findFirst()
                    .get();
        }else {
            return null;
        }
        
    }
    
    public void delete(String word) {
        if(dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }else if( this.dictionary.containsValue(word)) {
            this.dictionary.remove(getKey(dictionary, word));
        }else {
            System.out.println("null");
        }
    }
    
    private <K, V> K getKey(Map<K, V> map, V value) {
	return map.keySet()
                .stream()
                .filter(key -> value.equals(map.get(key)))
                .findFirst().get();
    }   
}
