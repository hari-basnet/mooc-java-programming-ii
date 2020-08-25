
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();
        
        String input = scanner.nextLine();
        
        while(true) {
            
            if(input.equals("")){
                break;
            }
            
            inputs.add(input);
        }
        
        String combined = inputs.stream()
                            .reduce("",(previousString, word) -> previousString + word + "\n");
        System.out.println(combined);
    }
}
