
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        
        int houMany = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < houMany; i++ ) {
            Random random = new Random();
            int randomNumber = random.nextInt(11);
            
            System.out.println(randomNumber);
        }
    }

}
