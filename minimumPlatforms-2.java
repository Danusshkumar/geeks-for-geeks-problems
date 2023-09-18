/*

Train arrival and departure : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Sorting/video/MTQyNQ%3D%3D

*/
class Solution
{
    
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0,j = 0;
        
        int res = 0, max = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                max++;
                i++;
            }
            else if(dep[j] < arr[i]){
                max--;
                j++;
            }

            res = Math.max(res,max);
        }
        return res;
    }
    
}
/*
arr[i] == dep[j] is also taken into account and the value of i is incremented
In this case, the departure of j is not taken into account. But on the next iteration,
now arr[i] will be greater than dep[j] and now, j++ will occur such that departure of
the train will be taken into account and thus max will be reduced by one. Here we handled
the corner case technically using this correct approach instead of having special case handling for 
arr[i] == dep[j]

*/
