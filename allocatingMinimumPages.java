/*

Allocating Minimum pages : 
from : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Searching/video/MjEyMA%3D%3D

Explanation:
See the naive solution explanation here : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Searching/video/MjEyMA%3D%3D
See the efficient solution explanation here : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Searching/video/MjEyNw%3D%3D
Efficient solution is self explanatory with comments


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

class Solution 
{
    
    //Time complexity of the solution : O(n * log(sum - max))
    
    // function to find whether the given input wil be feasible or not
    public static boolean isFeasibleSolution(int[] arr,int target, int k){
        
        int reqStd = 1,sum = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            
            if(sum + arr[i] <= target){
                // if the sum added with currElement will be less than target
                // then take the currElement into account, if this process, exceeds the sum
                // greater than target, then go to next student
                sum += arr[i];
            }
            else {
                reqStd++;
                sum = arr[i];
                // increment the no.of students and assign the sum to currElement as 
                // we re-initialise our array here for again calculating the sum
            }
        }
        
        //If the no.of students required is greater than k, then the solution is not feasible
        return (reqStd <= k);
        
    }
    
    
    //Function to find minimum number of pages.
    public static int findPages(int[]arr,int n,int k)
    {
        
        int sum = 0, max = 0; 
        // assigning max to 0 as we are sure that the
        // array contains no.of pages in books that can't be negative
        
        
        for(int i = 0;i<n;i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        
        //handling exceptions
        if(k == 1)
            return sum;
        if(n == 1)
            return arr[0];
        if(k > n)
            return -1;
        
        int res = 0; //result initialisation
        int low = max, high = sum;
        // we are doing binary search for the pseudo array [max,sum] 
        // where max is the maximum of the element and sum is the sum of all element 
        // element here is the no.of pages in specific book
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(isFeasibleSolution(arr,mid,k)){
                // if the currentElement is feasible, then higher
                // element also feasible. But lower element may or may not be feasible
                // As we are trying to lower the answer, we traverse to the left half of the array
                res = mid;
                high = mid - 1;
            }
            else {
                // current answer won't be feasible, so that we can see any
                // answers that are greater than currAnswer
                low = mid + 1;
            }
        }
        
        return res;
        
    }
};
