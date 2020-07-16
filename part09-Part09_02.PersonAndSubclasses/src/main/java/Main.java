
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your test code here
        Student s = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028"); 
        System.out.print(s);
        
        Teacher t = new Teacher("Joel Kaasinen","Haagantie 123", 980); 
        System.out.print(t);
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for(Person p : persons){
            System.out.print(p);
        }
    }

}
