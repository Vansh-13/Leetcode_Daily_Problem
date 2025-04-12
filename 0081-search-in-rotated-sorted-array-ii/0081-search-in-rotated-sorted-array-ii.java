
class Solution {

    public int findViot(int nums[]) {
        int i = 0;
        int j = nums.length - 1;
        while (i <j) {
            while(i<j && nums[i]==nums[i+1]){
                i++;
            }
            while(j>0 && nums[j]==nums[j-1]){
                j--;
            }


            int mid = i + (j - i) / 2;
            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public int b(int i, int j, int nums[], int target) {
        while (i <= j) {
            int mid = j+ (i - j) / 2;
            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findViot(nums);
        int idx = b(0, pivot - 1, nums, target);
        if (idx != -1) {
            return true;
        }
        idx = b(pivot, n - 1, nums, target);
        if(idx!=-1){
            return true;
        }
        return false;
    }
}
