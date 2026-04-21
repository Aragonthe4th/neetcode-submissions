class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];
            for(int j = i + 1; j < numbers.length; j++) {  // Start from i+1 to avoid duplicates
                if(numbers[j] == x) {
                    return new int[] {i + 1, j + 1};  // Return INDICES (1-indexed)
                }
            }
        }
        return new int[] {0};
    }
}