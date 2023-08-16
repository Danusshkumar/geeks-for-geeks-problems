/*

Maximum Index : 
Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.

Approach:
Creating two auxiliary arrays : lMin and rMax which stores minimum element and maximum element from left and right respectively. 
Checking from left to right on both the arrays. 
Let's say checking first element of lMin with elements on rMax. Because we have a strong fact that if the current element on the rMax
is greater than lMin, then the condition will be true until the rMax changes it's value (until last 18).
Until this value, I'll increment the j pointer. By doing this, we increase the difference between j and i.

For example, if A = [9, 2, 3, 4, 5, 6, 7, 8, 18, 0], then LMin = [9, 2, 2, 2, 2, 2, 2, 2, 2, 0] and RMax = [18, 18, 18, 18, 18, 18, 18, 18, 18, 0].

if j < i then we increment i.
Repeat this process, until i or j reaches end. if i crosses, j then the value will be negative and it doesn't get stored in maxDifference. 

*/


class Solution{
    
    static int maxIndexDiff(int arr[], int N) { 
        int[] lMin = new int[N];
        int[] rMax = new int[N];
        
        int min = arr[0];
        int max = arr[N - 1];
        for(int i = 0;i<N;i++){
            lMin[i] = (arr[i] < min ) ? arr[i] : min;
            min = (arr[i] < min) ? arr[i] : min;
        }
        
        for(int i = N - 1; i>=0;i--){
            rMax[i] = (arr[i] > max) ? arr[i] : max;
            max = (arr[i] > max) ? arr[i] : max;
        }
        
        int i = 0, j = 0;
        int maxDifference = -1;
        while(i < N && j < N){
            if(lMin[i] <= rMax[j]){
                maxDifference = ( (j - i) > maxDifference) ? j - i : maxDifference;
                j = j + 1;
            }
            else {
                i = i + 1;
            }
        }
        return maxDifference;
    }
}
