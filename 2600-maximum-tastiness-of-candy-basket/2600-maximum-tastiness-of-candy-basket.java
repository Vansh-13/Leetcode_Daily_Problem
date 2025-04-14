
class Solution {
    public boolean ischeck(int mid,int price[],int k){
         int c=1;
         int p=price[0];
         for(int i=1;i<price.length;i++){
            if(price[i]-p>=mid){
                c++;
                p=price[i];
            }
            if(c>=k){
                return true;
            }
         }
         return false;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int i=0;
        int j=price[price.length-1]-price[0];
        int ans=0;
        while(i<=j){
            int mid=j+(i-j)/2;
            if(ischeck(mid,price,k)){
             ans=mid;
             i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
}