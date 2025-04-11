class Solution {
    static int result;
    static int arr[];

    public void binary(int i, int nums[], int k) {
        int l = 0;
        int r = i;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = i - mid + 1;
            int windowSum = count * nums[i];
          int originalSum = arr[i] - (mid > 0 ? arr[mid - 1] : 0);

           

            int operations = windowSum - originalSum;

            if (operations <= k) {
                result = Math.max(result, count);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
    }

    public int maxFrequency(int[] nums, int k) {
        arr = new int[nums.length];
        result = 1;
        Arrays.sort(nums);
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            binary(i, nums, k);
        }

        return result;
    }
}
