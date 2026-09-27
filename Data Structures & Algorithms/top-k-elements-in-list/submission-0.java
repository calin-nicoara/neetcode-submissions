class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer current = count.getOrDefault(nums[i], 0);
            count.put(nums[i], current+1);
        }

        return count.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(x -> x)
                .toArray();
    }
}
