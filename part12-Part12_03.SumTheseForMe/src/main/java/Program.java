
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
      int[] numbers = {8, 2, 9, 1, 1};
System.out.println(sum(numbers, 0, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        
        ArrayList<Integer> searchNumber = new ArrayList<>();
        
        if(fromWhere < 0 ) {
            fromWhere = 0;
        }
        
        if(toWhere >= array.length) {
            toWhere = array.length - 1;
        }
        
        for(int i = fromWhere; i <= toWhere; i++) {
            if(array[i] >= smallest && array[i] <= largest) {
                searchNumber.add(array[i]);
            }
        }
        
        return searchNumber.stream().mapToInt(num -> num).sum();
    }

}
