
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

     public static double printPositiveAverage(ArrayList<String> inputs) {
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();
    }
    
    
    public static double printNegativeAverage(ArrayList<String> inputs) {
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        ArrayList<String> inputs = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String command = scanner.nextLine();
        
        switch(command) {
            case "n": 
                System.out.println("Average of the negative numbers: " + printNegativeAverage(inputs));
                break;
            case "p":
                System.out.println("Average of the positive numbers: " + printPositiveAverage(inputs));
                break;
            default: 
                break;
        }

    }
}
