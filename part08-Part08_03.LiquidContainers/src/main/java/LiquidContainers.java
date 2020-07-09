
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.contains() + "/100");
            System.out.println("Second: " + secondContainer.contains() + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            String command = parts[0];
            
            if(amount < 0){
                continue;
            }
            
            switch(command){
            case "add":
                
                firstContainer.add(amount);
                break;

            case "move":
                if(amount > firstContainer.contains()){
                    amount = firstContainer.contains();
                }
                
                firstContainer.remove(amount);
                secondContainer.add(amount);
                break;

            case "remove":
                secondContainer.remove(amount);
                break;

            default :
                break;
            }
        }
        
        
    }

}
