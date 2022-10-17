package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
    private final int[] data;
    
    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int x: data) {
            histogram.put(x, histogram.containsKey(x) ? histogram.get(x) + 1 : 1);
        }
        
        return histogram;
    }
}
