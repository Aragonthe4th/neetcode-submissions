class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char [] chararr = strs[i].toCharArray();
            Arrays.sort(chararr);
            String key = new String(chararr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
