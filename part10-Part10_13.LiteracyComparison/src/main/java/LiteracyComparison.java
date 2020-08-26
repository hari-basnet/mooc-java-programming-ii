
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyData> data = new ArrayList<>();
        
        try{
            
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .forEach(dt -> data.add(new LiteracyData(dt[3], Integer.valueOf(dt[4]), dt[2], Integer.valueOf(dt[5]))));
            
            Collections.sort(data, (c1, c2) -> c1.getLiteracyRate() - c2.getLiteracyRate());
            
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        data.stream()
                .forEach(LiteracyData::toString);
        
    }
}
