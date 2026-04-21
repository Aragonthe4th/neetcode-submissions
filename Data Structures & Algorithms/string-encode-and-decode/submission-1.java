class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) { 
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimiter));
            i = delimiter + 1;
            String s = str.substring(i, i + len);
            decoded.add(s);
            i += len;
        }
        return decoded;
    }
}