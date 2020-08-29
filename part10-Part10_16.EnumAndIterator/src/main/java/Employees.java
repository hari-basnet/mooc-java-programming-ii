
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    
    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while(iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }
    
    public void print() {
        
        Iterator<Person> iter = this.persons.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
    public void print(Education education) {
        
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            Person p = iterator.next();
            if(education.equals(p.getEducation())) {
                System.out.println(p.toString());
            }
        }
        
    }
    
    public void fire(Education education) {
        
        Iterator<Person> iterator = this.persons.iterator();
        
        while(iterator.hasNext()) {
            Education ed = iterator.next().getEducation();
            if(education.equals(ed)) {
                iterator.remove();
            }
        }
    }
}
