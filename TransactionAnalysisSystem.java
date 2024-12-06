public class TransactionAnalysisSystem {
    public static void main(String[] args) {
        TransactionAnalyzer analyzer = new TransactionAnalyzerImpl();
        
        // Test case 1
        int[] arr1 = {1, 5, 7, -1, 5};
        int target1 = 6;
        int result1 = analyzer.countPairs(arr1, target1);
        System.out.println("Input: arr[] = {1, 5, 7, -1, 5}, target = 6");
        System.out.println("Output: " + result1); // Expected Output: 3
        
        // Test case 2
        int[] arr2 = {2, 4, 3, 5, 6};
        int target2 = 8;
        int result2 = analyzer.countPairs(arr2, target2);
        System.out.println("Input: arr[] = {2, 4, 3, 5, 6}, target = 8");
        System.out.println("Output: " + result2); // Expected Output: 2
    }
}