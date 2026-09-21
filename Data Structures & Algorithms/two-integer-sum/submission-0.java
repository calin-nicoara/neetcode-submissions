class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbersToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(numbersToIndex.containsKey(target-nums[i])) {
                return new int[] {numbersToIndex.get(target-nums[i]), i};
            }

            numbersToIndex.put(nums[i], i);
        }

        return null;
    }
}
