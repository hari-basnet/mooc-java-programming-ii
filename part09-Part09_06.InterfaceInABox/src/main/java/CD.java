/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class CD implements Packable {
    
    private String title;
    private String artist;
    private int publishedYear;
    private double weight;

    public CD(String title, String artist, int publishedYear) {
        this.title = title;
        this.artist = artist;
        this.publishedYear = publishedYear;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.title + ": " + this.artist + " (" + this.publishedYear + ")";
    }
}
