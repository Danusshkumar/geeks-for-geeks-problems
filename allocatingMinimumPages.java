/*

Allocating Minimum pages : 
from : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Searching/video/MjEyMA%3D%3D


*/

// Naive method
public class AllocateMinimumPages {

    public static int sum(int[] arr,int start,int end){
        int sum = 0;
        for(int i = start;i<=end;i++){
            sum += arr[i];
        }
        return sum;
    }


    public static int minPages(int[] arr,int n, int k){
        if(k == 1)
            return sum(arr,0,n - 1);
        
        if(n == 1)
            return arr[0];
        
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            //considering starting element or first element of current piece as cutting point
            // this is the starting point where we calculate the sum
            res = Math.min(
                    res,
                    Math.max(
                        minPages(arr,i,k - 1),
                        sum(arr,i,n - 1)
                    )
                );
        }

        return res;
    }
}


//efficient method
