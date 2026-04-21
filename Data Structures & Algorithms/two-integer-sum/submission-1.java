class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complecent = target - nums[i];

            if(map.containsKey(complecent)){
                return new int [] {map.get(complecent), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
