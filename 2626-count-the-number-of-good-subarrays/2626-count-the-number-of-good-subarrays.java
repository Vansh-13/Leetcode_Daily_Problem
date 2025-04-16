class Solution {
    public long countGood(int[] nums, int k) {
        long ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        long pair = 0;

        while (j < nums.length) {
            if (mp.containsKey(nums[j])) {
                pair += mp.get(nums[j]);
                mp.put(nums[j], mp.get(nums[j]) + 1);
            } else {
                mp.put(nums[j], 1);
            }

            while (pair >= k) {
                ans += (nums.length - j);
                pair -= (mp.get(nums[i]) - 1);
                mp.put(nums[i], mp.get(nums[i]) - 1);
                i++;
            }
            j++;
        }

        return ans; 
    }
}
