
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        
        myList.add("ram");
        myList.add("Shyam");
        
        System.out.println(myList.toString());

        myList.remove("ram");
        
        System.out.println(myList.toString());

    }

}
