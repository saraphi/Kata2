package kata2;

import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        
        int[] data = {1, 2, 8, 4, 4, 6, 2, 8, 1, 6, 5, 3, 7, 8};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
                
        if (!histogr.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
                System.out.println(entry.getKey() + "==>" + entry.getValue());
            }
        }
    }
}