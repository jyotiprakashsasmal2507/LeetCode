class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int size=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            size-=nums[i];
        }
        return size;
        
    }
    }
