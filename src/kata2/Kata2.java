package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {1, 2, 8, 4, 4, 6, 2, 8, 9, 1, 6, 5, 3, 7, 8};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int x: data) {
            histogram.put(x, histogram.containsKey(x) ? histogram.get(x) + 1 : 1);
        }
        
        if (!histogram.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry: histogram.entrySet()) {
                System.out.println(entry.getKey() + "==>" + entry.getValue());
            }
        }
    }
}