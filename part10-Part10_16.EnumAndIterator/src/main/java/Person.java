/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Person {
    
    private Education education;
    private String name;

    public Person(String name, Education education) {
        this.education = education;
        this.name = name;
    }
    
    public Education getEducation() {
        return this.education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education;
    }
    
    
    
}
