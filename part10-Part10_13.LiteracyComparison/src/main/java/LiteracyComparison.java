
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyData> data = new ArrayList<>();
        
        try{
            
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .forEach(dt -> data.add(new LiteracyData(dt[3], Integer.valueOf(dt[4]), dt[2].trim().split(" ")[0], Double.valueOf(dt[5]))));
            
            
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        Collections.sort(data, Comparator.comparingDouble(LiteracyData::getLiteracyRate));
        data.stream()
                .forEach(d -> System.out.println(d.toString()));
        
        
//         results.stream().sorted((t1, t2) -> {
//            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
//                return 1;
//            }
//            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
//                return -1;
//            }
//            return 0;
//        }).forEach(t -> System.out.println(t));
        
    }
}
