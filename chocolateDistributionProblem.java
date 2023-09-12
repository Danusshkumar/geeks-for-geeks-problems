/*

Chocolate Distribution Problem

Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Explanation : same as minimum difference problem. Refer absolute minimum difference in leetcode-problems repository

*/


class Solution
{
    public long findMinDiff (ArrayList<Integer> arr, int n, int m)
    {
        Collections.sort(arr);
        long minRes = Integer.MAX_VALUE;
        for(int i = 0;i<=(n - m);i++){
            long res = arr.get(i + m - 1) - arr.get(i);
            minRes = Math.min(minRes,res);
        }
        
        return minRes;
        
    }
}
