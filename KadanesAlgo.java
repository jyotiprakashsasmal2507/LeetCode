import java.util.*;
public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     /*    maxSubArray(arr); */
     int x=minSubArray(arr);
     System.out.println("The minimum subarray is "+x);
        
    }
    static void maxSubArray(int[]arr){
        if(arr.length==0){
            return;
        }
        int max_so_far=Integer.MIN_VALUE,max_ending_here=0,start=0,end=0,s=0;
        for(int i=0;i<arr.length;i++){
            max_ending_here +=arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
                start=s;
                end=i;
            }
            if(max_ending_here<0){
                max_ending_here=0;
                s=i+1;
            }
        }
        System.out.println("Maximum contiguous sum is "+max_so_far);
        System.out.println("The starting index point is "+start);
        System.out.println("The ending index point is "+end);

    }
    static int  minSubArray(int []arr){
        if(arr.length==0){
            return -1;
        }
        int min_ending_here=Integer.MAX_VALUE;
        int min_so_far=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min_ending_here>0){
                min_ending_here=arr[i];
            }
            else{
                min_ending_here +=arr[i];
                min_so_far=Math.min(min_so_far, min_ending_here);
            }
        }
        return min_so_far;
    }
    
}
