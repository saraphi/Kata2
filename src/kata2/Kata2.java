package kata2;

import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
                
        if (!histogr.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
                System.out.println(entry.getKey() + "==>" + entry.getValue());
            }
        }
    }
}