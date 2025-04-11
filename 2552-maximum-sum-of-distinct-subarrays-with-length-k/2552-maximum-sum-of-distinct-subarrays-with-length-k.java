class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = k - 1;
        long sum = 0;
        long ans = Integer.MIN_VALUE;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int t = 0; t <= j; t++) {
            mp.put(nums[t], mp.getOrDefault(nums[t], 0) + 1);
            sum += nums[t];
        }
        if (mp.size()== k) {
            ans = Math.max(ans, sum);
        }
        i++;
        j++;
        while (j < nums.length) {
            mp.put(nums[i - 1], mp.get(nums[i - 1]) - 1);
            if (mp.get(nums[i - 1]) == 0) {
                mp.remove(nums[i - 1]);
            }
            sum -= nums[i - 1];
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            sum += nums[j];

            if (mp.size() == k) {
                ans = Math.max(ans, sum);
            }
            i++;
            j++;
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}
