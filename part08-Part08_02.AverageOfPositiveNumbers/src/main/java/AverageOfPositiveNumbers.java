
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0){
                break;
            }
            
            if(input > 0){
                numbers.add(input);
            }
             
        }
        
        
        
        int sum = 0;
        double average = 0;
        if(numbers.isEmpty()){
            System.out.println("Cannot calculate the average");
        }else {

            for(int i : numbers){
                sum += i;
            }
            
            average = 1.0 * sum / numbers.size();
            System.out.println(average);
        }
        
        
    }
}
