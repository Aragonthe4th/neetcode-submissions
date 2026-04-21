class Solution {
    public boolean isAnagram(String s, String t) {

        if( s.length() != t.length()) {return false;}


        char [] charS = s.toCharArray();
        char [] chart = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(chart);

        return Arrays.equals(charS, chart);

    }
}
