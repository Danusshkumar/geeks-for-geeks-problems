/*

Problem stmt : Subarray with given sum

Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Explanation : refer problem solving - 2.md

*/


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        /*
            increase the right pointer until the sum is greater than or equal to target
            increase the left pointer until the sum is less than or equal to target
            If equal to target, return left, right pointer
            
            This can work with  sliding window technique
        */
        
        ArrayList<Integer> res = new ArrayList<>();
        int sum = arr[0], left = 0, right = 0;
        
        if(s == 0){
            res.add(-1);
            return res;
        }
        
        while(right < n){
            if(sum < s){
                right++;
                if(right < n)
                    sum += arr[right];
            }
            
            if(sum > s){
                sum -= arr[left];
                left++;
            }
            
            if(s == sum){
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
        }
        
        res.add(-1);
        return res;
    }
}
