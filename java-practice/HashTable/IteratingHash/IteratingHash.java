import java.util.Hashtable;
import java.util.Map;

public class IteratingHash {

    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Vishal", 10);
        ht.put("Crystal", 30);
        ht.put("Lishal", 20);

        for (Map.Entry<String, Integer> e : ht.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
