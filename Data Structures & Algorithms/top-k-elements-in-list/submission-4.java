class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Make map to count how many time each number show
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            // If number already there, add 1. If not, start with 1.
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Make small heap to keep only k most show number
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()  // Sort by small number first
        );

        // Go through each number and how many time it show
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            minHeap.offer(entry);  // Put in heap
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove smallest one if more than k
            }
        }

        // Take out number from heap, put in result
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll().getKey();  // Get number, not count
        }

        return result;  // Give back the k most show number
    }
}
