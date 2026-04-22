class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> mymap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char [] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            mymap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(mymap.values());
        
    }
}
