/*

Subarray with 0 sum

Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Explanation:
The function will return boolean value there is any subarray with sum = 0

We will calculate the prefix sum and if any prefix sum is 0 then return true 

We are adding the prefixSum to the hashSet. If there is prefix sum same for two position, then the subarray between those 
position have their subarray sum equal to 0. By this we can return true.
That's why we check if there is any prefix sum that is same as current prefix sum using prefixSum.contains() method in hashSet

*/


class Solution{
    static boolean findsum(int arr[],int n)
    {
        
        HashSet<Integer> prefixSum = new HashSet<Integer>();
        int sum = 0;
        
        for(int i : arr){
            
            sum += i;
            
            if(sum == 0 || prefixSum.contains(sum))
                return true;
            
            prefixSum.add(sum);
            
        }
        
        return false;
        
        
    }
}
