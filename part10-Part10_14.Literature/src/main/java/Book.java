/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)" ;
    }
    
//    it can be done this way by implementing Comparable      
//     @Override
//    public int compareTo(Book o) {
//        if (this.age == o.age) {
//            return this.name.compareTo(o.name);
//        }
// 
//        return this.age - o.age;
//    }
}
