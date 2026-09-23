class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sortedStringToStrings = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String currentString = strs[i];
            char[] charArray = currentString.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            sortedStringToStrings.putIfAbsent(sorted, new ArrayList<>());
            sortedStringToStrings.get(sorted).add(currentString);
        }

        return new ArrayList<>(sortedStringToStrings.values());
    }
}
