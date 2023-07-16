class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

    int max=0;
        int count=1;
        int candidate,i;
        for( i=1;i<n;i++){
            if(nums[max]==nums[i]){
                count ++;

            }
            else{
                count--;

            }
            if(count==0){
                max=i;
                count=1;
            }
        }
       candidate=nums[max];
        count=0;
        for(i=0;i<n;i++){
            if(nums[i]==candidate){
                count++;
            }
        }
        if(count>n/2){
            return nums[max];

        }
        return 0;
    }
}