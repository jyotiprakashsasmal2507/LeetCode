class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
    int []ans =new int[n];
    int k=1;
    for(int i=0;i<n;i+=2){
        if(nums[i]%2==1){
            while(nums[k]%2==1){
                k+=2;
            }
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
        }
        
    }
    return nums;
}
}