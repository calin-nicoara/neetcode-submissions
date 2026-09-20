class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbersVisited = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(!numbersVisited.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}