import java.util.HashSet;
import java.util.Set;

public class TransactionAnalyzerImpl implements TransactionAnalyzer {
    
    @Override
    public int countPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> uniquePairs = new HashSet<>();
        
        for (int price : arr) {
            int complement = target - price;
            if (seen.contains(complement)) {
                // Create a unique pair representation
                String pair = Math.min(price, complement) + "," + Math.max(price, complement);
                uniquePairs.add(pair);
            }
            seen.add(price);
        }
        
        return uniquePairs.size();
    }
}