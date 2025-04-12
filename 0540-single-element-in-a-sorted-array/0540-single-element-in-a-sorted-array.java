class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n=nums.length;
      int l=0;
      int h=n-1;
while(l<h){
    int mid=h+(l-h)/2;
    //right side even or odd
    boolean is=false;
    if((h-mid)%2==0){
        is=true;
    }
    else{
        is=false;
    }
    if(nums[mid]==nums[mid+1]){
     if(is){
     l=mid+2;
     }else{
    h=mid-1;
     }
    }else{
       if(is){
        h=mid;
       }else{
        l=mid+1;
       }
    }

}
return nums[l];
    }
}