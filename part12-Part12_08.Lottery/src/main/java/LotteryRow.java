
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        
        int count = 0;
        
        while(count < 7) {

            Random random = new Random();
            int randomNumber = random.nextInt(40) + 1;
                
            if(!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
            }else{
                continue;
            }
            count++;
        }
            
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.contains(number)){
                return true;
            }
        }
        return false;
    }
}

