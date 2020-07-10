
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> nicknamesMap = new HashMap<>();
        
        nicknamesMap.put("mathew", "matt");
        nicknamesMap.put("michael", "mix");
        nicknamesMap.put("arthur", "artie");
        
        System.out.println(nicknamesMap.get("michael"));
        
    }

}
