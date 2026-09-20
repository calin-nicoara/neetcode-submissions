class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charsInS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(charsInS.containsKey(c)) {
                charsInS.put(c, charsInS.get(c) + 1);
            } else {
                charsInS.put(c, 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if(!charsInS.containsKey(c)) {
                return false;
            }

            Integer numC = charsInS.get(c);

            if(numC == 1) {
                charsInS.remove(c);   
            } else {
                charsInS.put(c, numC - 1);
            }
        }


        return charsInS.isEmpty();
    }
}
