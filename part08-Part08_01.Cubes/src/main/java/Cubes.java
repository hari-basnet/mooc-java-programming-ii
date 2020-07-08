
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("end")){
                break;
            }
            System.out.println(printCube(Integer.valueOf(input)));
            
        }
    }
    
    public static int printCube(int number){
        return number * number * number;
    }
}
