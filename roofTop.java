/*

Roof Top

You are given heights of consecutive buildings. You can move from the roof of a building to the roof of next adjacent building. 
You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

Explanation:

If there is drop from current building to next building then reset the curr to 0.
If not then increment the curr and update the res with curr (update the res with curr if curr is greater than res)

*/

class Solution
{
    static int maxStep(int arr[], int n)
    {
        int res = 0;
        /*
            We have to find whether the next move will be upper or lower
            If consecutive up happens, incremeent the count
            else set the count as 0
        */
        if(n == 1)
            return 0;
            
        
        int curr = 0;
        
        for(int i = 1;i<n;i++){
            if(arr[i] > arr[i - 1])
                curr++;
            else
                curr = 0;
            
            res = Math.max(res,curr);
        }
        
        return res;
    }
    
}
