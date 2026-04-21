public class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency maps for both strings
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        // Count character frequencies for both strings
        for (int i = 0; i < s.length(); i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            countS.put(charFromS, countS.getOrDefault(charFromS, 0) + 1);
            countT.put(charFromT, countT.getOrDefault(charFromT, 0) + 1);
        }

        // Compare the two frequency maps
        return countS.equals(countT);
    }
}
